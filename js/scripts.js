// Contenido de texto extenso para cada módulo
const modules = {
    variables: {
        title: "Módulo 1: Tipos de Variables",
        sections: [
            { title: "Tipos de Variables", content: "En esta sección, aprenderás sobre los diferentes tipos de variables en Java, incluyendo int, float, double, char, boolean, y más." }
        ]
    },
    operators: {
        title: "Módulo 2: Operadores",
        sections: [
            { title: "Operadores", content: "En esta sección, aprenderás sobre los diferentes operadores en Java, incluyendo aritméticos, lógicos, relacionales, y más." }
        ]
    },
    conditionals: {
        title: "Módulo 3: Estructuras Condicionales",
        sections: [
            { title: "Estructuras Condicionales", content: "En esta sección, aprenderás sobre las estructuras condicionales en Java, incluyendo if, else, switch, y más." }
        ]
    },
    loops: {
        title: "Módulo 4: Bucles",
        sections: [
            { title: "Bucles", content: "En esta sección, aprenderás sobre los diferentes tipos de bucles en Java, incluyendo for, while, do-while, y más." }
        ]
    },
    arrays: {
        title: "Módulo 5: Arrays",
        sections: [
            { title: "Arrays", content: "En esta sección, aprenderás sobre los arrays en Java, incluyendo cómo declararlos, inicializarlos, y usarlos." }
        ]
    },
    methods: {
        title: "Módulo 6: Métodos",
        sections: [
            { title: "Métodos", content: "En esta sección, aprenderás sobre los métodos en Java, incluyendo cómo declararlos, llamarlos, y usarlos." }
        ]
    },
    io: {
        title: "Módulo 7: Entrada y Salida Básica",
        sections: [
            { title: "Entrada y Salida Básica", content: "En esta sección, aprenderás sobre la entrada y salida básica en Java, incluyendo cómo leer y escribir datos." }
        ]
    },
    exceptions: {
        title: "Módulo 8: Manejo de Excepciones",
        sections: [
            { title: "Manejo de Excepciones", content: "En esta sección, aprenderás sobre el manejo de excepciones en Java, incluyendo try, catch, finally, y más." }
        ]
    }
};

// Función para cargar el módulo seleccionado
// Función para cargar el módulo seleccionado
function loadModule(language, category, module) {
    const path = `/web/${language}/modules/${category}/${module}.html`;
    fetch(path)
        .then(response => response.text())
        .then(data => {
            document.getElementById('module-content').innerHTML = data;
        })
        .catch(error => console.error('Error loading module:', error));
}

function scrollToSection(sectionId) {
    document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
}
