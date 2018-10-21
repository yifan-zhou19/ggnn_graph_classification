package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int x;
		int y;
		int i;
		int[] hour = new int[100];
		int[] normal = new int[100];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			normal[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (x < 90 || x>140 || y < 60 || y>90)
			{
				m++;
			}
			else
			{
				normal[m]++;
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (normal[i] < normal[i - 1])
			{
				normal[i] = normal[i - 1];
			}
		}
		System.out.printf("%d",normal[i - 1]);
	}
}

