package <missing>;

public class GlobalMembers
{
	public static void move(int[] a, int n, int m)
	{
		int temp;
		int i;
		temp = a[n - 1];
		for (i = n - 1;i >= 1;i--)
		{
			a[i] = a[i - 1];
		}
		a[0] = temp;

		m--;
		if (m > 0)
		{
			move(a, n, m);
		}
	}

	public static void Main()
	{
		int[] number = new int[100];
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				number[i] = Integer.parseInt(tempVar3);
			}
		}
		move(number, n, m);
		System.out.printf("%d",number[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",number[i]);
		}
	}


}

