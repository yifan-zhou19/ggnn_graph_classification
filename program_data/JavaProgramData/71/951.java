package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int[] y = new int[200];
		int[] m1 = new int[200];
		int[] m2 = new int[200];
		int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		int[] b = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 365};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
			if (y[i] % 4 == 0 && y[i] % 100 != 0 || y[i] % 400 == 0)
			{
				if ((b[m1[i] - 1] - b[m2[i] - 1]) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				if ((a[m1[i] - 1] - a[m2[i] - 1]) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
	}
}

