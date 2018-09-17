package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		for (k = 0;k < 100;k++)
		{
			f[k] = 0;
		}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			if (a == 1 || b == 1)
			{
				System.out.print("1");
			}
			else
			{
			if (a != b)
			{
		d[0] = a;
		e[0] = b;
		for (i = 0;i < 100;i++)
		{
			d[i + 1] = d[i] / 2;
		}
		for (j = 0;j < 100;j++)
		{
			e[j + 1] = e[j] / 2;
		}
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				if (d[i] == e[j] && d[i] != 0)
				{
				for (k = 0;k < 100;k++)
				{
					if (f[k] == 0)
					{
						f[k] = d[i];
					}
				}
					break;
				}
			}
		}
		System.out.printf("%d",f[0]);
			}
			else
			{
				System.out.printf("%d",a);
			}
			}


		return 0;
	}
}

