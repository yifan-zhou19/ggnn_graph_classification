package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int p;
		int count = 0;
		int e = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int[] d = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						c[i] = 0;
		}
		for (i = 0;i < 10000;i++)
		{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								a[i] = Integer.parseInt(tempVar2);
							}
							String tempVar3 = ConsoleInput.scanfRead(" ");
							if (tempVar3 != null)
							{
								b[i] = Integer.parseInt(tempVar3);
							}
							e++;
							if (a[i] == 0 && b[i] == 0)
							{
							break;
							}
		}
		for (i = 0;i < e;i++)
		{
						p = b[i];
						c[p]++;
						p = a[i];
						c[p] = -10000;
		}
		for (i = 0;i < n;i++)
		{
						if (c[i] == n - 1)
						{
								   System.out.printf("%d\n",i);
								   count = 1;
						}
		}
		if (count == 0)
		{
					System.out.print("NOT FOUND");
		}
		return 0;
	}
}

