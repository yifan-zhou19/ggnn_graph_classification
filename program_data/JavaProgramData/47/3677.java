package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int k;
		int s = 0;
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
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - 1 - j;i++)
			{

					k = a[i];
					a[i] = a[i + 1];
					a[i + 1] = k;


			}
		}
		for (i = 0;i < n;i++)
		{
			if (s == 0)
			{
			   System.out.printf("%d",a[i]);
			   s = 1;
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
			return 0;
	}


}

