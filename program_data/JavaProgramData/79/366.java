package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int[] a = new int[99];
		int[] b = new int[99];
		int i = 0;
		int j;
		int k;
		int s;
		int[] c = new int[310];
		int x;
		int remain;
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
		while (a[i] != 0 && b[i] != 0)
		{
			i++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		s = i;
		for (i = 0;i < s;i++)
		{
			n = a[i],m = b[i],remain = 0;
			for (j = 1;j <= n;j++)
			{
				c[j] = j;
			}
			for (j = 0;j < a[i] - 1;j++)
			{
				if ((remain + m) % n == 0)
				{
					n--;
					remain = 0;
				}
				else
				{
					for (k = (remain + m) % n;k < n;k++)
					{
						c[k] = c[k + 1];
					}
					remain = (remain + m) % n - 1;
					n--;
				}
			}
			System.out.printf("%d\n",c[1]);
		}
	}













}

