package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[10];
		int i;
		int j;
		int x = 0;
		int y = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < 100;i++)
		{
			if (a[i] >= 2)
			{
				a[i + 1] = a[i] / 2;
				x++;
			}
		}
		for (j = 0;j < 100;j++)
		{
			if (b[j] >= 2)
			{
				b[j + 1] = b[j] / 2;
				y++;
			}
		}
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j] && a[i] != 0 && b[j] != 0)
				{
					c[k] = a[i];
				k++;


				}
			}
		}
		System.out.printf("%d",c[0]);
	}
}

