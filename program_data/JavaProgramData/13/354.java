package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100000];
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		System.out.printf("%d",a[0]);
		i = 1;
		while (i < n)
		{
			int j = 0;
			int x = 0;
			while (j < i)
			{
				if (a[i] == a[j])
				{
					x = 1;
					break;
				}
				j++;
			}
			if (x == 0)
			{
			System.out.printf(" %d",a[i]);
			}
			i++;
		}
	}


}

