package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int rev = int x;
		int prime = int y;
		int m;
		int n;
		int i;
		int j = 0;
		int k;
		int[] a = new int[100];
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
		i = m;
		while (i <= n)
		{
			if (rev(i) == 1 && prime(i) == 1)
			{
				a[j] = i;
				j++;
			}
			i++;
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (k = 1;k < j;k++)
			{
				System.out.printf(",%d",a[k]);
			}
		}
		return 0;
	}

	public static int rev(int x)
	{
		int a = 0;
		int b;
		int temp;
		temp = x;
		while (x > 0)
		{
			b = x % 10;
			a = a * 10 + b;
			x = x / 10;
		}
		if (temp == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int prime(int y)
	{
		int c;
		for (c = 2;c <= y / 2;c++)
		{
			if (y % c == 0)
			{
				break;
			}
		}
		if (c <= y / 2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}



}

