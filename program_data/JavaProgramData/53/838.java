package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int[] b = new int[100];
	int n;
	int i = 0;
	int j = 0;
	int t = 0;
	int p = 0;
	int r;
	int x = 0;
	int z = 0;
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
			System.out.printf("%d,",a[0]);



			for (i = 1;i < n;i++)
			{
				r = 0;
					 t = a[i];
					 p = i;
				for (x = 0;x < p;x++)
				{
					if (a[x] == t)
					{
						r = 1;
						break;
					}
				}

				if (r == 0)
				{
						b[j] = t;
						  j = j + 1;
				}
			}

	  for (z = 0;z < j - 1;z++)
	  {
					System.out.printf("%d,",b[z]);
	  }
			System.out.printf("%d",b[j - 1]);
		return 0;
	}

}

