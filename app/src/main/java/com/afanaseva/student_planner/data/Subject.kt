package com.afanaseva.student_planner.data

data class Subject(
    val id : String,
    val name : String,
    val professor : String,
    val credits : Int,
    val currentGrade : String,
    val description : String,

)
val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "Отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose."
    ),
    Subject(
        id = "2",
        name = "Системное программирование",
        professor = "Токаев Т.И.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Низкоуровневая разработка на языке Rust: управление памятью без сборщика мусора, многопоточность, работа с операционной системой и создание высокопроизводительных системных компонентов."
    ),
    Subject(
        id = "3",
        name = "Управления проектами",
        professor = "Трошина В.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Обучаемся работать в майкрософт прожект. Создаю таблицу и выполняем задания"
    ),
    Subject(
        id = "4",
        name = "Математическое моделирования",
        professor = "Трошина В.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Решаем задачи"
    ),
    Subject(
        id = "5",
        name = "ОФКС",
        professor = "Ушакова",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Разбираем как компьютер работатет"
    ),
    Subject(
        id = "6",
        name = "Разработка программных модулей",
        professor = "Донскова Д.В.",
        credits = 75,
        currentGrade = "Хорошо",
        description = "Разбираемся c# делаем wpf"
    )
)