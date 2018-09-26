package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[][] a = new int[200][2];
		  int t = 0;
		  int r = 0;
		  int f = new int(int a,int b);
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i][0] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i][1] = Integer.parseInt(tempVar3);
			  }
			  if (f(a[i][0], a[i][1]) == 1)
			  {
				  t++;
			  }
			  if (f(a[i][0], a[i][1]) == -1)
			  {
				  r++;
			  }
		  }
		  if (t > r)
		  {
			 System.out.print("A");
		  }
		  else if (t == r)
		  {
			 System.out.print("Tie");
		  }
		  else
		  {
			 System.out.print("B");
		  }
	}

	public static int f(int a,int b)
	{

		if (a - b == -1 || a - b == 2)
		{
		   return 1;
		}
		else if (a == b)
		{
		   return 0;
		}
		else
		{
			return -1;
		}
	}

}

