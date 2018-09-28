package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	int[] sz = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	int i;
	int s = 0;
	for (i = 0;i < N;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar2);
	   }
	}
	int[] jsz = new int[500];
	int j = 0;
	for (i = 0;i < N;i++)
	{
	  if (sz[i] % 2 != 0)
	  {
	  s++;
	  }
	}
	for (i = 0;i < N;i++)
	{
	  if (sz[i] % 2 != 0)
	  {
		jsz[j] = sz[i];
		j++;
	  }
	}
	int e;
	int f;
	for (f = 1;f <= s;f++)
	{
	  for (i = 0;i < s - f;i++)
	  {
	if (jsz[i] > jsz[i + 1])
	{
	   e = jsz[i + 1];
	   jsz[i + 1] = jsz[i];
	   jsz[i] = e;
	}
	  }
	}
	System.out.printf("%d",jsz[0]);
	for (i = 1;i < s;i++)
	{
	   System.out.printf(",%d",jsz[i]);
	}
	return 0;
	}

}

