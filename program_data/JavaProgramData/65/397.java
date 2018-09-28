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
		  int A = 0;
		  int B = 0;
		  int c = 0;
		  for (int i = 0;i < n;i++)
		  {
		   int a;
		   int b;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b = Integer.parseInt(tempVar3);
		   }
		   if (a == b)
		   {
		   c++;
		   }
		   else if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		   {
		   A++;
		   }
		   else
		   {
		   B++;
		   }
		  }
		  if (A > B)
		  {
		  System.out.print("A\n");
		  }
		  else if (A < B)
		  {
		  System.out.print("B\n");
		  }
		  else
		  {
		  System.out.print("Tie\n");
		  }

	}

}

