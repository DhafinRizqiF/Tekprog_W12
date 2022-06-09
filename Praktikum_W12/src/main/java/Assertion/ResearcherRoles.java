/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assertion;

class ResearcherRoles {
    String ResRole = null;
    
    void setRole(String ResRole) {
        this.ResRole = ResRole;
    }

    String getRole() {
        return this.ResRole; 
    }

	void displayRoleDesc() {
        switch (ResRole) {
            case "Research Scientist":
              System.out.println("Research Scientist deep dives complicated problems, which may or may not have a direct business outcome. Think of them as sowing the seed to what will become future products. Think of image classification before it became mainstream and implemented in products, or people working on testing new deep neural network architectures.");
              break;
            case "Statistician":
              System.out.println("Statisticians can help answer more complex questions with statistical rigour. This is the case in biostatistics where statisticians can help in designing and analyzing clinical trials and help provide the regulatory submissions.");
              break;
            case "Economist":
              System.out.println("Economists work on leveraging data and economic theory for the good of companies. That can involve designing auction systems for ads, or working on predicting economic trends for risk assessment and capital allocation.");
              break;
            default:
              assert false: ResRole + " is invalid research role";
        }
	}
}