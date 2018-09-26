package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] s = new int[10000];
		int k = 10000;
		int w = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				s[j] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{

			if (a[i] < k)
			{
				k = a[i];
			}
			if (b[i] > w)
			{
				w = b[i];
			}
		}

		for (i = k;i <= w - 1;i++)
		{
			if (s[i] == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",k,w);


		return 0;
	}
}

