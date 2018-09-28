package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void order(int p,int q,int r[]);
		int n1;
		int n2;
		int i;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		order(n1, n2, a);
		return 0;
	}
	public static void order(int n1, int n2, int[] a)
	{
		int i;
		for (i = n1 - n2 + 1;i <= n1;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n1 - n2;i++)
		{
			System.out.printf(" %d",a[i]);
		}
	}

}

