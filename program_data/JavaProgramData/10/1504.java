package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] arr = new int[103];
	  int[] brr = new int[103];
	  int i;
	  int j;
	  int k;
	  int max;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  arr[i] = Integer.parseInt(tempVar2);
		  }
	  }
	  for (i = 1;i <= n;i++)
	  {
		  brr[i] = 0;
	  }
	  max = 0;
	  for (i = n;i >= 1;i--)
	  {
		k = 0;
		for (j = n;j > i;j--)
		{
			if ((arr[j] <= arr[i]) && (brr[j]> k))
			{
				k = brr[j];
			}
		}
		brr[i] = k + 1;
		if (brr[i] > max)
		{
			max = brr[i];
		}
	  }
	  System.out.printf("%d\n",max);
	}
}

