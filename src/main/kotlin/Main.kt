fun main() {

    val fisica = Fisica()

    val forcaPeso = fisica.calcularForcaPeso(60.0, 9.8)
    val forcaCentripeta = fisica.calcularForcaCentripeta(60.0, 80.0, 100.0)
    val impulso = fisica.calcularImpulso(50.0, 30.0)
    val forcaElastica = fisica.calcularForcaElastica(48.0, 6.0)
    val velocidadeMedia = fisica.calcularVelocidadeMedia(0.0, 100.0, 0.0, 60.0)
    val movimentoRetilineoUniformemente = fisica.calcularMRU(3.0, 60.0, 0.0, 60.0)
    val movimentoRetilineoUnifomementeVariado = fisica.calcularMRUV(3.0, 50.0, 30.0, 29.0)

    println("Calculo de Força Peso: $forcaPeso")
    println("Calculo de Força Centrípeta: $forcaCentripeta")
    println("Calculo de Impulso: $impulso")
    println("Calculo de Força Elástica: $forcaElastica")
    println("Calculo de Velocidade Média: $velocidadeMedia ")
    println("Calculo de Movimento Retilíneo Uniforme: $movimentoRetilineoUniformemente")
    println("Calculo de Movimento Retilíneo Uniformemente Variado: $movimentoRetilineoUnifomementeVariado")

}