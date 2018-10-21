package <missing>;

public class GlobalMembers
{
	public static int i = 1;
	public static int n;
	public static int k;
	public static int t = 1;
	public static int apple()
	{
		int re;
		if (t == n)
		{
			return i * n + k;
		}
		else
		{
			for (;;i++)
			{
				t++;
				re = apple();
				t--;
				if (re % (n - 1) == 0)
				{
					return re / (n - 1) * n + k;
				}
			}

		}
	}

	public static int Main()
	{
		 int s;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 k = Integer.parseInt(tempVar2);
		 }

		 s = apple();
		 System.out.printf("%d",s);
		 return 0;

	}
}

