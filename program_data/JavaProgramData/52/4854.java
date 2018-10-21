package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int s;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < s;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = s - 1;j > -1;j--)
			{
				a[j + 1] = a[j];
			}
			a[0] = a[s];
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < s;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

}

