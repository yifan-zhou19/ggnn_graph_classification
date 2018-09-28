package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		}
		i = n - 1;
		while (i > 0)
		{
			System.out.printf("%d ",a[i]);
			i = i - 1;
		}
		System.out.printf("%d",a[0]);
	}

}

