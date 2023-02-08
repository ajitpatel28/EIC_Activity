function analyzeResults()
{
   let team1Name = document.getElementById("team1Name").value;
let team2Name = document.getElementById("team2Name").value;
let team1Score = document.getElementById("team1Score").value;
let team2Score = document.getElementById("team2Score").value;
let result = document.getElementById("result");
if (team1Name === team2Name) {
alert("Both team names cannot be the same");
return;
}
if (!/^\d+\/\d+$/.test(team1Score) || !/^\d+\/\d+$/.test(team2Score)) {
alert("Score should be in the format 'runs/wickets', e.g. '126/10'");
return;
}
let team1Wickets = parseInt(team1Score.split("/")[1]);
let team2Wickets = parseInt(team2Score.split("/")[1]);
if (team1Wickets > 10 || team2Wickets > 10) {
alert("Number of wickets cannot be more than 10");
 return;
}

let team1Runs = parseInt(team1Score.split("/")[0]);
let team2Runs = parseInt(team2Score.split("/")[0]);

if (team1Runs == team2Runs) {
result.innerHTML = `Match Tied`;
}

else if (team1Runs > team2Runs) {
result.innerHTML = `${team1Name} wins by ${team1Runs - team2Runs} runs`;
}
else{
result.innerHTML = `${team2Name} wins by ${team2Runs - team1Runs} runs`;
}
}