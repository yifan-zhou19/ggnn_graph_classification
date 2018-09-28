package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		return 0;
	}
	public static int find()
	{
		int i;
		int j;
		for (i = 1;i <= n - 1;i++)
		{
		   for (j = i + 1;j <= n;j++)
		   {
			   if (a[i] + a[j] == k)
			   {
				 return 1;
			   break;
			   }
		   }
		}
		 return 0;
	}
	public static int n;
	public static int k;
	public static int[] a = new int[1000];
	public static int m;
	public static int Main()
	{
		read();
		m = find();
		if (m == 0)
		{
		System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

