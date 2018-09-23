package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] s = new int[20000];
		  int[] y = new int[20000];
		  int i;
		  int j;
		  int k;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  s[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  k = 0;
		  for (i = n - 1;i > 0;i--)
		  {
						  for (j = i - 1;j >= 0;j--)
						  {
											 if (s[i] == s[j])
											 {
													break;
											 }
						  }
						  if (j == -1)
						  {
								   y[k] = s[i];
								   k++;
						  }
		  }
		  System.out.printf("%d",s[0]);
		  for (i = k - 1;i >= 0;i--)
		  {
				System.out.printf(" %d",y[i]);
		  }
	}

}

