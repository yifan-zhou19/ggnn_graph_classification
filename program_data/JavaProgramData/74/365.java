package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int temp;
		int p;
		int k;
		int x = 0;
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
		for (i = m;i <= n;i++)
		{
			j = 2;
			while (i % j != 0 && j < i)
			{
				j++;
			}
			if (j == i)
			{
				temp = i;
				p = 0;
				while (temp > 0)
				{
					k = temp % 10;
					p = p * 10 + k;
					temp = temp / 10;
				}
				if (i == p)
				{
					a[x] = i;
					x++;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < x - 1;i++)
			{

				System.out.printf("%d,",a[i]);
			}
				System.out.printf("%d\n",a[x - 1]);

		}
	}
}

