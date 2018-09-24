package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int sort(int[] a, int k);
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int j;
	int[] a = new int[25];
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i] = Integer.parseInt(tempVar2);
	  }
	}
	int[] d = new int[25];
	for (i = n - 1;i >= 0;i--)
	{
		d[i] = 1;
	  for (j = i + 1;j < n;j++)
	  {
		if (a[i] >= a[j] != 0 && d[i] < d[j] + 1)
		{
			d[i] = d[j] + 1;
		}
	  }
	}
	int max = 0;
	for (i = 0;i < n;i++)
	{
	if (d[i] > max)
	{
	max = d[i];
	}
	}
	System.out.printf("%d",max);

	}
}

