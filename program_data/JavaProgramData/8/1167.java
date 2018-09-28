package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int n;
	public static int m;
	public static int Main()
	{
	void input();
	void order1();
	void order2();
	void output();
	input();
	order1();
	order2();
	output();
	}

	public static void input()
	{
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 1;i <= m;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	}

	public static void order1()
	{
	int i;
	int j;
	int t;
	for (i = 1;i <= n - 1;i++)
	{
	 for (j = i + 1;j <= n;j++)
	 {
	  if (a[i] >= a[j])
	  {
		t = a[i];
		a[i] = a[j];
		a[j] = t;
	  }
	 }
	}
	}

	public static void order2()
	{
	int i;
	int j;
	int t;
	for (i = 1;i <= m - 1;i++)
	{
	 for (j = i + 1;j <= m;j++)
	 {
	  if (b[i] >= b[j])
	  {
		t = b[i];
		b[i] = b[j];
		b[j] = t;
	  }
	 }
	}
	}

	public static void output()
	{
	int i;
	for (i = 1;i <= n;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	for (i = 1;i < m;i++)
	{
	System.out.printf("%d ",b[i]);
	}
	System.out.printf("%d",b[m]);
	}
}

