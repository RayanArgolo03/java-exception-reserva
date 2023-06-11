package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.entidades.Reserva;
import model.excecoes.DataInvalidaReservaException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            
            System.out.println("------ Sistema Reserva de Hotel com Tratamento de Exceções ------");
            
            System.out.print("Número do quarto: ");
            Integer numeroQuarto = sc.nextInt();
            
            System.out.print("Data do checkin: (dd/MM/yyyy): ");
            LocalDate checkin = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            System.out.print("Número do checkout: (dd/MM/yyyy): ");
            LocalDate checkout = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
            //Nova Reserva
            Reserva r = new Reserva(numeroQuarto, checkin, checkout);
            System.out.println(r);
            
            //Atualizando datas
            System.out.println("\n Entre com as datas para atualizar a reserva");
            
            System.out.print("Data de checkin: (dd/MM/yyyy): ");
            checkin = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            System.out.print("Data de checkout: (dd/MM/yyyy): ");
            checkout = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            r.atualizarDatas(checkin, checkout);
        }
        
        //Dados impróprios na execução
        catch (DataInvalidaReservaException e) {
            System.out.println("Erro na Reserva: " +e.getMessage());
        }
        
        //Dados inválidos
        catch (RuntimeException e){
            System.out.println("Erro inesperado no programa");
        }
        
        finally{
            sc.close();
        }

    }

}
