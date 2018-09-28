package <missing>;

public class GlobalMembers
{
	public static int hui(int a)
	{
		int b = 0;
		int c;
		c = a;
		do
		{
			b = 10 * b + a % 10;
			a = (a - a % 10) / 10;
		}while (a != 0);
		if (b == c)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int sui(int a)
	{
		int i;
		for (i = 2;i < a;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i == a)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		for (i = m,j = 0;i <= n;i++)
		{
			if (hui(i) == 1 && sui(i) == 1)
			{
				a[j++] = i;
			}
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < j - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[j - 1]);
		}
	}

}

