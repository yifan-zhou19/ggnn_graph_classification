package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j;
		int k = 0;
		int s = 0;
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
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
						for (j = 0;j < i;j++)
						{
										if (a[i] == a[j])
										{
										break;
										}
										s++;
						}
						if (s == i)
						{
								  k++;
								  b[k] = a[i];
						}
						s = 0;
		}
		for (i = 0;i < k;i++)
		{
						System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k]);
		scanf(" ");
		return 0;
	}
}

