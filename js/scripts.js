// Contenido de texto extenso para cada módulo
const modules = {
    intro: {
        title: "Introducción al curso",
        sections: [
            { title: "¿Qué aprenderás?", content: "En este módulo se cubrirán los temas básicos que necesitas para iniciar." },
            { title: "Estructura del curso", content: "El curso está dividido en varios módulos, cada uno con ejercicios y evaluaciones." }
        ]
    },
    module1: {
        title: "Módulo 1: Fundamentos",
        sections: [
            { title: "Conceptos básicos", content: "Este capítulo abarca los fundamentos teóricos del tema." },
            { title: "Ejercicios prácticos", content: "Aquí encontrarás ejemplos prácticos para reforzar el aprendizaje." }
        ]
    },
    module2: {
        title: "Módulo 2: Avanzado",
        sections: [
            { title: "Temas avanzados", content: "Aprenderás a resolver problemas complejos y cómo aplicar los conceptos." },
            { title: "Herramientas avanzadas", content: "Uso de herramientas y recursos avanzados." }
        ]
    },
    module3: {
        title: "Módulo 3: Proyecto Final",
        sections: [
            { title: "Planeación del proyecto", content: "Cómo estructurar y planificar tu proyecto final." },
            { title: "Implementación", content: "Implementa lo aprendido en un proyecto completo." }
        ]
    }
};

// Función para cargar el módulo seleccionado
function loadModule(moduleKey) {
    const module = modules[moduleKey];
    if (module) {
        let content = `<h2>${module.title}</h2>`;
        module.sections.forEach(section => {
            content += `
                <div class="module-section">
                    <h4>${section.title}</h4>
                    <p>${section.content}</p>
                </div>
            `;
        });
        document.getElementById('module-content').innerHTML = content;
    }
}

function scrollToSection(sectionId) {
    document.getElementById(sectionId).scrollIntoView({ behavior: 'smooth' });
}
