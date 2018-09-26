package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a;
		  int b;
		  int i;
		  int k;
		  int[] p = new int[n];
		  int[] q = new int[n];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  p[i] = 0;
			 q[i] = 0;
		  }
		  for (k = 0;;k++)
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
			 if (a == 0 && b == 0)
			 {
			 break;
			 }
			 for (i = 0;i < n;i++)
			 {

				if (a == i)
				{
					p[i] = p[i] + 1;
				}
				if (b == i)
				{
					q[i] = q[i] + 1;
				}
			 }
		  }
		   for (i = 0;i < n;i++)
		   {
				if (p[i] == 0 && q[i] == n - 1)
				{
					System.out.printf("%d",i);
				break;
				}
		   }
			if (i == n)
			{
					System.out.print("NOT FOUND");
			}



	   System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}
}

