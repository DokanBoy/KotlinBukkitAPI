object Dep {
    const val spigot = "org.spigotmc:spigot-api:${Versions.spigotApi}"
    const val bstats = "org.bstats:bstats-bukkit:${Versions.bstats}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val skedule = "com.okkero.skedule:skedule:${Versions.skedule}"
    const val hikariCp = "com.zaxxer:HikariCP:${Versions.hikari}"
    const val kaml = "com.charleskorn.kaml:kaml:${Versions.kaml}"
    const val serializationCore = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.serialization}"

    const val snakeYml = "org.snakeyaml:snakeyaml-engine:${Versions.snakeYaml}"

    object Exposed {
        const val core = "org.jetbrains.exposed:exposed-core:${Versions.exposed}"
        const val jdbc = "org.jetbrains.exposed:exposed-jdbc:${Versions.exposed}"
        const val dao = "org.jetbrains.exposed:exposed-dao:${Versions.exposed}"
        const val javaTime = "org.jetbrains.exposed:exposed-java-time:${Versions.exposed}"
    }

    object Versions {
        const val kotlin = "1.4.31"
        const val serialization = "1.1.0"
        const val exposed = "0.29.1"
        const val hikari = "4.0.3"
        const val bstats = "2.2.1"
        const val spigotApi = "1.12.2-R0.1-SNAPSHOT"
        const val kaml = "0.28.3"
        const val coroutines = "1.4.3"
        const val skedule = "1.2.6"

        const val snakeYaml = "2.2.1"
    }
}