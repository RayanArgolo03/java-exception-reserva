
package model.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import model.excecoes.DataInvalidaReservaException;

public class Reserva {
    
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private Integer numeroQuarto;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reserva(Integer numeroQuarto, LocalDate checkin, LocalDate checkout) throws DataInvalidaReservaException {

        //Caso o checkout seja depois do checkin 
        if (checkout.isBefore(checkin)) {
            throw new DataInvalidaReservaException("Data de checkout anterior ao checkin!");
        }
        
        //Caso o checkout seja depois do checkin 
        if (checkout.equals(checkin)) {
            throw new DataInvalidaReservaException("Entrada e saída na mesma data!");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Reserva() {
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva: ");
        sb.append("Quarto: ").append(numeroQuarto);
        sb.append(", check-in: ").append(dtf.format(checkin));
        sb.append(", check-out: ").append(dtf.format(checkout));
        sb.append(", ");
                
        Integer periodo = duracao();
        sb.append(periodo);
        
        if (periodo > 1){
            sb.append(" noites");
        } else {
            sb.append(" noite");
        }
        
        
        return sb.toString();
    }
    
    
    public Integer duracao(){
        Integer periodo = Period.between(checkin, checkout).getDays();
        return periodo;
    }
    
    public void atualizarDatas(LocalDate checkin, LocalDate checkout) throws DataInvalidaReservaException {
        
        //Caso a data de atualização seja anterior a atual
        if (checkin.isBefore(this.checkin) || checkout.isBefore(this.checkout)){
            throw new DataInvalidaReservaException("Data de atualização anterior a data atual!");
        }
        
        //Caso a data de atualização seja igual a atual
        if (checkin.equals(this.checkin) || checkout.equals(this.checkout)){
            throw new DataInvalidaReservaException("Data de atualização igual a atual!");
        }
        
        this.checkin = checkin;
        this.checkout = checkout;
    }
    
}
