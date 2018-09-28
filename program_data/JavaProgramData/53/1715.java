package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int j;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		b[0] = a[0];
		t = 1;
		for (i = 1;i <= n;i++)
		{
			s = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < t;j++)
			{
				if (a[i] == b[j])
				{
					s = 1;
					break;
				}
			}
			if (s == 0)
			{
				b[t] = a[i];
				t = t + 1;
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < t - 1;i++)
		{
		System.out.printf(",%d",b[i]);
		}
	}
}

