package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int[] d = new int[13];
		int m1;
		int m2;
		int a;
		int b;
		d[1] = 31;
		d[2] = 28;
		d[3] = 31;
		d[4] = 30;
		d[5] = 31;
		d[6] = 30;
		d[7] = 31;
		d[8] = 31;
		d[9] = 30;
		d[10] = 31;
		d[11] = 30;
		d[12] = 31;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int num = 0;
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
			if (m1 > m2)
			{
				a = m1;
				b = m2;
			}
			else
			{
				a = m2;
				b = m1;
			}
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				d[2]++;
			}
			for (j = b;j < a;j++)
			{
				num += d[j];
			}
			if (num % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			d[2] = 28;
		}

		return 0;
	}
}

