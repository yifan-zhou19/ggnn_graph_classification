package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j;
	int[] a = new int[20];
	a[0] = 1;
	a[1] = 1;
	for (j = 2;j < 20;j++)
	{
	a[j] = a[j - 1] + a[j - 2];
	}
	int n;
	int i;
	int t;
	int[] b = new int[20];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 t = Integer.parseInt(tempVar2);
	 }
	 b[i] = a[t - 1];
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d\n",b[i]);
	}
	System.in.read();
	System.in.read();
	}


}

