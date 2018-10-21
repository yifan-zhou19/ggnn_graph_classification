package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j = 0;
		  int k = 0;
		  int a;
		  int b;
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
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
		  {
		  j++;
		  }
		  else if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
		  {
		  k++;
		  }
		  else if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
		  {
		  ;
		  }
		  else
		  {
			  ;
		  }
		  }
		  if (j > k)
		  {
		  System.out.print("A");
		  }
		  else if (j < k)
		  {
		  System.out.print("B");
		  }
		  else
		  {
		  System.out.print("Tie");
		  }
	}
}

