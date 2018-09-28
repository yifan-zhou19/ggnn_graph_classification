package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[310];
		int b;
		int i;
		int j;
		int k;
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[1] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		if (x == '\n')
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 2;;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					x = tempVar4.charAt(0);
				}
				if (x == '\n')
				{
					break;
				}
			}
			for (j = 1;j <= i;j++)
			{
				for (k = 1;k <= i - j;k++)
				{
					if (a[k] > a[k + 1])
					{
						b = a[k];
						a[k] = a[k + 1];
						a[k + 1] = b;
					}
				}
			}
			for (j = i - 1;j >= 1;j--)
			{
				if (a[j] < a[i])
				{
					break;
				}
			}
			if (j >= 1)
			{
				System.out.printf("%d\n",a[j]);
			}
			else
			{
				System.out.print("No\n");
			}
		}
	}



}

