package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int k = 0;
		int[] s = new int[20001];
		int[] a = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 20001; i++)
		{
			s[i] = 0;
			a[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[e] == 0)
			{
				a[e] = 1;
				k++;
				s[k] = e;
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			 System.out.print(s[i]);
			 System.out.print(' ');
		}
		System.out.print(s[k]);
		return 0;
	}


}

