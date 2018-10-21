package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int e;
		int f;
		int count = 0;
		int num;
		int m;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		count = 0;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				  if ((m == 0) && (count == 0))
				  {
					  c = i;
					  d = j;
					  count = 1;
				  }
				  else if (m == 0)
				  {
					  e = i;
					  f = j;
				  }
			}
		}
		num = (e - c - 1) * (f - d - 1);
		System.out.printf("%d", num);
		return 0;
	}
}

