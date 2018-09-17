package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[2000];
		int[] b = new int[2000];
		int i;
		int j;
		int k;
		int p;
		int l = 0;
		a[0] = 1;
		b[0] = 1;

	/*	for(p=0;p<1000;p++)
		{
			a[p]=1;
			b[p]=1;
		}
	*/

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


		for (i = 0;x != 0;i++)
		{
			a[i] = x;
			x = x / 2;
		}
		for (j = 0;y != 0;j++)
		{
			b[j] = y;
			y = y / 2;
		}

		for (k = 0;k <= i != 0 && k <= j;k++)
		{
			if (a[i - k] == b[j - k])
			{
				continue;
			}
			else
			{
				System.out.printf("%d",a[i - k + 1]);
				l = 1;
				break;
			}
		}
		if (l == 0)
		{
			System.out.printf("%d",a[i - k + 1]);
		}
	}
}

