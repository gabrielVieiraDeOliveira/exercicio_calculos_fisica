import kotlin.math.pow

class Fisica {

    fun calcularForcaPeso(peso: Double, gravidade: Double) = peso * gravidade

    fun calcularForcaCentripeta(massa: Double, velocidade: Double, raio: Double) = velocidade.pow(velocidade) / raio * massa

    fun calcularImpulso(forca: Double, tempo: Double) = forca * tempo

    fun calcularForcaElastica(constanteElastica: Double, deformacao: Double) = constanteElastica * deformacao

    fun calcularVelocidadeMedia(posicaoInicial: Double, posicaoFinal: Double, tempoInicial: Double, tempoFinal: Double) = (posicaoFinal - posicaoInicial) / (tempoFinal * tempoInicial)

    fun calcularMRU(posicaoInicial: Double, velocidade: Double, tempoInicial: Double, tempoFinal: Double) = posicaoInicial + velocidade * (tempoFinal - tempoInicial)

    fun calcularMRUV(posicaoInicial: Double, velocidade: Double, tempo: Double, aceleracao: Double) = (tempo.pow(tempo) * aceleracao / 2) + tempo * velocidade + posicaoInicial

}