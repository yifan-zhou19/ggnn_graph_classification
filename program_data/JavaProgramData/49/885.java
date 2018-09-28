package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int r;
		int i;
		int j;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		r = a.length();
		for (i = 2;i <= r;i++)
		{
			for (k = 0;k <= r - i;k++)
			{
				m = k;
				n = k + i - 1;
			while (m < n && (a.charAt(m) == a.charAt(n)))
			{
				m++;
				n--;
			}
			if (m >= n)
			{
				for (j = k;j <= k + i - 1;j++)
				{
					System.out.print(a.charAt(j));
				}
				System.out.print('\n');
			}
			}
		}

		return 0;

	}
}

