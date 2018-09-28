package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int c;
		  int n;
		  int m;
		  int A;
		  int B;
		  int[][] x = new int[210][2];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (a = 0;a <= n - 1;a++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[a][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  x[a][1] = Integer.parseInt(tempVar3);
		  }
		  }
		  A = 0;
		  B = 0;
		  for (a = 0;a <= n - 1;a++)
		  {
							 if ((x[a][0] == (x[a][1] + 1)) || (x[a][0] == (x[a][1] - 2)))
							 {
							 B++;
							 }
							 else if ((x[a][0] == (x[a][1] - 1)) || (x[a][0] == (x[a][1] + 2)))
							 {
							 A++;
							 }
							 else
							 {
								 ;
							 }
		  }
		  if (A > B)
		  {
		  System.out.print("A");
		  }
		  else if (A < B)
		  {
		  System.out.print("B");
		  }
		  else
		  {
		  System.out.print("Tie");
		  }
	}

}

