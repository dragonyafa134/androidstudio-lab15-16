package com.afanaseva.student_planner.data

data class ScheduleLesson(
    val id : String,
    val dayOfWeek: String,
    val timeStart: String,
    val timeEnd: String,
    val subjectName: String,  )

val sampleSchedule = listOf(
    ScheduleLesson(
        id = "mon_1",
        dayOfWeek = "Понедельник",
        timeStart = "09:00",
        timeEnd = "10:35",
        subjectName = "Разработка мобильных приложений"
    ),

    ScheduleLesson(
        id = "tue_1",
        dayOfWeek = "Вторник",
        timeStart = "09:00",
        timeEnd = "10:35",
        subjectName = "Системное программирование"
    ),
    ScheduleLesson(
        id = "tue_2",
        dayOfWeek = "Вторник",
        timeStart = "12:30",
        timeEnd = "14:05",
        subjectName = "ОКСФКС"
    ),
    ScheduleLesson(
        id = "wed_1",
        dayOfWeek = "Среда",
        timeStart = "10:45",
        timeEnd = "12:20",
        subjectName = "Математическое моделирования",

        ),
    ScheduleLesson(
        id = "thu_1",
        dayOfWeek = "Четверг",
        timeStart = "09:00",
        timeEnd = "10:35",
        subjectName = "Системное программирование"
    )
)