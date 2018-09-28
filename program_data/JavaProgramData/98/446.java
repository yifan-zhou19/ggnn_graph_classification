import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int n;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = new Scanner(System.in).nextLine();
		p = str;
		for (p = str; * p != '\0';p++)
		{
			count++;
			if (count == 81)
			{
			   if (*p != ' ')
			   {
					while (*p != ' ')
					{
						p--;
					}
			   }
				*p = '\n';
				count = 0;
			}

		}
		for (p = str; * p != '\0'; p++)
		{
				System.out.print(p);
		}
		System.out.print("\n");
			return 0;
	}
}

