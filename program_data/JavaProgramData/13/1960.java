package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20001];
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
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
				 break;
				}
				else
				{
				continue;
				}

			}
			if (j == i)
			{
				if (i == 0)
				{
				System.out.printf("%d",a[i]);
				}
				else
				{
				 System.out.printf(" %d",a[i]);
				}
			}
			else
			{
				continue;
			}
		}
	}
}

