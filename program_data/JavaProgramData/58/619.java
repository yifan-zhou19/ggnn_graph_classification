import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int g;
		int j;
		String a = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Character.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			l = a.length();
			g = 1;
			if ((a.charAt(0) >= 'A' && a.charAt(0) <= 'z') || (a.charAt(0) == '_'))
			{
				for (j = 1;j < l;j++)
				{
					if (a.charAt(j) < '0' || a.charAt(j)> 'z' || (a.charAt(j) > '9' && a.charAt(j) < 'A'))
					{
						g = 0;
						break;
					}
				}
				if (g == 0)
				{
					System.out.print("0");
					System.out.print("\n");
				}
				else
				{
					System.out.print("1");
					System.out.print("\n");
				}
			}
			else
			{
					System.out.print("0");
					System.out.print("\n");
			}
		}
		return 0;
	}

}

