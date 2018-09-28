package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int a;
		  int b;
		  int c;
		  int n;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] p = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  p[i] = 0;
		  }
		  c = 0;
		  j = 0;


		  for (;;)
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
				 else
				 {
					 if (b == 0)
					 {
					 j = j + 1;
					 }
					 else
					 {
						 i = b;
						 p[i] = p[i] + i;
					 }
				 }
		  }


		  if (j == n - 1)
		  {
					System.out.print("0");
					c = 1;
		  }
		  else
		  {
			  for (i = 1;i < n;i++)
			  {
							  if (p[i] / i == (n - 1))
							  {
							  System.out.printf("%d",i);
							  }
							  c = c + 1;
			  }
		  }
		  if (c = 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  System.in.read();
		  System.in.read();
	}

}

