package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i;
		int[] b = new int[301];
		int temp = 1;
		int t = 1;
		int j;
		int min;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;i <= n;i++)
		{
			temp = 1;
			for (j = 1;j <= i;j++)
			{
			if (b[j] == a[i])
			{
				temp = 0;
				break;
			}
			}
			if (temp == 1)
			{
				b[t] = a[i];
				t++;
			}
		}
			for (i = 1;i < t - 1;i++)
			{
			System.out.printf("%d,",b[i]);
			}
		System.out.printf("%d",b[t - 1]);
	}
}

