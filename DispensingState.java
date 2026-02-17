public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please wait, dispensing in progress.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed.");
        machine.reduceInventory();
        machine.resetBalance();
        machine.setState(machine.getIdleState());
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Please wait, dispensing in progress.");
    }
}