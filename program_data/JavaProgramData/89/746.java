package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[][] a = new int[20000][2];
	  int z = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][1] = Integer.parseInt(tempVar3);
		  }
		  if (a[i][0] == 0 && a[i][1] == 0)
		  {
			 break;
		  }
	  }
	  for (int k = 0;k < n;k++)
	  {
		  int c = 0;
		  for (int j = 0;j < i;j++)
		  {
			  if (k == a[j][0])
			  {
				 break;
			  }
			  else if (k == a[j][1])
			  {
				 c++;
			  }
		  }
		  if (c == n - 1)
		  {
			 System.out.printf("%d",k);
		  }
		  else
		  {
			 z++;
		  }
	  }
	   if (z == n)
	   {
	   System.out.print("NOT FOUND");
	   }
	   return 0;
	}
}

