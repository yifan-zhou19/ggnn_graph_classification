package <missing>;

public class GlobalMembers
{
	public static char huiwen(int n)
	{
		int i;
		int k;
		int a;
		int b;
		k = 1;
		i = 0;
		while (k <= n)
		{
			k = k * 10;
			i++;
		}
		k = k / 10;
		while (i != 1 && i != 0)
		{
			a = n / k;
			b = n % 10;
			if (a == b)
			{
				n = (n - k * a - b) / 10;
				i = i - 2;
				k = k / 100;
			}
			else
			{
				break;
			}
		}
		if (i == 1 || i == 0)
		{
			return ('T');
		}
		else
		{
			return ('F');
		}
	}
	public static char sushu(int n)
	{
		int i;
		int k;
		if (n == 2)
		{
			return ('T');
		}
		else
		{
			if (n % 2 == 0)
			{
				return ('F');
			}
			else
			{
				k = Math.sqrt((double)n);
				for (i = 3;i <= k;i = i + 2)
				{
					if (n % i == 0)
					{
						break;
					}
				}
				if (i > k)
				{
					return ('T');
				}
				else
				{
					return ('F');
				}
			}
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[1000];
		int no;
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
		no = 0;
		for (i = m;i <= n;i++)
		{
			if (sushu(i) == 'T' && huiwen(i) == 'T')
			{
				a[no] = i;
				no++;
			}
		}
		if (no == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < no;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}
}

