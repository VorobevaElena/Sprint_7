package courier;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;

public class CourierRandomizer {
    static Faker faker = new Faker();


    @Step("Создание нового курьера с рандомными данными")
    public CourierModel createNewRandomCourier() {
        return new CourierModel(
                faker.name().username(),
                faker.internet().password(),
                faker.name().firstName());
    }
}