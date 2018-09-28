package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int[] c = new int[20];
		int[] d = new int[20];
		int a;
		int b;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			a = 1;
			b = 1;
			if (c[i] == 1 || c[i] == 2)
			{
			   d[i] = 1;
			}
			else if (c[i] == 3)
			{
				d[i] = 2;
			}
			else
			{
				for (int k = 3;k < c[i];k++)
				{

					f = b;
					b = a + b;
					a = f;
					d[i] = a + b;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",d[i]);
		}
		return 0;
	}




}

