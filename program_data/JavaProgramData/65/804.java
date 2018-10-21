package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  int k;
	  int t = 0;
	  int i = 0;
	  int o = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (k = 0;k < n;k++)
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
	  if (a == b)
	  {
		  t++;
	  }
	  else if (a == 0 && b == 1)
	  {
		  i++;
	  }
	  else if (a == 0 && b == 2)
	  {
		  o++;
	  }
	  else if (a == 1 && b == 0)
	  {
		  o++;
	  }
	else if (a == 1 && b == 2)
	{
		i++;
	}
	else if (a == 2 && b == 0)
	{
		i++;
	}
	 else if (a == 2 && b == 1)
	 {
		 o++;
	 }
	  }
		  if (i > o)
		  {
			  System.out.print("A");
		  }
		  else if (i < o)
		  {
			  System.out.print("B");
		  }
		  else if (i == o)
		  {
			  System.out.print("Tie");
		  }

	return 0;
	}
}

