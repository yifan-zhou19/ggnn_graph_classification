import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int k = 0;
		int n = 0;
		int flags = 1;
		int j = 0;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			k = a.length();
			flags = 1;
			for (j = 0;j < k;j++)
			{
				if (((int)a.charAt(j) < 'a' || (int)a.charAt(j)>'z') && ((int)a.charAt(j) > 'Z' || (int)a.charAt(j) < 'A') && ((int)a.charAt(j) < '0' || (int)a.charAt(j)>'9') && a.charAt(j) != '_')
				{
					flags = 0;
				}
			}
			if (flags == 0)
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else if ((int)a.charAt(0) >= '0' && (int)a.charAt(0) <= '9')
			{
				System.out.print(0);
				System.out.print("\n");
			}
			else
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

