package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int t;
		int j;
		int c;
		int r;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 0;c < n;c++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[c] = Integer.parseInt(tempVar2);
			   }
		}
			scanf("\n");
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		int s = 0;
		int u = 0;
		while (u < n)
		{
				if (a[u] != k)
				{
			s = s + 1;
				}
			u = u + 1;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == k)
			{
				j = 1;
				while (a[i + j] == k)
				{
				   j = j + 1;
				}
			t = i;
			while (t < n)
			{
			a[t] = a[t + j];
			t++;
			}
			}
		}

		for (r = 0;r < s - 1;r++)
		{
			  System.out.printf("%d ",a[r]);
		}
		System.out.printf("%d",a[s - 1]);
	}
}

