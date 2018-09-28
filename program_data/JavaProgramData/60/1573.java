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
		int a;
		int k;
		int s;
		int t;
		t = 0;
		for (i = 3;i < n - 1;i++)
		{
			a = i + 2;
			s = 0;
			for (k = 2;k < i;k++)
			{
				if (i % k == 0 || a % k == 0)
				{
					break;
				}
				s = s + 1;
			}
			if (s == i - 2)
			{
				System.out.printf("%d %d\n",i,a);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

