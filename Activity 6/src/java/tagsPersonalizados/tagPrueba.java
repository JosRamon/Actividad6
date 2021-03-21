
package tagsPersonalizados;

import java.io.IOException;
import java.util.Date;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;


public class tagPrueba extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException 
    
    {
        JspWriter out = getJspContext().getOut();
        out.println("Mi nombre es Jose Ramon Martinez Muñoz y hoy es:"+new Date());
    }
    
}
