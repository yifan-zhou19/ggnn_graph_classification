package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = new int(int x,int y);
		int[] m = new int[20];
		int[] n = new int[20];
		int t;
		int[] num = new int[20];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < t;i++)
		{
			num[i] = a(m[i], n[i]);
			System.out.printf("%d\n",num[i]);
		}
	}

	public static int a(int x,int y)
	{
		int sum = 0;
		if (x == 1 || y == 1 || x == 0)
		{
			sum += 1;
		}

		else
		{
			if (x - y > y)
			{
			sum += a(x, y - 1) + a(x - y, y);
			}
			else
			{
			sum += a(x, y - 1) + a(x - y, x - y);
			}
		}

		return (sum);
	}


}

