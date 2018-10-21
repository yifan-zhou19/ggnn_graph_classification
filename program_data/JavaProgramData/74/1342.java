package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int k;
		int i;
		k = Math.sqrt(a);
		for (i = 2;i <= k;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i <= k)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int huiwenshu(int num)
	{
			int over = 0;
			int quotient = 0;

			quotient = num;
			while (true)
			{
					over = over * 10 + quotient % 10;
					quotient = quotient / 10;
					if (quotient == 0)
					{
							break;
					}
			}

			if (num == over)
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
		int[] a = new int[10000];
		int k = 0;
		int i;
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
			if ((sushu(i) == 1) && (huiwenshu(i) == 1))
			{
				a[k] = i;
				k++;
			}
		}

		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < k;i++)
			{
			System.out.printf(",%d",a[i]);
			}
		}
	}

}

