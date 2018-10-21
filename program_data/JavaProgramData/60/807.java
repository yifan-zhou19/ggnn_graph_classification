package <missing>;

public class GlobalMembers
{
	public static int isSUSHU(int x)
	{
	  int z;
	  for (z = (x - 1);z >= 1;z--)
	  {
		  if (x % z == 0)
		  {
			break;
		  }
	  }
	  if (z == 1)
	  {
		return 1;
	  }
	return 0;
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int[][] sz = new int[LEN][2];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   j = 0;
	   for (i = 2;i <= (n - 2);i++)
	   {
		   if (isSUSHU(i) != 0)
		   {
			  if (isSUSHU(i + 2) != 0)
			  {
				sz[j][1] = i;
				sz[j][2] = i + 2;
				j++;
			  }
		   }
	   }
	   if (j == 0)
	   {
		System.out.print("empty");
	   }
	   else
	   {
		 for (i = 0;i < j;i++)
		 {
		  System.out.printf("%d %d\n",sz[i][1],sz[i][2]);
		 }
	   }
	return 0;
	}

}

