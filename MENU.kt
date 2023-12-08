package com.example.myapplication

interface MENU {
    val name:String
    val explanation:String
}
abstract class MenuItem(
    override val name: String,
    override val explanation: String
) : MENU
class Burger : MenuItem("Burger", "앵거스 비프 통살을 다져 만든 버거")
class FrozenCustard : MenuItem("Frozen Custard", "매장에서 신선하게 만드는 아이스크림")
class Drink : MenuItem("Drink", "매장에서 직접 만드는 음료")
class Order : MenuItem("Order", "장바구니를 확인 후 주문합니다.")
class Cancle : MenuItem("Cancle", "진행 중인 주문을 취소합니다.")
