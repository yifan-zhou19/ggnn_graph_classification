package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int s;
	public static void gets(int k)
	{
		int i;
		int j;
		int t;
		for (i = 3;i <= k;i++)
		{
			  t = 0;
			  for (j = 2;j <= (int)Math.sqrt(i);j++)
			  {
				if (i % j == 0)
				{
					t = 1;
				}
			  }
			if (t == 0)
			{
				s++;
				a[s] = i;
			}

		}
	}
	public static int Main()
	{
		int n;
		int i;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 1;
		a[1] = 2;
		n = new Scanner(System.in).nextLine();
		r = 0;
		for (i = 1;i < s;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
			  System.out.printf("%d %d\n",a[i],a[i + 1]);
			  r++;
			}
		}
		if (r == 0)
		{
			System.out.print("empty");
		}

	}
}

