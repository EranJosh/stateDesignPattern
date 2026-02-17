public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(5);
        
        System.out.println("=== Test Case 1: Normal Flow ===");
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
        
        System.out.println("\n=== Test Case 2: Invalid Operations in Idle State ===");
        machine.insertCoin();
        machine.dispenseItem();
        
        System.out.println("\n=== Test Case 3: Invalid Operations in ItemSelected State ===");
        machine.selectItem();
        machine.selectItem();
        
        System.out.println("\n=== Test Case 4: Dispensing without coin ===");
        machine.selectItem();
        machine.dispenseItem();
        
        System.out.println("\n=== Test Case 5: Out of Order State ===");
        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin();
        machine.dispenseItem();
    }
}