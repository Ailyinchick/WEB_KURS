package pack.Service;

import org.springframework.stereotype.Service;

@Service
public class ChooseCar {

    String carType;

    public String getCarByConfig(String type, String body, String color) {
        return "" + getTypeMapping(type) + getBodyMapping(body) + getColorMapping(color);
    }

    public String getColorMapping(String color) {
        if (color.equalsIgnoreCase("белый")) {
            return "b_white.jpg\" alt=\"b_black\">";
        } else if (color.equalsIgnoreCase("чёрный")) {
            return "b_black.jpg\" alt=\"b_black\">";
        } else {
            return "b_green.jpg\" alt=\"b_black\">";
        }
    }

    public String getTypeMapping(String type) {
        if (type.equalsIgnoreCase("ведро")) {
            this.carType="Bentley";
            return "<img src=\"resources/images/bentley/";
        } else {
            this.carType="Bentley";
            return "<img src=\"resources/images/jiga/";
        }
    }

    public String getBodyMapping(String body) {
        if (body.equalsIgnoreCase("купе")) {
            return "coupe/";
        } else {
            return "sedan/";
        }
    }

    public String getCarType() {
        return carType;
    }
}
