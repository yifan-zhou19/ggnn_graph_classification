package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int b;
		int k = 0;
		int[] a = new int[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < b;j++)
		{
			for (i = 0;i < j;i++)
			{
				if (a[i] == a[j])
				{
					i--;
					break;
				}
			}
			if (i == j)
			{
				c[k] = a[j],k++;
			}
		}
		k--;
		for (i = 0;i <= k;i++)
		{
			System.out.printf("%d",c[i]);
			if (i < k)
			{
				System.out.print(",");
			}
		}
	}

}

