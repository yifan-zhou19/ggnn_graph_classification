package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int k;
		  int m;
		  int i;
		  int j;
		  int[] a = new int[100];
		  int t = 0;
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
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
		}
		for (j = 1;;j++)
		{
			t = 0;
			a[n - 1] = j;
			for (i = n - 1;i > 0;i--)
			{
					if ((a[i] * n + k) % (n - 1) == 0)
					{
						a[i - 1] = (a[i] * n + k) / (n - 1);
					}
					else
					{
												t = 1;
												break;
					}
			}
			if (t == 0)
			{
				System.out.printf("%d",a[0] * n + k);

				break;
			}
		}
	}

}

