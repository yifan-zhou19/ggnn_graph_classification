package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int k = 0;
		if (x >= 0)
		{
			if (x <= 1 || y <= 1)
			{
			k = 1;
			}
			else
			{
			k = f(x, y - 1) + f(x - y, y);
			}
		}
		return (k);
	}
	public static void Main()
	{
		int a;
		int[] m = new int[100];
		int[] n = new int[100];
		int i;
		int[] k = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= a;i++)
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
			k[i] = f(m[i], n[i]);
		}
		for (i = 1;i <= a;i++)
		{
			System.out.printf("%d\n",k[i]);
		}
	}
}

