plugins {
    alias(libs.plugins.test.spring.boot2)
    alias(libs.plugins.kotlin.noarg)
    alias(libs.plugins.kotlin.allopen)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.kotlin.jpa)
}

dependencies {
    @Suppress("VulnerableLibrariesLocal", "RedundantSuppression")
    implementation(libs.test.spring.boot2.jpa)
    implementation(libs.test.spring.boot2.p6spy)
    implementation(projects.example)
    implementation(projects.dslJpql)
    implementation(projects.renderJpql)
    implementation(projects.supportSpringDataJpaJavax)

    testImplementation(libs.test.spring.boot2.test)

    testRuntimeOnly(libs.test.h2)
}

kotlin {
    jvmToolchain(8)
}

noArg {
    annotation("com.linecorp.kotlinjdsl.example.jpql.spring.jpa.javax.annotation.CompositeId")
}

allOpen {
    annotation("com.linecorp.kotlinjdsl.example.jpql.spring.jpa.javax.annotation.CompositeId")
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.Embeddable")
}
