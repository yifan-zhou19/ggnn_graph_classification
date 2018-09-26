package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int e;
	  int q = 0;
	  int kaishi;
	  int jieshu;
	  int[] ks = new int[100000];
	  int[] js = new int[100000];
	  int[] sz = new int[100000];
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
		   ks[i] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   js[i] = Integer.parseInt(tempVar3);
	   }
	  }
	kaishi = ks[0];
	for (i = 1;i < n;i++)
	{
		if (kaishi > ks[i])
		{
			kaishi = ks[i];
		}
	}
	jieshu = js[0];
	for (i = 1;i < n;i++)
	{
		if (jieshu < js[i])
		{
			jieshu = js[i];
		}
	}
	for (i = kaishi;i <= jieshu;i++)
	{
		if (i != jieshu)
		{
			sz[i] = 1;
		}
		else
		{
			sz[i] = 0;
		}
	}
	for (i = 0;i < n;i++)
	{
		for (j = ks[i];j < js[i];j++)
		{
			if (sz[j] == 1)
			{
				sz[j] = 0;
			}
		}
	}
	for (i = kaishi;i <= jieshu;i++)
	{
		if (sz[i] == 1)
		{
			q++;
		}
	}
	if (q == 0)
	{
	   System.out.printf("%d %d",kaishi,jieshu);
	}
	 else
	 {
		 System.out.print("no");
	 }
	return 0;
	}





}

