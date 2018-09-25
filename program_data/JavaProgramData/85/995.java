import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int b = 0;
		int j = 0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String a = new String(new char[50]);
		while (n > 0)
		{
			flag = 1;
			b = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			b = a.length();
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				flag = 0;
			}
			else
			{
				for (j = 0; j <= b - 1; j++)
				{
					if ((a.charAt(j) < '0' || (a.charAt(j) > '9' && a.charAt(j) < 'A') || (a.charAt(j) > 'Z' && a.charAt(j) < 'a') || (a.charAt(j) > 'z')) && a.charAt(j) != '_')
					{
						flag = 0;
						break;
					}
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			if (flag == 1)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}
}

