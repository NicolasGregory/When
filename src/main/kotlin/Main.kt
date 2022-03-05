fun main(args: Array<String>) {
    
}
fun populacao(): Unit{
    println("Informe o número de habitantes:")
    val pop = readLine()!!.toFloat()
    println("Digite o número de crianças nascidas:")
    val born = readLine()!!.toFloat()
    println("Digite o número de óbitos")
    val dead = readLine()!!.toFloat()
    println("Escolha o que calcular:\n1 - Taxa de natalidade\n2 - Taxa de mortalidade")

    when(readLine()!!.toInt()){
        1 -> println("A taxa de natalidade é ${(born * 1000) / pop}")
        2 -> println("A subtração é ${(dead * 1000) / pop}")
        else -> println("Operação inválida!!!")
    }
}
fun pagamento(): Unit{
    println("Informe o valor à pagar:")
    val cost = readLine()!!.toFloat()
    println("Escolha a forma de pagamento:\n1 - À vista\n2 - À prazo(30 dias)\n3 - À prazo parcelado")
    val disc = (cost * 0.03)
    val parc = (cost * 0.015)

    when(readLine()!!.toInt()){
        1 -> println("O total à ser pago é R$${cost - disc}")
        2 -> println("O total à ser pago é R$${cost + disc}")
        3 -> println("O total a ser pago é R$${cost + (12 * (cost * parc))}")
    }

}