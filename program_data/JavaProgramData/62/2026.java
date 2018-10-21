import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   **
	//*????? 1200012917 **
	//*???2012.12.7  **
	//********************************
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String str = new String(new char[100]);
		int t = 0;
		int i = 0;
		str = new Scanner(System.in).nextLine();
		p = str;
		for (; * p != '\0'; p++)
		{
			if (*p == ' ')
			{
				if (t == 0)
				{
					*(str.Substring(i)) = *p;
					i++;
					t = 1;
				}
			}
			else
			{
				*(str.Substring(i)) = *p;
				i++;
				t = 0;
			}
		}
		for (p = str; p <= str.Substring(i) - 1; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;

	}
}
