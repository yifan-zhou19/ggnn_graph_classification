package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int[] a = new int[10030];
		  int[] b = new int[10030];
		  for (i = 0;i < 10020;i++)
		  {
			  a[i] = 0;
			  b[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }

		  while (true)
		  {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				if ((i == 0) && (j == 0))
				{
					break;
				}
				a[j]++;
				b[i]++;
		  }
				k = 0;
		  for (l = 0;l < n;l++)
		  {
		  if ((a[l] == n - 1) && (b[l] == 0))
		  {
									System.out.printf("%d\n",l);
									k = 1;
		  }
		  }
									if (k == 0)
									{
										System.out.print("NOT FOUND");
									}

	}


}

