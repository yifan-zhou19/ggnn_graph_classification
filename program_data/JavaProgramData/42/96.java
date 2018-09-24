package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int c;
		k = 0;
		c = 1;
		int b;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		for (j = 0;j < i;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[j] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < i;j++)
		{
			if (a[j] != b)
			{
				k++;
			}
				//printf("%d ",a[j]);
		}
		//printf("%d ",k);
		for (j = 0;j < i;j++)
		{
			if (a[j] != b)
			{
				if (c < k)
				{
					System.out.printf("%d ",a[j]);
					c++;
				}
				else
				{
					System.out.printf("%d",a[j]);
				}
			}
		}
	}
}

