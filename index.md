---
layout: default
title: Ethan's Blog
---

<style>
  @font-face {
  font-family: "Supreme V1";
  src: url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.eot");
  src: url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.eot?#iefix")format("embedded-opentype"),
  url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.woff2")format("woff2"),
  url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.woff")format("woff"),
  url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.ttf")format("truetype"),
  url("https://db.onlinewebfonts.com/t/f462af0a8168d0a315da1c8d3fcf419b.svg#Supreme V1")format("svg");
}
  body {
      font-family: Arial, sans-serif;
      line-height: 1.6;
      background-color: white;
  }

  h1 {
      color: black;
  }
  .custom-font {
      font-family: "Supreme V1";
      color: black;
  }
  table {
    border-collapse: collapse;
    width: 100%;
    border: 1px solid black;
  }
  th, td {
      padding: 8px;
      text-align: left;
      border-bottom: 1px solid black;
  }
  th {
      background-color: white;
  }
  p {
    font-size: 11px;
    color: black;
  }
</style>

<h1 class="custom-font" font-size="25px">Ethan Tran's Website</h1>

<button onClick="altTheme()">Alternate Theme</button>
<button onClick="revertColor()">Revert</button>

<script>
    function altTheme() {
        document.body.style.backgroundColor =  "rgb(44, 45, 48)";
        document.querySelectorAll(".custom-font").forEach(element => {
            element.style.color = "white"; 
         document.querySelectorAll(".h1").forEach(element => {
            element.style.color = "white"; 
            });
        });
    }
    function revertColor() {
        document.body.style.backgroundColor = "white";
        document.querySelectorAll(".custom-font").forEach(element => {
        element.style.color = "black"; 

    });
    }
</script>

### My Freeform Drawing

<p>I can't wait to code, code, code!</p>

<img src="https://github.com/nighthawkcoders/student/assets/109186517/3a8cec44-415a-4821-8c2d-88bea49f75c6" height="275px">

<head>
</head>
<body>
    <h1 class="custom-font">My Schedule</h1>
    <table>
        <thead>
            <tr>
                <th>Period</th>
                <th>Class</th>
                <th>Teacher</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>AP Computer Science A</td>
                <td>Mr. Mortensen</td>
            </tr>
            <tr>
                <td>2</td>
                <td>AP English Language</td>
                <td>Mrs. Jenkins</td>
            </tr>
            <tr>
                <td>3</td>
                <td>AP U.S. History</td>
                <td>Mr. Swanson</td>
                </tr>
                       <tr>
                <td>4</td>
                <td>AP Calculus AB</td>
                <td>Mr. Froom</td>
            </tr>
        
