package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int[] a = new int[20000];
	  int[] b = new int[20000];
	  int i;
	  int j;
	  int k;
	  int n;
	  int x;
	  int sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  k = 0;
	  sum = 0;
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[0] = Integer.parseInt(tempVar2);
	  }
	  for (i = 1;i < n;i++)
	  {
		k = 0;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < i;j++)
		{
			if (x == a[j])
			{
			k = 1;
			break;
			}
		}
		if (k == 0)
		{
			a[i - sum] = x;
		}
		else
		{
			sum++;
		}
	  }
	  for (i = 0;i < n - sum - 1;i++)
	  {
		  System.out.printf("%d ",a[i]);
	  }
	  System.out.printf("%d",a[n - sum - 1]);
	}
}

