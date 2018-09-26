package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int I;
		  int j = 1;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int b;
		  int c;
		  int[] t = new int[n];
		  for (i = 0;i < n;i++)
		  {
				  a[i] = i;
				  t[i] = 0;
		  }
		  while (j == 1)
		  {
					 String tempVar2 = ConsoleInput.scanfRead();
					 if (tempVar2 != null)
					 {
						 b = Integer.parseInt(tempVar2);
					 }
					 String tempVar3 = ConsoleInput.scanfRead(" ");
					 if (tempVar3 != null)
					 {
						 c = Integer.parseInt(tempVar3);
					 }
					 if (b == 0 && c == 0)
					 {
					 break;
					 }
					 else
					 {
					 for (i = 0;i < n;i++)
					 {
									 if (c == a[i])
									 {
									 t[i]++;
									 }
					 }
					 }
		  }
		  for (i = 0;i < n;i++)
		  {
			if (t[i] == n - 1)
			{
			  I = i;
			  k++;
			}
		  }
		  if (k == 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  else
		  {
		  System.out.printf("%d",I);
		  }
	}

}

