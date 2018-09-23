package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int[] a = new int[20000];
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
			t = 0;
			if (i == 0)
			{
				System.out.printf("%d",a[0]);
			}
			else
			{
				for (j = 0;j < i;j++)
				{
					if (a[i] == a[j])
					{
						t = t + 1;
					}
				}
				if (t == 0)
				{
					System.out.printf(" %d",a[i]);
				}
			}
		}
		return 0;
	}
}

