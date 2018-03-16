package constants;

public class Constants {
    public static final String  VirtualToure = "<iframe src=\"https://www.google.com/maps/embed?pb=!4v1515680220461!6m8!1m7!1ssUR4ppezchZaQKtkDj1pRg!2m2!1d21.39802158228663!2d-158.1679441334051!3f6.40858321791228!4f9.58266604564858!5f0.7820865974627469\" width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" allowfullscreen></iframe>";
    public static final String  FilePathPropertyPicture = "src/main/resources/property.jpg";
    public static final String  FilePathAgentPropertyPicture = "src/main/resources/agentProperty.jpg";
    public static final String  FilePathAvatarAgent1 = "src/main/resources/avatar.jpg";
    public static final String  FilePathAvatarAgent2 = "src/main/resources/avatar1.png";
public  static  final String  DescriptionProperty="This stylish residence is nestled on a large level block in a desirably tranquil cul-de-sac location.";
   public static final String JsDragAndDrop =
            "var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEff" +
                    "ect:'',effectAllowed:'all',files:[],items:{},types:[],setData:f" +
                    "unction(format,data){this.items[format]=data;this.types.append(" +
                    "format);},getData:function(format){return this.items[format];}," +
                    "clearData:function(format){}};var emit=function(event,target){v" +
                    "ar evt=document.createEvent('Event');evt.initEvent(event,true,f" +
                    "alse);evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);}" +
                    ";emit('dragstart',src);emit('dragenter',tgt);emit('dragover',tg" +
                    "t);emit('drop',tgt);emit('dragend',src);";

}
