/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assertion;

class EngineerRoles {
    String EngRole = null;
    
    void setRole(String EngRole) {
        this.EngRole = EngRole;
    }

    String getRole() {
        return this.EngRole; 
    }

	void displayRoleDesc() {
        switch (EngRole) {
            case "Data Engineer":
              System.out.println("Their core function is in the ingestion, structuring and standardization and processing of data. Their role has evolved quite a lot over the past few years and now involves dealing with both analytical and production systems.");
              break;
            case "Machine Learning Engineer":
              System.out.println("They are a very specialized type of backend software engineer focusing on leveraging data. They operationlize and put predictive models into production, building pipelines, api and training models.");
              break;
            case "Product Analyst":
              System.out.println("Product Analyst help define the strategic direction for product development by pushing for data driven decision making. They are in charge of estimating the potential impact of the product components, analysing user behaviour data, working for the engineering team to setup and analyze A/B tests, setup goals and tracking the performance against these goals. Their toolset mainly consists of SQL and Dashboarding tools, but may involve more advanced technologies or leveraging tools such as google analytics.");
              break;
            case "Data Product Owner":
              System.out.println("Data Product Owner help organize the overall direction of products leveraging data. They help define the different requirements, own the product roadmap, liaise with stakeholders as well as tackle some project management tasks, such coordinating the acquisition of the necessary training data for a Machine Learning project.");
              break;
            case "Data Vizualization Engineer":
              System.out.println("Data Vizualization Engineer make data looks beautiful. They typically work as part of a product team setting up dashboard within applications. They typically leverage Javascript for this purpose, using libraries such as D3js, VisGL and leafletJS.");
              break;
            case "Data Ops":
              System.out.println("Data Ops help setup the data infrastructure, help handle code deployment, setup data quality checks and alerting & monitoring for the different flows.");
              break;
            default:
              assert false: EngRole + " is invalid engineer role";
        }
	}
}

