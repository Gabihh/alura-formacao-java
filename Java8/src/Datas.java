import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Datas {
	public static void main(String[] args) {
//		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
//		
//		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
//		
//		int anos = olimpiadasRio.getYear() - hoje.getYear();
//		System.out.println(anos);
//		
//		Period periodo = Period.between(hoje, olimpiadasRio);
//		System.out.println(periodo.getDays());
//		
//		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
//		System.out.println(proximasOlimpiadas);
//		
//		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		String valorFormatado = proximasOlimpiadas.format(formatador);
//		System.out.println(valorFormatado);
//		
//		DateTimeFormatter formatadorDeHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
//		
//		LocalDateTime agora = LocalDateTime.now();
//		System.out.println(agora.format(formatadorDeHoras));
//		
//		LocalTime intervalo = LocalTime.of(15, 30);
//		System.out.println(intervalo);
		
		//atividades
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data atual: " + dataAtual);
		
		LocalDate dataDefinida = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(dataDefinida);
		
		Period periodo = Period.between(dataAtual, dataDefinida);
		System.out.println(periodo);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataAtual.format(formatador));
	}
}
