package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20];
		int[] b = new int[20];
		int x;
		int y;
		int i;
		int j;
		int a0;
		int b0;
		int ia;
		int jb;
		int word = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x,b[0] = y;
		for (i = 1;a0 != 1;i++)
		{
			if (a[i - 1] % 2 == 0)
			{
				a[i] = a[i - 1] / 2;
			}
			else
			{
				a[i] = (a[i - 1] - 1) / 2;
			}
			a0 = a[i];
		}
		ia = i;
		for (j = 1;b0 != 1;j++)
		{
			if (b[j - 1] % 2 == 0)
			{
				b[j] = b[j - 1] / 2;
			}
			else
			{
				b[j] = (b[j - 1] - 1) / 2;
			}
			b0 = b[j];
		}
		jb = j;
		for (i = 0;i < ia;i++)
		{
			for (j = 0;j < jb;j++)
			{
				if (b[j] == a[i])
				{
					break;
				}
			}
			if (b[j] == a[i])
			{
				break;
			}
		}
		System.out.printf("%d\n",a[i]);
	}
}

