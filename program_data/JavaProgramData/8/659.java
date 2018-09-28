package <missing>;

public class GlobalMembers
{
	public static int temp;
	public static int flag = 0;
	public static int time;
	public static void paixu(int[] a, int n, int time)
	{
		int i;
		int j;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n - 1 - i;j++)
	{
	if (a[j] > a[j + 1])
	{
	temp = a[j];
	a[j] = a[j + 1];
	a[j + 1] = temp;
	}
	}
	}

	for (i = 0;i < n;i++)
	{
	if ((time == 1) && i == 0)
	{
		System.out.printf("%d",a[i]);
	}
	else
	{
		System.out.printf(" %d",a[i]);
	}
	}
	}
	public static int Main()
	{
	int[] a = new int[100];
	int[] b = new int[100];
	int n1;
	int n2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n2 = Integer.parseInt(tempVar2);
	}
	int i;
	int j;
	for (i = 0;i < n1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n2;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}
	paixu(a, n1, 1);
	paixu(b, n2, 2);
	}


}

