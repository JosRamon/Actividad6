
package tagsPersonalizados;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author user
 */
public class tagCuerpo extends SimpleTagSupport {

    Date date = new Date();
   
    @Override
    public void doTag() throws JspException, IOException 
    {
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");   
       
        getJspContext().getOut().println("Hora: "+hourFormat.format(date));
        
    }
    
}
