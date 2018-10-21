package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] h = new int[25];
	int[] b = new int[25];
	int k;
	int i;
	int j;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  h[i] = Integer.parseInt(tempVar2);
	  }
	  b[i] = 1;
	}
	for (j = k - 1;j >= 0;j--)
	{
	  for (m = j + 1;m < k;m++)
	  {
		   if (h[j] >= h[m] != 0 && b[j] < (b[m] + 1))
		   {
			  b[j] = b[m] + 1;
		   }
	  }
	}
	for (i = 0;i < k - 1;i++)
	{
		b[i + 1] = (b[i] > b[i + 1])?b[i]:b[i + 1];
	}
	n = b[k - 1];
	System.out.printf("%d",n);
	}
}

