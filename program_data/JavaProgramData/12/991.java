package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int k;
		k = 0;
		int[] sz = new int[20];
		int[] sz2 = new int[20];
		int[] jieguo = new int[1000];
		while (true)
		{
			for (i = 0;;i++)
			{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 (sz[i]) = Integer.parseInt(tempVar);
			 }
			 if (sz[i] == 0 || sz[i] == -1)
			 {
			 break;
			 }
			 sz2[i] = sz[i];
			}
			  if (sz[i] == -1)
			  {
			 break;
			  }
			 n = 0;
			 for (a = 0;a < i;a++)
			 {
				for (b = 0;b < i;b++)
				{
				  if (sz2[b] * 2 == sz[a])
				  {
					n++;
				  }
				}
			 }
			 jieguo[k] = n;
			 k++;
		}
			for (i = 0;i < k;i++)
			{
			System.out.printf("%d\n",jieguo[i]);
			}
		return 0;
	}

}

