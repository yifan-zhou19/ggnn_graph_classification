package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int flag;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < m; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (((a + j * 3) >= 60) && (flag) != 0)
				{
					flag = 0;
					System.out.printf("%d\n",60 - 3 * j);
				}
				else if (((a + j * 3 + 3 >= 60)) && (flag) != 0)
				{
					flag = 0;
					System.out.printf("%d\n",a);
				}
			}
			if (flag != 0)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}
		}
		return 0;
	}

}

