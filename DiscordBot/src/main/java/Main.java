import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main{

        public static void main(String[]args) throws Exception {
            JDA builder = new JDABuilder("Njc0NzA2OTMyMjI5MDc5MDQw.Xjs7iw.SagOE0l2387ikzNtYOWCki0L-_Y")
                    .setActivity(Activity.listening("I'm dying"))
                    .setStatus(OnlineStatus.DO_NOT_DISTURB)
                    .addEventListeners(new PingListener())
                    .build();


        }


}
