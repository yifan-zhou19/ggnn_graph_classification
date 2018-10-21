package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a = 0;
		  int b = 0;
		  for (int i = 0;i < n;i++)
		  {
			  int x;
			  int y;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  x = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  y = Integer.parseInt(tempVar3);
			  }
			  if (x - y == -1 || x - y == 2)
			  {
				  a++;
			  }
			  else if (x == y)
			  {
				  continue;
			  }
			  else
			  {
				  b++;
			  }


		  }
		  if (a > b)
		  {
			  System.out.print("A\n");
		  }
		  else if (a < b)
		  {
			  System.out.print("B\n");
		  }
		  else
		  {
			  System.out.print("Tie\n");
		  }







	}
}

