package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		int p = 1;
		int q = 1;
		int temp = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num == 1 || num == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				for (j = 3; j <= num; j++)
				{
					a = p + q;
					p = q;
					q = a;
				}
				System.out.printf("%d\n", a);
				a = 0;
				p = 1;
				q = 1;
			}
		}
		return 0;
	}
}

