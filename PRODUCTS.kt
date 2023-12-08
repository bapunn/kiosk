package com.example.myapplication

interface PRODUCTS :MENU {
    val price:Double
    val category:String

}
abstract class ProductsMenu(
    override val category: String,
    override val name: String,
    override val price: Double,
    override val explanation: String,
) : PRODUCTS
class ShacBurger: ProductsMenu ("burger","Shac Burger",6.9,"토마토, 양상추, 쉑소스가 토핑된 치즈버거")
class SmokeShack: ProductsMenu("burger","Smoke Shack",8.9,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
class  ShroomBurger : ProductsMenu("burger","Shroom Burger",9.4,"몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
class CheeseBurger : ProductsMenu("burger","Cheese Burger",6.9,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
class Hamburger: ProductsMenu("burger","Hamburger ",5.4,"비프패티를 기반으로 야채가 들어간 기본버거")
class VanillaCookiesCreamShake: ProductsMenu ("frozencustard","Vanilla Cookies & Cream Shake",7.5,"부드러운 바닐라 커스터드와 바삭한 쿠키 크럼블이 어우러진 홀리데이 쉐이크")
class MintCookiesCreamShake: ProductsMenu("frozencustard","Mint Cookies & Cream Shake",7.5,"시원한 민트 향과 달콤한 바닐라, 바삭한 쿠키 크럼블이 어우러진 홀리데이 쉐이크")
class ClassicHandSpunShakes :ProductsMenu("frozencustard","Classic Hand-Spun Shakes",6.5,"쫀득하고 진한 커스터드가 들어간 클래식 쉐이크(바닐라/초콜릿/스트로베리/블랙 & 화이트/솔티드 카라멜/피넛 버터/커피)")
class Floats : ProductsMenu("frozencustard","Floats",6.5,"부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료(루트 비어/퍼플 카우/크림시클)")
class CupCone: ProductsMenu("frozencustard","Cup & Cones",5.4,"매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림 (바닐라/초콜릿)")
class RaspberryLemonade: ProductsMenu ("drink","Raspberry Lemonade",4.8,"쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드")
class Lemonade: ProductsMenu("drink","Lemonade",4.3,"매장에서 직접 만드는 상큼한 레몬에이드")
class  FreshBrewedIcedTea : ProductsMenu("drink","Fresh Brewed Iced Tea",3.5,"직접 유기농 홍차를 우려낸 아이스 티")
class FiftyFiftyTM : ProductsMenu("drink","Fifty/FiftyTM",3.8,"레몬에이드와 유기농 홍차를 우려낸 아이스 티가 만나 탄생한 쉐이크쉑의 시그니처 음료")
class FountainSoda: ProductsMenu("drink","Fountain Soda",2.9,"코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프, 환타 파인애플")
