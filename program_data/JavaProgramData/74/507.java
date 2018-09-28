package <missing>;

public class GlobalMembers
{
	public static int hui(int a)
	{
		int ne = 0;
		int b;
		b = a;
		while (b != 0)
		{
			ne = ne * 10 + b % 10;
			b = b / 10;
		}
		if (ne == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int su(int a)
	{
		int i;
		int b;
		int k = 1;
		b = a / 2;
		if (a == 1)
		{
			k = 0;
		}
		if (a == 2)
		{
			k = 1;
		}
		else
		{
		for (i = 2;i <= b;i++)
		{
			if (a % i == 0)
			{
				k = 0;
				break;
			}
			else
			{
				continue;
			}
		}
		}
		return k;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int[] a = new int[99];
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
			if (hui(i) == 1 && su(i) == 1)
			{
				a[j] = i;
				j++;
			}
			else
			{
				continue;
			}
		}
		if (j >= 1)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < j;i++)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		else
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}



}

