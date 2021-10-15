class Tree {
  private String treeName;
  private String treeType;
  private String leafColor;
  private boolean leavesFall = false;

  String getTreeName(){
    return treeName;
  }

  String getTreeType(){
    return treeType;
  }

  String getLeafColor(){
    return leafColor;
  }

  boolean getLeavesFall(){
    return leavesFall;
  }

  void setTreeName(String theTreeName) {    
    treeName = theTreeName;    
  }  
  
  void setTreeType(String theTreeType) {    
    treeType = theTreeType;  
  }  
    
  void setLeafColor(String theLeafColor) {    
    leafColor = theLeafColor;  
  }

  void leavesFall(boolean doLeavesFall) {    
    leavesFall = doLeavesFall; 
  }

  void print() {
    String doLeavesFall = "does not";
  if(getLeavesFall() == true) {
    doLeavesFall = "does";
  }
  else {
    doLeavesFall = "does not";
  }
  System.out.println("This is a " + treeName + ". It is a " + treeType + " and its leaves are currently " + leafColor +  ". It " + doLeavesFall + " lose its leaves for the winter.");
  }

  Tree() {
      treeName = " ";
      treeType = " ";
      leafColor = " ";
      leavesFall = false;
    }

  Tree(String aTreeName, String aTreeType, String aLeafColor, boolean doLeavesFall) {
    treeName = aTreeName;
    treeType = aTreeType;
    leafColor = aLeafColor;
    leavesFall = doLeavesFall;
  }
}
