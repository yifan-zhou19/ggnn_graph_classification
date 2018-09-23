package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int j;
	int[] a = new int[5];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (;n > 0;) // ? n>0 ?? a>0
	{
	a[i] = n % 10;
	i++;
	n = n / 10;
	}
	for (j = 0;j < i;j++)
	{
	System.out.printf("%d",a[j]);
	}
	System.in.read();
	System.in.read();
	}

}

