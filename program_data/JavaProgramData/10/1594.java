package <missing>;

public class GlobalMembers
{
	public static int max(int[] x, int n)
	{
		int i;
		int s = 0;
		for (i = 0;i < n;i++)
		{
						if (x[i] > s)
						{
							s = x[i];
						}
		}
		return (s);
	}
	public static int Main()
	{
		  int[] a = new int[26];
		  int[] b = new int[26];
		  int i;
		  int j;
		  int n;
		  int sum = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a + i = tempVar2;
		  }
		  }
		  for (i = n - 1;i >= 0;i--)
		  {
							 sum = 0;
							 for (j = i + 1;j < n;j++)
							 {
											   if (a[i] >= a[j])
											   {
											   if (b[j] >= sum)
											   {
												   sum = b[j];
											   }
											   }
							 }
							 b[i] = sum + 1;
		  }
		  System.out.printf("%d\n",max(b, n));
	}
}

