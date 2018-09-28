package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		while (s > 0)
		{
			s /= 10;
			k++;
		}
		for (i = 0;i < k;i++)
		{
			int t = 0;
			t = n % 10;
			System.out.printf("%d", t);
			n /= 10;
		}
		return 0;

	}


}

