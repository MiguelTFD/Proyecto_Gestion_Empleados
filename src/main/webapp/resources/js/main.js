
function setSelected(button) {
    // Remover la clase 'button-selected' de todos los botones
    const buttons = document.querySelectorAll('.category-button');
    buttons.forEach(btn => {
        btn.classList.remove('button-selected');
    });
    // Agregar la clase 'button-selected' al botón presionado
    button.classList.add('button-selected');

    // Remover la sombra de las imágenes en todos los botones
    const icos = document.querySelectorAll('.g-ico');
    icos.forEach(ico => {
        ico.style.fill = 'currentColor';
    });

    // Agregar la sombra a la imagen del botón presionado
    const ico = button.querySelector('.g-ico');
    ico.style.fill = '#D8DEE9';
}

