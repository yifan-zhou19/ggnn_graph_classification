package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[1000000];
		int b;
		int i;
		int u_r;
		int u_c;
		int l_r;
		int l_c;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = n * n;
		for (i = 0;i < b;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < b;i++)
		{
			if (a[i] == 0)
			{
				u_r = i / n;
				u_c = i % n - 1;
				break;
			}
		}
		for (i = b - 1;i >= 0;i--)
		{
			if (a[i] == 0)
			{
				l_r = i / n;
				l_c = i % n - 1;
				break;
			}
		}
		count = (l_r - u_r - 1) * (l_c - u_c - 1);
		System.out.printf("%d",count);
	}



}

