package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int a = 0;
		  int b = 0;
		  int x;
		  int y;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y = Integer.parseInt(tempVar3);
			 }
			 if (y - x == 0)
			 {
				 continue;
			 }
			 if (x - y == -1 || x - y == 2)
			 {
				 a++;
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
		  if (a < b)
		  {
			  System.out.print("B\n");
		  }
		  if (a == b)
		  {
			  System.out.print("Tie\n");
		  }
	}

}

