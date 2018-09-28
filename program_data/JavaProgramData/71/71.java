package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int i;
		int k;
		int m1;
		int m2;
		int a;
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			{
			m[1] = 29;
			}
			else
			{
			m[1] = 28;
			}
			if (m1 < m2)
			{
			a = m1;
			m1 = m2;
			m2 = a;
			}
			a = 0;

			for (k = m2 - 1;k < m1 - 1;k++)
			{

				a += m[k];
			}
			if (a % 7 == 0)
			{
			System.out.print("YES\n");
			}
			else
			{
			System.out.print("NO\n");
			}

		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;

	}

}

