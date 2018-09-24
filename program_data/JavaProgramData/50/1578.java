package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int w;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		n = (w + 12) % 7;
		if (n == 5)
		{
			System.out.printf("%d\n",1);
		}
		for (i = 1;i <= 11;i++)
		{
			n = (n + a[i]) % 7;
			if (n == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

