package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int[] s = new int[1000];
		int[] b = new int[1000];
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
			s[i] = 0;
			b[0] = 1;
			b[1] = 1;
			for (j = 2;j < a[i];j++)
			{
				b[j] = b[j - 1] + b[j - 2];
			}
			for (j = 0;j < a[i];j++)
			{
				s[i] += b[j];
			}
		System.out.printf("%d\n",b[j - 1]);
		}
		return 0;
	}

}

