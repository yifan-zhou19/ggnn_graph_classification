package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int a;
	   int b;
	   int[][] sz = new int[2][200];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sz[0][i] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 sz[1][i] = Integer.parseInt(tempVar3);
		 }
	   }
	   for (i = 0,a = 0,b = 0;i <= n - 1;i++)
	   {
		if (sz[0][i] != 0 && sz[1][i] != 0 && sz[0][i] != sz[1][i])
		{
			   if (sz[0][i] > sz[1][i])
			   {
				   b = b + 1;
			   }
			else if (sz[0][i] < sz[1][i])
			{
				a = a + 1;
			}
		}
		else if (sz[0][i] == sz[1][i])
		{
			continue;
		}
		else if (sz[0][i] == 0 && sz[1][i] == 1)
		{
			a = a + 1;
		}
		else if (sz[0][i] == 0 && sz[1][i] == 2)
		{
			b = b + 1;
		}
		else if (sz[1][i] == 0 && sz[0][i] == 1)
		{
			b = b + 1;
		}
		else if (sz[1][i] == 0 && sz[0][i] == 2)
		{
			a = a + 1;
		}
	   }
	  if (a > b)
	  {
		  System.out.print("A");
	  }
	  else if (a < b)
	  {
		  System.out.print("B");
	  }
	  else if (a == b)
	  {
		  System.out.print("Tie");
	  }
	  return 0;
	}



}

