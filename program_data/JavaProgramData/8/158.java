package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int[] a1 = new int[50];
	public static int[] a2 = new int[50];
	public static void Main()
	{
		void sort(int b[],int n);
		void scn();
		void pr(int c[],int m);
		scn();
		sort(a1, n1);
		sort(a2, n2);
		pr(a1, n1);
		pr(a2, n2);
	}
	public static void sort(int[] b, int n)
	{
		int i;
		int j;
		int t;
		for (j = 0;j < n - 1;j++)
		{
		for (i = 0;i < n - 1;i++)
		{
			if (b[i] > b[i + 1])
			{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
			}
		}
		}
	}
	public static void scn()
	{
		int i;
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
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a1[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a2[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void pr(int[] c, int m)
	{
		int i;
		for (i = 0;i < m;i++)
		{
			if (i == m - 1 && c[i] == a2[m - 1])
			{
			System.out.printf("%d",c[i]);
			}
			else
			{
				System.out.printf("%d ",c[i]);
			}
		}
	}
}

