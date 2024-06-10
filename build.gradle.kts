plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("checkFile") {
    val file = file("C:\\Users\\User\\Desktop\\лiтнiй трим\\автоматизацiя\\Java_HW_3\\HW_3\\app\\src\\main\\java\\org\\example\\MainApp.java")
    doLast {
        if (file.exists()) {
            println("File ${file} exists.")
        } else {
            println("File ${file} does not exist.")
        }
    }
}

tasks.register("buildProject") {
    dependsOn(":app:build")
    doLast {
        println("Project build successfully.")
    }
}
