package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int i = 0;
		  int j = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n-- != 0)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  if (a == 0 && b == 1)
			  {
				  i++;
			  }
			  if (a == 0 && b == 2)
			  {
				  j++;
			  }
			  if (a == 1 && b == 0)
			  {
				  j++;
			  }
			  if (a == 1 && b == 2)
			  {
				  i++;
			  }
			  if (a == 2 && b == 0)
			  {
				  i++;
			  }
			  if (a == 2 && b == 1)
			  {
				  j++;
			  }

		  }
		  if (i > j)
		  {
			  System.out.print("A");
		  }
		  if (i < j)
		  {
			  System.out.print("B");
		  }
		  if (i == j)
		  {
			  System.out.print("Tie");
		  }
		  return 0;
	}

}

