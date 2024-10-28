package com.automacao.automacao.MyScheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class MyScheduledTasks {

    @Scheduled(fixedRate = 5000) // executa a cada 5 segundos
    public void performTask() {

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);
        System.out.println("Tarefa agendada executada a cada 5 segundos : " + dataHoraFormatada);

    }

    @Scheduled(cron = "0 0/1 * * * ?") // executa a cada minuto
    public void performTaskWithCron() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);
        System.out.println("Tarefa agendada com cron a cada minuto : " + dataHoraFormatada);

    }
}