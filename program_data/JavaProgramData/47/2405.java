package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int n;
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s[i] = a;
		}
		i = n - 1;
		a = 0;
		while (i >= 0) //????
		{
			if (a == 0)
			{
					System.out.print(s[i]);
					a = 1;
			}
			else
			{
				System.out.print(" ");
				System.out.print(s[i]);
			}
			i = i - 1;
		}
			return 0;
	}
}

