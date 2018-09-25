package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int i = 0;
	int[] sz = new int[500];
	int[] js = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (int m = 0;m < N;m++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   (sz[m]) = Integer.parseInt(tempVar2);
	   }
	   if (sz[m] % 2 != 0)
	   {
		   js[i] = sz[m];
		   i++;
	   }
	}
	for (int n = 1;n <= i;n++)
	{
		int e;
		for (int k = 0;k < i - n;k++)
		{
		if (js[k] > js[k + 1])
		{
			e = js[k];
			js[k] = js[k + 1];
			js[k + 1] = e;
		}
		}
	}
	for (int a = 0;a < i;a++)
	{
		if (a < i - 1)
		{
			System.out.printf("%d,",js[a]);
		}
		if (a == i - 1)
		{
			System.out.printf("%d",js[a]);
		}
	}
	return 0;
	}




}

