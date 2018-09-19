package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		s = 0;
		for (i = 1;i <= 10;i++)
		{
			t = n;
			for (j = 1;j <= 10;j++)
			{
							  if (m == t)
							  {
								  System.out.printf("%d",m);
								  s = 2;
								  break;
							  }
							  t = t / 2;

			}
			if (s == 2)
			{
				break;
			}
			m = m / 2;
		}

		return 0;
	}

}

