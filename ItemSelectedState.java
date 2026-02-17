public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coin or cancel.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin inserted.");
        machine.addBalance(1);
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getBalance() > 0 && machine.getInventory() > 0) {
            System.out.println("Dispensing item...");
            machine.setState(machine.getDispensingState());
        } else if (machine.getBalance() <= 0) {
            System.out.println("Please insert coin first.");
        } else {
            System.out.println("Item out of stock.");
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(machine.getOutOfOrderState());
    }
}