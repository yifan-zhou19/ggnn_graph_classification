package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int feb;
		int i;
		int m;
		int n = 0;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
		{
			feb = 29;
		}
		else
		{
			feb = 28;
		}


		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				m = 31;
			}
			else if (i == 2)
			{
				m = feb;
			}
			 else
			 {
				m = 30;
			 }
			n = n + m;
		}
		q = n + c;
		System.out.printf("%d",q);
		return 0;
	}


}

