package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int[] b = new int[26];
		int i;
		int j;
		int n;
		int max = 1;
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
			b[i] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
			  if (a[i - j] >= a[i] != 0 && b[i - j] > (b[i] - 1))
			  {
				  b[i] = b[i - j] + 1;
			  }
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.printf("%d",max);
	}
}

