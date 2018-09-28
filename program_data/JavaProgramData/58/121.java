import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Judge(char c)
	{
		int i;
		int flag = 0;
		for (i = 0; i < 26; i++)
		{
			if (c == 'a' + i || c == 'A' + i)
			{
				flag = 1;
				break;
			}
		}
		for (i = 0; i < 10; i++)
		{
			if (c - '0' == i)
			{
				flag = 1;
				break;
			}
		}
		if (c == '_')
		{
			flag = 1;
		}
		return flag;

	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int k;
		String a = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0; j < l; j++)
			{
				if (Judge(a.charAt(j)) == 0)
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
			}
			if (j == l)
			{
				for (k = 0; k < 10; k++)
				{
					if (a.charAt(0) - '0' == k)
					{
						System.out.print(0);
						System.out.print("\n");
						break;
					}
				}
				if (k == 10)
				{
					System.out.print(1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

