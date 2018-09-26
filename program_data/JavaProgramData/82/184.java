package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int b;
		int c;
		int i;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (b <= 140 && b >= 90 && c <= 90 && c >= 60)
			{
				a[j]++;
			}
			else
			{
				j++;
			}
		}
		b = a[0];
		for (i = 1;i <= j;i++)
		{
			if (a[i] > b)
			{
				b = a[i];
			}
		}
		System.out.printf("%d",b);
		return 0;
	}
}

