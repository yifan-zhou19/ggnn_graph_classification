package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] B = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int s = d;
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			for (i = 0;i < (m - 1);i++)
			{
			s += B[i];
			}
		System.out.printf("%d",s);
		}
		else
		{
			for (i = 0;i < (m - 1);i++)
			{
		 s += A[i];
			}
		System.out.printf("%d",s);
		}
		return 0;
	}


}

