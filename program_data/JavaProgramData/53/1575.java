package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int t;
		int j;
		int s;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			j = 0;
			while (a[j] != t && j < s)
			{
			j = j + 1;
			}
			if (j >= s)
			{
				a[s++] = t;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < s;i++)
		{
		System.out.printf(",%d",a[i]);
		}
		return 0;
	}

}

