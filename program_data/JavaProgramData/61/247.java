package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] f = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int n;
	int[] a = new int[20];
	int i;
	int j;
	for (i = 3;i <= 25;i++)
	{
		  f[i] = f[i - 1] + f[i - 2];
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (j = 0;j < n;j++)
	{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[j] = Integer.parseInt(tempVar2);
		  }
		  System.out.printf("%d\n",f[a[j]]);
	}
	return 0;
	}
}

