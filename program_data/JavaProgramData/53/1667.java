package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int[] b = new int[10];
		int B;
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
		for (k = 0,i = 0;i < n;i++)
		{
		  B = 0;
		  for (j = 0;j < i;j++)
		  {
			  if (a[j] == a[i])
			  {
			  B = 1;
			  break;
			  }
		  }
		  if (B == 0)
		  {
			  b[k] = a[i];
			  k++;
		  }
		}
		for (i = 0;i < k;i++)
		{
			if (i > 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",b[i]);
		}
		return 0;
	}

}

