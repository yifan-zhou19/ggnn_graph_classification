package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] sz = new int[500];
	int[] js = new int[500];
	int k = 0;
	int e;
	int l;
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
			 sz[i] = Integer.parseInt(tempVar2);
		 }
		 if (sz[i] % 2 == 1)
		 {
			js[k] = sz[i];
			k++;
		 }
	}
	for (l = 1;l < k;l++)
	{
	   for (i = 0;i < k - l;i++)
	   {
		   if (js[i] > js[i + 1])
		   {
			  e = js[i + 1];
			  js[i + 1] = js[i];
			  js[i] = e;
		   }
	   }
	}
	for (i = 0;i < k;i++)
	{
	   if (i < k - 1)
	   {
		   System.out.printf("%d,",js[i]);
	   }
	   if (i == k - 1)
	   {
		   System.out.printf("%d",js[i]);
	   }
	}

	return 0;
	}
}

