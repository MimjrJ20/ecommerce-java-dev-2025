import model.UserModel;
import util.DateUtils;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {

        UserModel user = new UserModel(
                "12345678900",      // documentNumber
                "CPF",              // documentType
                "usuario@teste.com", // email
                "1",                // id
                "João da Silva",     // name
                "ADMIN",             // role
                LocalDateTime.now(), // created
                LocalDateTime.now()  // updated
        );

        System.out.println("Usuário criado com sucesso!");
        System.out.println("ID: " + user.getId());
        System.out.println("Nome: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Função: " + user.getRole());
        System.out.println("Documento: " + user.getDocumentType() + " - " + user.getDocumentNumber());
        System.out.println("Criado em: " + DateUtils.formatDateTime(user.getCreated()));
        System.out.println("Atualizado em: " + DateUtils.formatDateTime(user.getUpdated()));
    }
}