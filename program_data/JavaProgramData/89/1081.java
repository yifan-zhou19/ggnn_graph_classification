package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] bei = new int[10000];
		  int[] renshi = new int[10000];
		  int i;
		  int x;
		  int y;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (;;)
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
				 if (x == 0 && y == 0)
				 {
					 break;
				 }
				 bei[y]++;
				 renshi[x]++;
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (bei[i] >= (n - 1) && renshi[i] == 0)
			   {
				   System.out.printf("%d",i);
				   k++;
			   }
		  }
		  if (k == 0)
		  {
			  System.out.print("NOT FOUND");
		  }
	}
}

