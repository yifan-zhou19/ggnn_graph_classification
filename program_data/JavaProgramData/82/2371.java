package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int I;
		int n;
		int[] a = new int[100];
		int i;
		int[] b = new int[100];
		int p = 0;
		int s = 0;
		int q = 0;
		int sum = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (I = 0;I < n;I++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[I] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[I] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				q = 1;
			}
			if (q == 1 && (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90))
			{
				if (i != n - 1)
				{
					s++;
				}
				else
				{
					sum = sum > (s + 1)?sum:(s + 1);
				}
			}
			if (q == 1 && !(a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90))
			{
				sum = sum > s != 0?sum:s;
				s = 0;
				q = 0;
			}
		}
		System.out.printf("%d\n",sum);

	}
}

