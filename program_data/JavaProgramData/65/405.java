package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a = 0;
		  int b = 0;
		  int n;
		  int i;
		  int j;
		  int k;
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
							  j = Integer.parseInt(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  k = Integer.parseInt(tempVar3);
						  }
						   switch (j - k)
						   {
						   case 1:
							   b++;
							   break;
							case -1:
								a++;
								break;
							 case 0:
								 break;
							 case 2:
								 a++;
								 break;
							 case -2:
								 b++;
								 break;
						   }
		  }
		  if (a > b)
		  {
		  System.out.print("A");
		  }
		   if (a == b)
		   {
		  System.out.print("Tie");
		   }
		   if (a < b)
		   {
		  System.out.print("B");
		   }
	}
}

