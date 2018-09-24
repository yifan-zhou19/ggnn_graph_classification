package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  int[] a = new int[1000];
	  int[][] b = new int[1000][1000];
	  int c = 0;
	  int d = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			  b[i][j] = a[i] + a[j];
		  }
	  }
		for (i = 0;i < n;i++)
		{
		  for (j = i + 1;j < n;j++)
		  {
			   if (b[i][j] == k)
			   {
				  c++;


			   }
			  else
			  {
				 d++;

			  }
		  }
		}
	if (c > 0)
	{
		System.out.print("yes");
	}

			else
			{
				System.out.print("no");

			}
	  return 0;
	}
}

