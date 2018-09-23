package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int n1;
		int n2;
		int i;
		int j;
		int t;
		int number = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
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
		for (i = 1;;i++)
		{
			if (x >= Math.pow(2,i - 1) && x < Math.pow(2,i))
			{
				n1 = i;
				break;
			}
		}
		for (i = 1;;i++)
		{
			if (y >= Math.pow(2,i - 1) && y < Math.pow(2,i))
			{
				n2 = i;
				break;
			}
		}
		a[n1] = x;
		b[n2] = y;
		for (i = n1;i >= 2;i--)
		{
			if (a[i] % 2 == 0)
			{
					t = (a[i] - Math.pow(2,i - 1)) / 2;
					a[i - 1] = Math.pow(2,i - 2) + t;
			}
			else
			{
					t = (a[i] - 1 - Math.pow(2,i - 1)) / 2;
					a[i - 1] = Math.pow(2,i - 2) + t;
			}
		}
		for (j = n2;j >= 2;j--)
		{
			if (b[j] % 2 == 0)
			{
					t = (b[j] - Math.pow(2,j - 1)) / 2;
					b[j - 1] = Math.pow(2,j - 2) + t;
			}
			else
			{
					t = (b[j] - 1 - Math.pow(2,j - 1)) / 2;
					b[j - 1] = Math.pow(2,j - 2) + t;
			}
		}
		for (i = 1;i <= n1 != 0 || i <= n2;i++)
		{
			if (a[i] == b[i])
			{
				number = number + 1;
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d\n",a[number]);
	}

}

