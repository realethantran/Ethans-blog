---
layout: default
title: My Project
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
      font-size: 24px;
      color: black;
  }
  .custom-font {
      font-family: "Supreme V1";
      color: black;
  }
  	#calculator {
    width: 300px;
    margin: 0 auto;
    background-color: #fff;
    border: 2px solid #000;
    border-radius: 10px;
    padding: 20px;
  }

  #result {
    width: 100%;
    margin-bottom: 10px;
    padding: 10px;
    font-size: 20px;
    border: 2px solid #000;
    border-radius: 5px;
  }

  button {
    width: 50px;
    height: 50px;
    font-size: 20px;
    border: 2px solid #000;
    border-radius: 5px;
    margin: 5px;
    cursor: pointer;
    background-color: #f0f0f0;
  }

  button:hover {
    background-color: #d0d0d0;
  }
</style>

<html>
<body>
  <h1>Simple Calculator</h1>
  <div id="calculator">
    <input type="text" id="result" readonly>
    <br>
    <button onclick="appendToResult('1')">1</button>
    <button onclick="appendToResult('2')">2</button>
    <button onclick="appendToResult('3')">3</button>
    <button onclick="appendToResult('+')">+</button>
    <br>
    <button onclick="appendToResult('4')">4</button>
    <button onclick="appendToResult('5')">5</button>
    <button onclick="appendToResult('6')">6</button>
    <button onclick="appendToResult('-')">-</button>
    <br>
    <button onclick="appendToResult('7')">7</button>
    <button onclick="appendToResult('8')">8</button>
    <button onclick="appendToResult('9')">9</button>
    <button onclick="appendToResult('*')">*</button>
    <br>
    <button onclick="appendToResult('0')">0</button>
    <button onclick="calculate()">=</button>
    <button onclick="clearResult()">C</button>
    <button onclick="appendToResult('/')">/</button>
  </div>
  
  <script>
    function appendToResult(value) {
      document.getElementById('result').value += value;
    }

    function clearResult() {
      document.getElementById('result').value = '';
    }

    function calculate() {
      try {
        const resultField = document.getElementById('result');
        const expression = resultField.value;
        const calculatedValue = eval(expression);
        resultField.value = calculatedValue;
      } catch (error) {
        resultField.value = 'Error';
      }
    }
  </script>
</body>
</html>


</html>
