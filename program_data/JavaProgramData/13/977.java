package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
			}
			if (j == i)
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}
}

