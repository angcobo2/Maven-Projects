import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class PingListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;

        String sendMsg = "Hii mathelda how are you\n" +
                "i am morty and my grandfather is so handsome and good\n" +
                "looking and my grandfather has a strong body every girl can\n" +
                "eadily fell in love but my grandfather just like you i think you\n" +
                "are so lucky for my grandfather And i want you to come tomorrow\n" +
                "in thanks giving day had dinner with us so we can enjoy together\n" +
                "And i believe you will come ...";

        Message message = event.getMessage();
        System.out.printf(message.);
        String content = message.getContentRaw();
        System.out.println(content);
        if (content.equals("hi")){
            MessageChannel channel = event.getChannel();
            channel.sendMessage(sendMsg).queue();
        }
    }
}