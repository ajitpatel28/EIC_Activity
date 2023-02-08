function calculateRuns() { 
    var input = document.getElementById("runs").value; 
    var runs = input.split(","); 
    var totalRuns = 0; 
    if(runs.length > 5){
        document.getElementById("result").innerHTML = "Invalid Input";
    }
    else{
        
        for (var i = 0; i < runs.length; i++) { 
            if(i != 4){
                totalRuns += parseInt(runs[i]) * (i + 1); 
                document.getElementById("result").innerHTML = "Total Runs: " + totalRuns; 
            }
            else{
                totalRuns += parseInt(runs[i]) * (i + 2); 
                document.getElementById("result").innerHTML = "Total Runs: " + totalRuns; 
            }
            
            } 
            
    }
        } 