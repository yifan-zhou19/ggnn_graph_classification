package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int[] c = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < a;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  c[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  int k = 0;
		  for (i = 0;i < a;i++)
		  {
		  if (c[i] != b)
		  {
					 if (k == 0)
					 {
						 System.out.printf("%d",c[i]);
						 k = 1;
					 }
					 else
					 {
					 System.out.printf(" %d",c[i]);
					 }
		  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

