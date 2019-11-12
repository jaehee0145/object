package convenience;



import lombok.Getter;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
public class Cart {

    Map<Product, Integer> products;
}
