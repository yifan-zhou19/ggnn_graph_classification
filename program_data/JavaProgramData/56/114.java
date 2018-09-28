package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int q;
		int[] s = new int[5];
		for (i = 0; i < 5; i++)
		{
			q = n % 10;
			n = n / 10;
			s[i] = q;
		}
		for (j = 0; j < 5; j++)
		{
			if (s[j] != 0)
			{
				System.out.printf("%d", s[j]);
			}
		}
		return 0;
	}
}

