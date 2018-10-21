package <missing>;

public class GlobalMembers
{
	public static int ch(int y,int m)
	{
	 int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int c;
	if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
	{
		 a[2]++;
	}
		 c = 1;
		 for (i = 1;i < m;i++)
		 {
		 c = c + a[i];
		 }
		 return c;
	}
	public static int Main()
	{

		int i;
		int j;
		int n;
		int y;
		int m1;
		int m2;
		int t;
		int s = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
			s = ch(y, m1) - ch(y, m2);
			}
			else
			{
			s = ch(y, m2) - ch(y, m1);
			}
			if (s % 7 != 0)
			{
			System.out.print("NO\n");
			}
			else
			{
			System.out.print("YES\n");
			}
			s = 1;
		}
	}

}

