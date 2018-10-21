package <missing>;

public class GlobalMembers
{
	public static int compare(int x,int y)
	{
		if (x <= y)
		{
		x = y + 1;
		}
		return x;
	}
	public static int Main()
	{
		  int i;
		  int n;
		  int r;
		  int a;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] p = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  int[] q = new int[n];
		  //int q[25];
		  for (j = n - 1;j >= 0;j--)
		  {
			 q[j] = 1;
			 for (r = n - 1;r != j;r--)
			 {
			   if (p[j] >= p[r])
			   {
			   q[j] = compare(q[j], q[r]);
			   }
			 }
			 //q[j]=q[j]+1;
		  }
		   int max;
		   max = q[0];
		  for (a = 1;a < n;a++)
		  {
			if (q[a] > max)
			{
			max = q[a];
			}
		  }
		  System.out.printf("%d",max);
		  return 0;
	}

}

