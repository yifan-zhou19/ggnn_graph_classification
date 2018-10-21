package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[101];
	 int i;
	 int j;
	 int n;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 i = m = 1;
	 while (i < n + 1)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	  i = i + 1;
	 }
	 i = j = 1;
	for (j = 1;j <= n - 1;j++)
	{
	for (i = 1;i <= n - j;i++)
	{
	if (a[i] > a[i + 1])
	{
		m = a[i];
		a[i] = a[i + 1];
		a[i + 1] = m;
	}
	}
	}

	 System.out.printf("%d\n",a[n]);
	 System.out.printf("%d\n",a[n - 1]);
	return 0;
	}

}

