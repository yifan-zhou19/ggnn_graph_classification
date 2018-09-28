package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int i;
		int n;
		int[] a = new int[11];
		int[] b = new int[11];
		float n1 = 0F;
		float n2 = 0F;
		float n3 = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (System.in.read() == 10)
		{
			;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		if (System.in.read() == 10)
		{
			;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		if (System.in.read() == 10)
		{
			;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] < 60)
			{
				a[i] = 0;
			}
			else if (a[i] <= 63)
			{
				a[i] = 10;
			}
			else if (a[i] <= 67)
			{
				a[i] = 15;
			}
			else if (a[i] <= 71)
			{
				a[i] = 20;
			}
			else if (a[i] <= 74)
			{
				a[i] = 23;
			}
			else if (a[i] <= 77)
			{
				a[i] = 27;
			}
			else if (a[i] <= 81)
			{
				a[i] = 30;
			}
			else if (a[i] <= 84)
			{
				a[i] = 33;
			}
			else if (a[i] <= 89)
			{
				a[i] = 37;
			}
			else if (a[i] <= 100)
			{
				a[i] = 40;
			}
		}
		for (i = 1;i <= n;i++)
		{
			n1 = n1 + a[i] * b[i];
		}
		for (i = 1;i <= n;i++)
		{
			n2 = n2 + b[i];
		}
		n3 = n1 / 10 / n2;
		System.out.printf("%.2f\n",n3);
	}
}

