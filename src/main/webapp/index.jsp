<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" svg PUBLIC "-//W3C//DTD SVG 20010904//EN"
"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd">


<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Home</title>
    <link rel="stylesheet" href="resources/css/tundra.css">

    <script type="text/javascript" src="resources/js/main.js"></script>
    <script type="text/javascript" src="resources/js/jquery.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/js/jquery.dataTables.min.js"></script>
    <script type="text/javascript" src="resources/js/bootstrapValidator.js"></script>

    <!-- Estilo para botón seleccionado -->
    <style>

        .cat-ico {
            width: 90px;
            height: 90px;
        }
        .button-selected {
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.6); /* Efecto de sombra */
            /* Otros estilos para el botón seleccionado */
            background-color: #3446D3;
        }
        .button-selected img {

            /* Otros estilos para la imagen cuando el botón está seleccionado */
            fill: #D8DEE9;
        }
    </style>

</head>
<body>


<div class="layout2 default-background">
    <form class="frm-main" method="post" action="usuarioServlet" id="frmUsuario">
        <input type="hidden" name="txt_accion" id="txt_accion" value=""/>
        <section class="left-icons">
            <button type="button" class="icon-containers category-button" onclick="setSelected(this)">
                <svg class="icons-nav cat-ico" version="1.0" xmlns="http://www.w3.org/2000/svg"
                     width="96.000000pt" height="96.000000pt" viewBox="0 0 96.000000 96.000000"
                     preserveAspectRatio="xMidYMid meet">
                    <g class="g-ico" transform="translate(0.000000,96.000000) scale(0.100000,-0.100000)"
                       fill="#000000" stroke="none">
                        <path d="M412 869 c-48 -14 -109 -80 -123 -131 -23 -89 12 -182 88 -229 57 -36 154 -34 210 3 62 41 88 90 88 168 0 77 -26 127 -85 166 -43 29 -125 39 -178 23z"/>
                        <path d="M185 375 c-29 -28 -34 -94 -11 -148 18 -45 88 -103 150 -124 72 -25 232 -24 308 1 67 22 135 76 154 123 23 54 18 120 -11 148 l-24 25 -271 0 -271 0 -24 -25z"/>
                    </g>
                </svg>
            </button>
            <button type="button" class="icon-containers category-button" onclick="setSelected(this)">
                <svg class="icons-nav cat-ico" version="1.0" xmlns="http://www.w3.org/2000/svg"
                     width="64.000000pt" height="64.000000pt" viewBox="0 0 64.000000 64.000000"
                     preserveAspectRatio="xMidYMid meet">

                    <g class="g-ico" transform="translate(0.000000,64.000000) scale(0.100000,-0.100000)"
                       fill="#000000" stroke="none">
                        <path d="M79 521 c-24 -19 -24 -22 -24 -201 0 -239 -23 -220 265 -220 288 0
265 -19 265 220 0 239 23 220 -265 220 -200 0 -220 -2 -241 -19z m410 -157
c-92 -95 -178 -118 -254 -68 -46 31 -115 94 -115 106 0 17 27 7 51 -18 43 -46
110 -84 149 -84 40 0 105 37 154 89 20 21 33 28 40 21 7 -7 -1 -22 -25 -46z"/>
                    </g>
                </svg>
            </button>
            <button type="button" class="icon-containers category-button" onclick="setSelected(this)">
                <svg  class="icons-nav cat-ico"  version="1.0" xmlns="http://www.w3.org/2000/svg"
                     width="30.000000pt" height="30.000000pt" viewBox="0 0 30.000000 30.000000"
                     preserveAspectRatio="xMidYMid meet">

                    <g  class="g-ico" transform="translate(0.000000,30.000000) scale(0.100000,-0.100000)"
                       fill="#000000" stroke="none">
                        <path d="M57 264 c-4 -4 -7 -38 -7 -76 l0 -68 30 0 c23 0 33 -6 42 -25 6 -14
20 -25 30 -25 11 0 23 11 28 25 7 19 17 25 40 25 l31 0 -3 73 -3 72 -90 3
c-50 1 -94 0 -98 -4z m53 -34 c0 -5 -4 -10 -10 -10 -5 0 -10 5 -10 10 0 6 5
10 10 10 6 0 10 -4 10 -10z m100 0 c0 -5 -18 -10 -40 -10 -22 0 -40 5 -40 10
0 6 18 10 40 10 22 0 40 -4 40 -10z m-100 -40 c0 -5 -4 -10 -10 -10 -5 0 -10
5 -10 10 0 6 5 10 10 10 6 0 10 -4 10 -10z m100 0 c0 -5 -18 -10 -40 -10 -22
0 -40 5 -40 10 0 6 18 10 40 10 22 0 40 -4 40 -10z m-100 -40 c0 -5 -4 -10
-10 -10 -5 0 -10 5 -10 10 0 6 5 10 10 10 6 0 10 -4 10 -10z m100 0 c0 -5 -18
-10 -40 -10 -22 0 -40 5 -40 10 0 6 18 10 40 10 22 0 40 -4 40 -10z"/>
                        <path d="M37 93 c-12 -11 -8 -68 5 -81 8 -8 47 -12 109 -12 109 0 122 7 117
62 -3 29 -7 33 -35 36 -24 2 -33 -1 -38 -17 -12 -38 -78 -39 -90 0 -6 19 -53
28 -68 12z"/>
                    </g>
                </svg>

            </button>
            <button type="button" class="icon-containers category-button" onclick="setSelected(this)">
                <svg class="icons-nav cat-ico" version="1.0" xmlns="http://www.w3.org/2000/svg"
                     width="48.000000pt" height="48.000000pt" viewBox="0 0 48.000000 48.000000"
                     preserveAspectRatio="xMidYMid meet">

                    <g class="g-ico" transform="translate(0.000000,48.000000) scale(0.100000,-0.100000)"
                       fill="#000000" stroke="none">
                        <path d="M154 381 c-36 -22 -50 -54 -58 -133 -6 -52 -3 -61 24 -101 69 -103
168 -112 227 -20 10 15 26 34 36 42 19 14 19 15 -1 106 -12 55 -21 69 -65 99
-47 32 -117 35 -163 7z m149 -33 c41 -29 47 -38 47 -66 0 -23 -1 -22 -26 7
l-26 31 -27 -20 c-16 -10 -48 -22 -72 -26 -24 -3 -50 -13 -56 -22 -11 -14 -13
-11 -13 16 0 41 17 78 44 90 37 18 94 14 129 -10z m19 -120 c11 -36 10 -42 -7
-54 -10 -8 -34 -14 -52 -14 -27 0 -33 -4 -33 -21 0 -22 0 -22 75 -3 18 5 17 3
-4 -16 -13 -11 -34 -23 -47 -26 -31 -8 -92 30 -100 61 -3 13 -12 26 -20 29
-19 7 -18 26 1 26 9 0 18 6 21 14 3 8 24 17 47 20 23 4 53 13 67 21 31 17 37
13 52 -37z"/>
                    </g>
                </svg>

            </button>
        </section>
        <div class="rigth-panel-contain">

        </div>
    </form>
</div>
</body>

</html>
