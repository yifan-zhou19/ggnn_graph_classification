package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		int j;
		int[] a = new int[100];
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
		for (j = 100;j >= 0;j--)
		{
			if (j >= n)
			{
				continue;
			}

			else if (j < n && j>0)
			{
				System.out.printf("%d ",a[j]);
			}
			else if (j == 0)
			{
			System.out.printf("%d",a[0]);
			}
		}


	}

}

