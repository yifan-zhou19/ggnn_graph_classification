package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
		}
		int temp;
		int j;
		for (j = 0;j < m;j++)
		{
			temp = a[n - 1];
			for (i = n - 1;i >= 0;i--)
			{
				a[i] = (a + i - 1);
			}
			a[0] = temp;
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%d ",a[i]);
			}
			else
			{
				System.out.printf("%d",a[i]);
			}
		}
	}

}

