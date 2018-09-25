package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k = 0;
		  int a;
		  int b;
		  int[] str = new int[10000];
		  int[] f = new int[10000];
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
				 str[b] += a;
				 f[a]++;
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (str[i] == ((n - 1) * n / 2 - i) && f[i] == 0)
						  {
							  System.out.printf("%d",i);
							  k++;
						  }
		  }
		  if (k == 0)
		  {
			  System.out.print("NOT FOUND");
		  }
		  System.out.print("\n");

	}

}

