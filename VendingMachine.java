public class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;
    
    private VendingMachineState currentState;
    
    private int inventory;
    private int balance;

    public VendingMachine(int inventory) {
        this.idleState = new IdleState();
        this.itemSelectedState = new ItemSelectedState();
        this.dispensingState = new DispensingState();
        this.outOfOrderState = new OutOfOrderState();
        
        this.currentState = idleState;
        this.inventory = inventory;
        this.balance = 0;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertCoin() {
        currentState.insertCoin(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    // Getters for state objects
    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }

    // Inventory and balance management
    public int getInventory() {
        return inventory;
    }

    public void reduceInventory() {
        if (inventory > 0) {
            inventory--;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void resetBalance() {
        balance = 0;
    }
}