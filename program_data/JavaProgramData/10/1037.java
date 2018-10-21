package <missing>;

public class GlobalMembers
{
	public static int changdu(int i, int n, int[] a, int[] b)
	{
		int j;
		int max = 1;
		for (j = i + 1;j < n;j++)
		{
						  if (a[i] >= a[j])
						  {
										b[i] = changdu(j, n, a, b) + 1;
										if (b[i] > max)
										{
										max = b[i];
										}
						  }
		}
		b[i] = max;
		return max;
	}
	public static int Main()
	{
		  int[] a = new int[25];
		  int[] b = new int[25];
		  int n;
		  int max = 0;
		  int i;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  b[i] = changdu(i, n, a, b);
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (b[i] > max)
						  {
						  max = b[i];
						  }
		  }
		  System.out.printf("%d",max);

	}


}

