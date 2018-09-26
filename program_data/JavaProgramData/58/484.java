import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int m;
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Character.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) == '_' || a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) >= 'A' && a.charAt(0) <= 'Z')
			{
				j = 1;
				while (a.charAt(j) == '_' || a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) >= '0' && a.charAt(j) <= '9')
				{
					j++;
				}
				if (a.charAt(j) == '\0')
				{
					m = 1;
				}
				else
				{
					m = 0;
				}
			}
			else
			{
				m = 0;
			}
			System.out.print(m);
			System.out.print("\n");
		}
		return 0;
	}
}

