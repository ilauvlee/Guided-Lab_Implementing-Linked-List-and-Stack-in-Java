public class Main {
    public static void main(String[] args) {
        // 1. Create the nodes for our tree
        // We'll use String data for this example
        TreeNode<String> root = new TreeNode<>("CEO");

        TreeNode<String> vpEngineering = new TreeNode<>("VP of Engineering");
        TreeNode<String> vpMarketing = new TreeNode<>("VP of Marketing");
        TreeNode<String> vpSales = new TreeNode<>("VP of Sales");

        TreeNode<String> dirSoftware = new TreeNode<>("Director of Software");
        TreeNode<String> dirHardware = new TreeNode<>("Director of Hardware");

        TreeNode<String> dirContent = new TreeNode<>("Director of Content");
        TreeNode<String> dirSocial = new TreeNode<>("Director of Social Media");

        TreeNode<String> managerFrontend = new TreeNode<>("Manager, Frontend");
        TreeNode<String> managerBackend = new TreeNode<>("Manager, Backend");
        
        // 2. Build the hierarchy
        // The CEO (root) has three VPs
        root.addChild(vpEngineering);
        root.addChild(vpMarketing);
        root.addChild(vpSales);

        // The VP of Engineering has two Directors
        vpEngineering.addChild(dirSoftware);
        vpEngineering.addChild(dirHardware);
        
        // The VP of Marketing has two Directors
        vpMarketing.addChild(dirContent);
        vpMarketing.addChild(dirSocial);

        // The Director of Software has two Managers
        dirSoftware.addChild(managerFrontend);
        dirSoftware.addChild(managerBackend);

        // 3. Create the Tree object, setting the root
        Tree<String> companyOrgChart = new Tree<>(root);

        // 4. Print the entire tree
        System.out.println("Company Organizational Chart:");
        companyOrgChart.printTree();
    }
}
