package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int f;
		int i;
		int j;
		int b = 0;
		int c = 0;
		int m = 0;
		int[] s = new int[100];
		for (f = 0;f < 100;f++)
		{
			s[f] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			b = i / 10;
		 c = i - b * 10;
		 if (b != 7 && c != 7 && i % 7 != 0)
		 {
		   s[i] = i;
		 }

		}

		for (j = 1;j <= n;j++)
		{
			m = m + s[j] * s[j];
		}
		System.out.printf("%d",m);
		return 0;
	}


}

