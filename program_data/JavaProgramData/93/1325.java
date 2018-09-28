package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int m;
		int e;
		int f;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i < 8;i = i + 2)
		{
			if (a % i == 0)
			{
				m = m + 1;
			  if (m == 1)
			  {
			  e = i;
			  }
			  else
			  {
				f = i;
			  }
			}

		}
		switch (m)
		{
		case 0:
			System.out.print("n");
			break;
		case 1:
			System.out.printf("%d",e);
			break;
		case 2:
			System.out.printf("%d %d",e,f);
			break;
		case 3:
			System.out.print("3 5 7");
			break;
		}
		return 0;
	}
}

