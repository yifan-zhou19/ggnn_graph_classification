import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
				String s = new String(new char[40]);
				String f = new String(new char[40]);
				s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
				char * p;
							int i;
							int t;
				p = s;
							i = 0;
				while (*p != '\0')
				{
							while (*p >= 48 && *p <= 57)
							{
								f = tangible.StringFunctions.changeCharacter(f, i, *p);
								i++;
								p++;
							}
							while ((*p < 48 || *p>57) && (*p != '\0'))
							{
								p++;
							}
							if (*p == '\0')
							{
								break;
							}
													f = tangible.StringFunctions.changeCharacter(f, i, ' ');
													i++;
				}
						for (t = 0;t < i;t++)
						{
							 if (f.charAt(t) != ' ')
							 {
								   System.out.print(f.charAt(t));
							 }
							 else
							 {
								 System.out.print("\n");
							 }
						}
							return 0;
	}
}

