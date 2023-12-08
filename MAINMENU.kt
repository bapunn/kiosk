package com.example.myapplication

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main()= runBlocking{
    fun start(){
        println("SHAKESHACK BURGER 에 오신걸 환영합니다.")
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
    }
    var wait:Int = 0
    var sales:Double = 0.0
    var continueLoop = true
    val ProductsMenus = listOf(ShacBurger(), SmokeShack(), ShroomBurger(), CheeseBurger(), Hamburger(),VanillaCookiesCreamShake(),MintCookiesCreamShake(),
        ClassicHandSpunShakes(),Floats(),CupCone(),RaspberryLemonade(),Lemonade(),FreshBrewedIcedTea(),FiftyFiftyTM(),FountainSoda())
    val menuItems = listOf(Burger(), FrozenCustard(), Drink(), Order(),Cancle())
    val selectedproducts: MutableList<PRODUCTS> = mutableListOf()
    val saledproducts: MutableList<PRODUCTS> = mutableListOf()
    do {
        start()
        menuItems.forEachIndexed { index, item ->
            println("${index + 1}. ${item.name} | ${item.explanation}")


        }
        val userInput = readLine()?.trim()?.lowercase()
        when (userInput) {
            "exit" -> {
                continueLoop = false
            }

            "burger" -> {
                start()
                var userCategory = "burger"
                val productsInCategory = ProductsMenus.filter { it.category == userCategory }

                productsInCategory.forEachIndexed { index, item ->
                    println("${index + 1}. ${item.name} | ${item.price} | ${item.explanation}")
                }
                val burgerIn = readLine()?.trim()?.lowercase()
                when (burgerIn) {
                    "shacburger" -> {
                        val selectedIndex = 0
                        if (selectedIndex in 0 until productsInCategory.size) {
                            val selectedProduct = productsInCategory[selectedIndex]
                            println("선택한 상품 정보:")
                            println("${selectedProduct.name}|W${selectedProduct.price}|${selectedProduct.explanation}")
                            println("이 메뉴를 장바구니에 추가하시겠습니까?")
                            println("1.확인  2.취소를 입력해주세요")


                        val userDecision = readLine()?.trim()?.lowercase()
                        when (userDecision) {
                            "1" -> {
                                    selectedproducts.add(productsInCategory[selectedIndex])
                                    println("${selectedProduct.name} 장바구니에 추가되었습니다")

                                }

                            "2" -> {}
                        }
                    }
                    }


                    "smokeshack" -> {
                        val selectedIndex = 1
                        if (selectedIndex in 0 until productsInCategory.size) {
                            selectedproducts.add(productsInCategory[selectedIndex])
                            println("선택하신 상품을 장바구니에 담았습니다.")
                        }
                    }

                    "shroomburger" -> {
                        val selectedIndex = 2
                        if (selectedIndex in 0 until productsInCategory.size) {
                            selectedproducts.add(productsInCategory[selectedIndex])
                            println("선택하신 상품을 장바구니에 담았습니다.")
                        }
                    }

                    "cheeseburger" -> {
                        val selectedIndex = 3
                        if (selectedIndex in 0 until productsInCategory.size) {
                            selectedproducts.add(productsInCategory[selectedIndex])
                            println("선택하신 상품을 장바구니에 담았습니다.")
                        }
                    }

                    "hamburger" -> {
                        val selectedIndex = 4
                        if (selectedIndex in 0 until productsInCategory.size) {
                            selectedproducts.add(productsInCategory[selectedIndex])
                        }
                    }
                }
            }

            "frozencustard" -> {
                start()
                val userCategory = "frozencustard"
                ProductsMenus.filter { it.category == userCategory }
                    .forEachIndexed { index, item ->
                        println("${index + 1}. ${item.name} | ${item.price} | ${item.explanation}")
                    }
            }

            "drink" -> {
                val userCategory = "drink"
                ProductsMenus.filter { it.category == userCategory }
                    .forEachIndexed { index, item ->
                        println("${index + 1}. ${item.name} | ${item.price} | ${item.explanation}")
                    }
            }

            "order" -> {
                println("주문 목록")
                val totalPrice = selectedproducts.sumOf { it.price }
                if (selectedproducts.isEmpty()) {
                    println("주문 목록이 비어있습니다.")
                } else {

                    selectedproducts.forEachIndexed { index, item ->
                        println("${index + 1}. ${item.name} | ${item.price} | ${item.explanation}")
                    }

                    println("총 주문 가격: $totalPrice")
                }
                println("주문하려면 '1'를, 나가려면 '2'을 입력하세요")
                val userDecision = readLine()?.trim()?.lowercase()
                when (userDecision) {
                    "1" -> {

                        sales += totalPrice
                        wait += 1
                        saledproducts.addAll(selectedproducts)
                        selectedproducts.clear()
                        println("대기번호는 [${wait}]번입니다.")
                        println("3초후 메뉴판으로 돌아갑니다.")
                        delay(3000)

                    }

                    "2" -> {
                        println("최초화면으로 돌아갑니다.")

                    }
                }
            }


            "cancle" -> {

                println("진행하던 주문을 취소하시겠습니까?")
                if (selectedproducts.isEmpty()) {
                    println("주문 목록이 비어있습니다.")
                } else {
                    println("1.확인  2.취소를 입력해주세요")
                    val userDecision = readLine()?.trim()?.lowercase()
                    when(userDecision) {
                        "1" -> {
                            selectedproducts.clear()
                            println("진행하던 주문이 취소 되었습니다.")
                        }
                        "2" -> {

                        }
                }
            }
        }


            "0" -> {
                println("[총 판매금액 현황]")
                println("현재 까지 총 판매된 금액은 [ W ${sales}] 입니다.")
                println("[총 판매상품 목록 현황]")
                println("현재까지 총 판매된 상품 목록은 아래와 같습니다.")
                saledproducts.forEachIndexed { index, item ->
                    println("${index + 1}. ${item.name} | ${item.price} | ${item.explanation}")
                }
                val userDecision = readLine()?.trim()?.lowercase()
                println("첫화면으로 돌아가려면 1번을 눌러주세요.")
                when (userDecision){
                    "1" -> {
                        println("1초후 최초화면으로 돌아갑니다.")
                    }
                }
            }


            else -> println("잘못된 입력입니다 다시 시도해 주세요.")
        }
    } while (continueLoop)
    }
