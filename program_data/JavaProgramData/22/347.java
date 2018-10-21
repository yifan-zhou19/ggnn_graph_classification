package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int t;
		int u;
		int p;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		if (c == '\n')
		{
			System.out.print("No");
		}
		else
		{
			i = 1;
			while (c != '\n')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					c = tempVar4.charAt(0);
				}
				i++;
			}
			for (j = 0;j <= i - 3;j++)
			{
				for (k = 0;k <= i - 2 - j;k++)
				{
					if (a[k] > a[k + 1])
					{
						t = a[k];
						a[k] = a[k + 1];
						a[k + 1] = t;
					}
				}
			}
			for (u = i - 1;u >= 0;u--)
			{
				p = 1;
				if (a[u - 1] < a[u])
				{
					p = 0;
					break;
				}
			}
			if (p == 0)
			{
				System.out.printf("%d",a[u - 1]);
			}
			else
			{
				System.out.print("No");
			}
		}
	}


}

