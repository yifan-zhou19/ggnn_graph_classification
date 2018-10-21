package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[300000];
	int i;
	int j;
	int k;
	int[] b = new int[300000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i < n + 1;i++)
	{
		a[i - 1] = i;
	b[i - 1] = 0;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		j = Integer.parseInt(tempVar3);
	}
	for (;!(k == 0 && j == 0);)
	{
	a[k] = 0;
	b[j]++;
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		k = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		j = Integer.parseInt(tempVar5);
	}
	}
	int f = 1;
	for (i = 0;i < n;i++)
	{
	 if (a[i] != 0 && b[i] == n - 1)
	 {
	 System.out.printf("%d\n",a[i] - 1);
	 f = 0;
	 }
	}
	if (f == 1)
	{
	System.out.print("Not Found");
	}
	System.in.read();
	System.in.read();
	}
}

