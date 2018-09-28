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
		  int[] a = new int[n];
		  for (int i = 0;i < n;i++)
		  {
			  a[i] = 0;
		  }
		  int p;
		  int q;
		  for (int j = 0;;j++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  p = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  q = Integer.parseInt(tempVar3);
				  }
				  if (p == 0 && q == 0)
				  {
					  break;
				  }
				  else
				  {

						a[q]++;
				  }
		  }
		  int flg = 0;
		  for (int k = 0;k < n;k++)
		  {
				  if (a[k] == n - 1)
				  {
						  System.out.printf("%d",k);
						  flg = 1;
				  }
		  }
		  if (flg == 0)
		  {
			  System.out.print("NOT FOUND");
		  }

	}

}

