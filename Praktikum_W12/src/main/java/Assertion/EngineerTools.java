/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assertion;

    import java.util.ArrayList;
    import java.util.Arrays;

    class EngineerTools {
        ArrayList<String> EngTools;
        ArrayList<String> DataOpsTools;

        EngineerTools() {
            this.EngTools = new ArrayList<>(Arrays.asList(
                                                "Docker", "Kubernetes", "OpenShift", 
                                                "Tableau", "MongoDB", "ElasticSearch", 
                                                "Spark", "TensorFlow", "PyTorch"
                                                )
                                            );
            this.DataOpsTools = new ArrayList<>(Arrays.asList("Docker", "Kubernetes", "OpenShift"));
            // this.DataOpsTools = new ArrayList<>(Arrays.asList("Pandas"));
        }

        void removeDataOpsTools() {
          try{ 
            // assert this.EngTools.removeAll(this.DataOpsTools): "Failed to remove!";
            boolean result = this.EngTools.removeAll(this.DataOpsTools); 
            assert result: "Failed to remove!"; 
          }catch(AssertionError e){
            System.out.println(e.getMessage());
          }
        }

        void displayDataOpsTools() {
          System.out.println(Arrays.toString(this.EngTools.toArray()));
        }
    }