package aws;
import software.amazon.awssdk.services.apigatewayv2.ApiGatewayV2Client;
//import software.amazon.awssdk.services.apigatewayv2.model.ApiGatewayV2Exception;
//import software.amazon.awssdk.services.apigatewayv2.model.IntegrationResponse;
//import software.amazon.awssdk.services.apigatewayv2.model.PutIntegrationResponseRequest;

public class APIGateway {
    public static void main(String[] args) {
        String integrationId = "your_integration_id_here";
        String apiId = "your_api_id_here";
        String integrationResponseId = "your_integration_response_id_here";

//        ApiGatewayV2Client apiGatewayV2Client = ApiGatewayV2Client.builder().build();
//
//        IntegrationResponse integrationResponse = IntegrationResponse.builder()
//                .statusCode("500")
//                .responseTemplates("application/json", "{\"message\": {\"Erro\"}}")
//                .build();
//
//        PutIntegrationResponseRequest putIntegrationResponseRequest = PutIntegrationResponseRequest.builder()
//                .apiId(apiId)
//                .integrationId(integrationId)
//                .integrationResponseId(integrationResponseId)
//                .integrationResponse(integrationResponse)
//                .build();
//
//        try {
//            apiGatewayV2Client.putIntegrationResponse(putIntegrationResponseRequest);
//            System.out.println("Integration response configured successfully.");
//        } catch (ApiGatewayV2Exception e) {
//            System.err.println(e.getMessage());
//            System.exit(1);
//        }
    }
}
