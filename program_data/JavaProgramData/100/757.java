package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String zimu = "abcdefghijklmnopqrstuvwxyz";
		String str = new String(new char[300]);
		int i;
		int j;
		int[] a = new int[26];
		int n;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (str.charAt(j) == zimu.charAt(i))
				{
					a[i] = a[i] + 1;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",zimu.charAt(i),a[i]);
				q = 1;
			}

		}
		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

