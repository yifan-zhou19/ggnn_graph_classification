package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int sa = 0;
		  int sb = 0;
		  int a;
		  int b;
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
							  a = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  b = Integer.parseInt(tempVar3);
						  }
						  if (a - b == -1 || a - b == 2)
						  {
							  sa++;
						  }
						  else if (a == b)
						  {
						  }
						  else
						  {
							  sb++;
						  }
		  }
		  if (sa > sb)
		  {
			  System.out.print("A\n");
		  }
		  else if (sa == sb)
		  {
			  System.out.print("Tie\n");
		  }
		  else
		  {
			  System.out.print("B\n");
		  }
	}
}

