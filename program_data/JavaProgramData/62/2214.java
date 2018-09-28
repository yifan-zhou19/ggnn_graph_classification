import java.util.*;

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 't', so pointers on this parameter are left unchanged:
	public static void move(char * t, int d)
	{
		//for(;*(t-1)!=0;t++) *(t-d)=*t; ????
		for (; * t != 0;t++)
		{
			*(t - d) = *t;
		}
		*(t - d) = *t;
	}
	public static void deal(tangible.RefObject<String> c)
	{
		if (c.argValue == 0)
		{
			return;
		}
		else if (c.argValue != ' ')
		{
			deal(c.argValue.Substring(1));
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * t = c.argValue.Substring(1);
			for (; * t == ' ';t++)
			{
				;
			}
			int d = t - c.argValue-1;
			if (d != 0)
			{
				move(t, d);
			}
			//deal(t);????t????????
			deal(c.argValue.Substring(1));
		}
	}
	public static int Main()
	{
		String c = new String(new char[201]);
		c = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		deal(tempRef_c);
		c = tempRef_c.argValue;
		System.out.print(c);
		return 0;
	}
}

