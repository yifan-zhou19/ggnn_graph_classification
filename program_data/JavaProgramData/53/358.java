package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
	k = 0;
	m = 0;
	int[] a = new int[300];
	int[] b = new int[100];
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

	for (i = n - 1;i >= 0;i--)
	{
	  for (j = 0;j < i;j++)
	  {
		  if (a[i] == a[j] && i != j)
		  {
			  b[i]++;
		  }
	  }
	}
	for (i = 0;i < n;i++)
	{
	 if (b[i] == 0)
	 {
		 k++;
	 }
	}
	for (j = 0;j < n;j++)
	{
		if (b[j] == 0)
		{
		  System.out.printf("%d",a[j]);
	  m++;
	  if (m < k)
	  {
		  System.out.print(",");
	  }
		}
	}
	}
}

