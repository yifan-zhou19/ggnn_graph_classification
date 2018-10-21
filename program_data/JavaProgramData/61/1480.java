package <missing>;

public class GlobalMembers
{
	public static int dijigeshu(int a)
	{
		int x = 1;
		int y = 1;
		int s;
		if (a == 1 || a == 2)
		{
			return 1;
		}
		else
		{
			for (int j = 3;j <= a;j++)
			{
				s = x + y;
				x = y;
				y = s;
			}
			return s;
		}
	}
	public static int Main()
	{
		int x = 1;
		int y = 1;
		int n;
		int a;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			b[i] = dijigeshu(a);
		}
		for (int j = 0;j < n;j++)
		{
			System.out.printf("%d\n",b[j]);
		}
		return 0;
	}

}

