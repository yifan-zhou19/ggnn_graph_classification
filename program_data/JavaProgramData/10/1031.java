package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	public static int n;
	public static int changdu(int i)
	{
		int j;
		int max = 1;
		if (b[i] != 1)
		{
		return b[i];
		}
		else
		{
		for (j = i + 1;j < n;j++)
		{
						  if (a[i] >= a[j])
						  {
										b[i] = changdu(j) + 1;
										if (b[i] > max)
										{
										max = b[i];
										}
						  }
		}
		b[i] = max;
		return max;
		}
	}
	public static int Main()
	{
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
		  b[i] = changdu(i);
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

