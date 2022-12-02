<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            height: 100%;
            margin: 0;
            background-color: black;
            color: transparent;
        }
        h1{
            margin-top: 120px;
            color: azure;
            font-size: 40px;
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            text-align: center;
            left: 400px;
        }
        h1:hover{
            font-size: 42px;
            color: beige;
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            text-align: center;
            left: 400px;
        }
        .form1{
            background: transparent linear-gradient(to top left, rgba(249, 208, 129, .2) 0%, rgba(227, 2, 62, .2) 40%, rgba(49, 128, 135, .2) 100%);
            size: 40px;
            text-align: center;
            margin-left: 444px;
            height: 3rem;
            width: 25rem;
            background: transparent linear-gradient(to top left, rgba(249, 208, 129, .2) 0%, rgba(227, 2, 62, .2) 40%, rgba(49, 128, 135, .2) 100%);
            border: dashed transparent;
            border-radius: 9px;
            border-image-source: linear-gradient(to top left, rgba(249, 208, 129, 1) 0%, rgba(227, 2, 62, 1) 40%, rgba(49, 128, 135, 1) 100%);
            border-image-slice: 2;
            color: white;
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            font-size: 25px;
            text-align: center;
        ;
        }
        .gradient-button {
            position: absolute;
            z-index: 1;
            margin-top: 30px;
            display: block;
            top: calc(50% - 2.5rem - 5px);
            margin-left: 550px;
            height: 5rem;
            width: 12rem;
            background: transparent linear-gradient(to top left, rgba(249, 208, 129, .2) 0%, rgba(227, 2, 62, .2) 40%, rgba(49, 128, 135, .2) 100%);
            border: solid transparent;
            border-image-source: linear-gradient(to top left, rgba(249, 208, 129, 1) 0%, rgba(227, 2, 62, 1) 40%, rgba(49, 128, 135, 1) 100%);
            border-image-slice: 1;
            transition: transform .25s;
            letter-spacing: .2rem;
            font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
            font-size: 1.25rem;
            font-weight: 300;
            text-align: center;
            text-decoration: none;
            text-transform: uppercase;
            color: #333;
        }

        .gradient-button::after {
            z-index: -1;
            background: transparent linear-gradient(to bottom left, rgba(249,208,129,.25) 10%, rgba(227,2,62,.25) 30%, rgba(49,128,135,.25) 90%);
            border-image-source: linear-gradient(to bottom left, rgba(249,208,129,1) 10%, rgba(227,2,62,1) 30%, rgba(49,128,135,1) 90%);
            transition: opacity 1s;
        }

        .gradient-button:active {
            transform: scale(.96);}

        .gradient-button::before {
            opacity: 1;
        }

        .gradient-button::before {
            @include buttonLayer;
            z-index: 0;
            border-image-source: linear-gradient(to bottom left, rgba(249,208,129,1) 20%, rgba(227,2,62,1) 40%, rgba(49,128,135,1) 70%);
            transition: opacity .5s;
        }

        .gradient-button:hover::after {
            opacity: 1;
        }
    </style>
    <title>Found!</title>
</head>
<body>

<h2>${companyName}</h2>
<p>${domain}</p>

</body>
</html>


