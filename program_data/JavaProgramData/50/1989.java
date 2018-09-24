package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int f;
		int z;
		int i;
	int[] a = {0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	i = 1;
	f = 12;
	while (i <= 12)
	{
		f = f + a[i];
	f = f % 7;
	if (f + w == 7)
	{
		z = 7;
	}
	else
	{
		z = (f + w) % 7;
	}
	if (z == 5)
	{
		System.out.printf("%d\n",i);
	}
	i++;
	}



	 return 0;
	}
}

