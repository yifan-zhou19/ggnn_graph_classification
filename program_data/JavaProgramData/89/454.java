package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = new int(int a[],int k);
		int n;
		int[] i = new int[65535];
		int[] j = new int[65535];
		int m;
		int k;
		int s;
		int t;
		int p;
		int[] a = new int[65535];
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (s = 0;s < n * (n - 1) / 2;s++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i[s] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j[s] = Integer.parseInt(tempVar3);
				}
				if (i[s] == 0 && j[s] == 0)
				{
					break;
				}
		}
		for (t = 0;t < n;t++)
		{
				for (k = 0;k < s;k++)
				{
						if (j[k] == t)
						{
						   a[t] = a[t] + 1;
						}
				}
		}
		for (k = 0;k < n;k++)
		{
				if (a[k] == n - 1)
				{
						   m = k;
						   p = 1;
						   break;
				}
		}
		if (p == 0)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
				for (k = 0;k < s;k++)
				{
						if (i[k] == m)
						{
								   p = 0;
								   break;
						}
				}
				if (p == 0)
				{
					System.out.print("NOT FOUND");
				}
				else
				{
					System.out.printf("%d",m);
				}
		}
		System.in.read();
		System.in.read();
	}

}

