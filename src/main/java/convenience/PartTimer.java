package convenience;


import java.util.Map;

public class PartTimer {

    public int calculate(Cart cart) {
        Map<Product, Integer> products = cart.getProducts();
        int totalPrice = 0;
        for( Map.Entry<Product, Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            int price = product.getPrice();
            Integer amount = entry.getValue();
            totalPrice += price*amount;
        }
    return totalPrice;
    }

    boolean check(int money, Cart cart){
        boolean check = false;
        int calculate = calculate(cart);
        if((money - calculate) > 0){
            check = true;
            //재고에서 물건 빼고 금고에서 돈 추가하고,
            //지갑에서 돈 빼고,
            //손님 가방에 물건 넣고
            //장바구니 없애고?
            //거스름돈 주고(0이아니면)
        }
        return check;
    }


}
