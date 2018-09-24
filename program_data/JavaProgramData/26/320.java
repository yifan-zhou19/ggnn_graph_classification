import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************
	//*???????????*
	//*??????          *
	//*???1000012808      *
	//************************
	public static String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void space_clear(char * p)
	{
		String q;
		String s;
		while (true)
		{
			if (*p != ' ' && *p != '\0')
			{
				p = p.Substring(1);
			}
			else
			{
				break;
			}
		} //?????????????
		if (*p == '\0')
		{
			System.out.print(str);
			System.out.print("\n");
		}
		else
		{
			q = p;
				while (true)
				{
				if (q == ' ')
				{
					q = q.Substring(1);
				}
				else
				{
					break;
				}
				} //??????????????????????
			s = p.Substring(1);
			for (; q != '\0';)
			{
				s ++= q++; //????
			}
			s = '\0'; //???\0?????
			space_clear(p.Substring(1)); //????
		}
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		space_clear(str); //????
		return 0;
	}






}
