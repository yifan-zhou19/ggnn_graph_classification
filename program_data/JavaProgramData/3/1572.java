package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   int n;
	   int k;
	   int s = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }

	  int[] sz = new int[1000];
	  for (int i = 0;i < n;i++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   sz[i] = Integer.parseInt(tempVar3);
	   }
	  }
	   for (int z = 0;z < n;z++)
	   {
	   for (int m = z + 1;m < n;m++)
	   {
		if (k == sz[z] + sz[m])
		{
		  s++;
		}
	 if (k != (sz[z] + sz[m]))
	 {
		  s += 0;
	 }
	   }
	   }
	  if (s == 0)
	  {
	   System.out.print("no");
	  }
	if (s != 0)
	{
	   System.out.print("yes");
	}
	 return 0;
	}


}

