package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int t;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] a = new char[100][10];
	String c = new String(new char[11]);
	int[] b = new int[100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if (b[i] < 60)
	{
	 b[i] = 0;
	}
	}
	for (k = 1;k <= n;k++)
	{
	for (i = 0;i < n - k;i++)
	{
	 if (b[i] < b[i + 1])
	 {
	   t = b[i];
	   b[i] = b[i + 1];
	   b[i + 1] = t;
	   c = a[i];
	   a[i] = a[i + 1];
	   a[i + 1] = c;
	 }
	}
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",a[i]);
	}
	return 0;
	}

}

