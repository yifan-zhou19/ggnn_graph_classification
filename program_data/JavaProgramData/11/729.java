package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0))
		{
			if (j == 1)
			{
				m = k;
				System.out.printf("%d",m);
			}
			if (j == 2)
			{
				m = k + 31;
				System.out.printf("%d",m);
			}
			if (j == 3)
			{
				m = k + 60;
				System.out.printf("%d",m);
			}
			if (j == 4)
			{
				m = k + 91;
				System.out.printf("%d",m);
			}
			if (j == 5)
			{
				m = k + 121;
				System.out.printf("%d",m);
			}
			if (j == 6)
			{
				m = k + 152;
				System.out.printf("%d",m);
			}
			if (j == 7)
			{
				m = k + 182;
				System.out.printf("%d",m);
			}
			if (j == 8)
			{
				m = k + 213;
				System.out.printf("%d",m);
			}
			if (j == 9)
			{
				m = k + 244;
				System.out.printf("%d",m);
			}
			if (j == 10)
			{
				m = k + 274;
				System.out.printf("%d",m);
			}
			if (j == 11)
			{
				m = k + 305;
				System.out.printf("%d",m);
			}
			if (j == 12)
			{
				m = k + 335;
				System.out.printf("%d",m);
			}
		}
		else
		{
			if (j == 1)
			{
				m = k;
				System.out.printf("%d",m);
			}
			if (j == 2)
			{
				m = k + 31;
				System.out.printf("%d",m);
			}
			if (j == 3)
			{
				m = k + 59;
				System.out.printf("%d",m);
			}
			if (j == 4)
			{
				m = k + 90;
				System.out.printf("%d",m);
			}
			if (j == 5)
			{
				m = k + 120;
				System.out.printf("%d",m);
			}
			if (j == 6)
			{
				m = k + 151;
				System.out.printf("%d",m);
			}
			if (j == 7)
			{
				m = k + 181;
				System.out.printf("%d",m);
			}
			if (j == 8)
			{
				m = k + 212;
				System.out.printf("%d",m);
			}
			if (j == 9)
			{
				m = k + 243;
				System.out.printf("%d",m);
			}
			if (j == 10)
			{
				m = k + 273;
				System.out.printf("%d",m);
			}
			if (j == 11)
			{
				m = k + 304;
				System.out.printf("%d",m);
			}
			if (j == 12)
			{
				m = k + 334;
				System.out.printf("%d",m);
			}
		}
	}



}

