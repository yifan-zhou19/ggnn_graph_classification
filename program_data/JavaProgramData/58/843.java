import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[2]);
		a = new Scanner(System.in).nextLine();
		for (int j = 1;j <= n;j++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			String word = new String(new char[100]);
			word = new Scanner(System.in).nextLine();
			p = word;
			int w = 0;
			if (*p == '_' || (*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122))
			{
				while (*p != '\0')
				{
					if (*p == '_' || (*p >= 65 && *p <= 90) || (*p >= 97 && *p <= 122) || (*p >= 48 && *p <= 57))
					{
						p++;
					}
					else
					{
						System.out.print(0);
						System.out.print("\n");
						w = 1;
						break;
					}
				}
				if (w == 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

