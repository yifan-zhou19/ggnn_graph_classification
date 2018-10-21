package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		i = 0,j = 0;
		while (i < n)
		{
			if (a[i] != b)
			{
				a[j] = a[i];
				i++,j++;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < (j - 1);i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[j - 1]);
	}
}

