package Main;

public class CD extends Media {

    private Format_CD description;

    CD(String name, String authorName, Format_CD format){
        super( authorName, name );
        this.Format_CD = format;
    }

    public enum Format_CD{
        CD_MUSICAL("CD musical"), OGG("OGG"), MP3("mp3");
        private String formatValuesStr;

        Format_CD(String valueStr){
            this.formatValuesStr = valueStr;
        }

        public String getFormatValuesStr(){
            return this.formatValuesStr;
        }
    }
}
