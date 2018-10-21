package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int[] a = new int[300];
		int i;
		int j;
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
		for (j = 1;;j++)
		{
		  a[n] = n * j + k;
		  for (i = n;i > 1;i--)
		  {
			  if (a[i] % (n - 1) != 0)
			  {
				  break;
			  }

			  else
			  {
				  a[i - 1] = n * a[i] / (n - 1) + k;
			  }
		  }
		  if (i == 1)
		  {
			  System.out.printf("%d",a[1]);
			  break;
		  }
		}
	}
}

