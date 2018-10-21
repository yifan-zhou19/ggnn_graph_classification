package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] t = new int[100];
		int n;
		int i;
		int j;
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
		i = 0;
		for (j = n - 1;j >= 0;j--)
		{
			t[i] = a[j];
			i = i + 1;
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",t[j]);
		}
		System.out.printf("%d",t[n - 1]);
	}
}

