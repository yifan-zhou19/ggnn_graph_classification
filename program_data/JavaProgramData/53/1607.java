package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[101];
		int i;
		int t;
		int n;
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
		for (i = 0;i < n;i++)
		{
			if (b[a[i]] == 0)
			{
				System.out.printf("%d",a[i]);
				b[a[i]]++;
				break;
			}
		}
		t = i + 1;
		for (i = t;i < n;i++)
		{
			if (b[a[i]] == 0)
			{
				System.out.printf(",%d",a[i]);
				b[a[i]]++;
			}
		}
		return 0;
	}
}

