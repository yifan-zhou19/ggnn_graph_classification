package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int o = 0;
		int flag;
		int i;
		int j;
		int k = 0;
		int l;
		int[] b = new int[100];
		int p;
		int[] a = new int[20000];
		int v;
		int w;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			flag = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
			continue;
			}
			a[k] = i;
			k++;

		}
		for (l = 0;l < k;l++)
		{
			if (a[l] < 1000)
			{
				v = a[l] / 100,x = a[l] % 10,w = a[l] / 10 - v * 10;
				if (v == x)
				{
					b[o] = a[l];
				o = o++;
				}
			}
			else if (a[l] < 10000)
			{
				v = a[l] / 1000,w = a[l] / 100 - v * 10,y = a[l] % 10,x = a[l] / 10 - v * 100 - w * 10;
				if (v == y && w == x)
				{
					b[o] = a[l];
				o = o++;
				}
			}
			else if (a[l] >= 10000)
			{
				v = a[l] / 10000,w = a[l] / 1000 - v * 10,x = a[l] / 100 - v * 100 - w * 10,z = a[l] % 10,y = a[l] / 10 - v * 1000 - w * 100 - x * 10;
				if (v == z && w == y)
				{
					b[o] = a[l];
				o = o++;
				}
			}
		}

		if (o == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (p = 0;p < o - 1;p++)
			{
				System.out.printf("%d,",b[p]);
			}
			System.out.printf("%d",b[o - 1]);
		}

	}

}

