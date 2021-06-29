package nl.kadaster.etc.etcbackendseed

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EtcBackendSeedApplication

fun main(args: Array<String>) {
	runApplication<EtcBackendSeedApplication>(*args)
}
