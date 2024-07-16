import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDeMoneda {
    public Moneda buscaMoneda(String monedaBase, String monedaObjeto, float cantidad) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1beaa5ca8cc11f7b4e7b01da/pair/" + monedaBase + "/" + monedaObjeto + "/" + cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (
                Exception e) {
            throw new RuntimeException("No encontré esa película.");
        }

    }
}
