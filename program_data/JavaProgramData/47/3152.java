package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] an = new int[100];
		int[] bn = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			an[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - 1;i >= 0;i--)
		{
			 bn[j++] = an[i];
		}
		for (i = 0;i < n;i++)
		{
			an[i] = bn[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(an[i]);
			System.out.print(' ');
		}
		System.out.print(an[n - 1]);
		return 0;
	}
}

