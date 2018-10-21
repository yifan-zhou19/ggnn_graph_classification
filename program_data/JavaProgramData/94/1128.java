package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int flag = 0;
		int n;
		int temp;
		int[] a = new int[500];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
		if (b % 2 != 0)
		{
			a[j] = b;
		flag++;
		j++;
		}
		}
		for (j = 0;j < flag;j++)
		{
			b = a[j];
			for (i = j;i < flag;i++)
			{
				if (a[i] < a[j])
				{
					temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
				}
			}
		}
		for (i = 0;i < flag - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
	System.out.printf("%d",a[flag - 1]);
		return 0;
	}
}

