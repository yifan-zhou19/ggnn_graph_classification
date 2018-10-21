package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[100];
		int[] m = new int[110];
		int i;
		int j;
		int k;
		int t;
		int times;
		int[] a = new int[3000];
		int[] b = new int[10000];
		int[] c = new int[3000];
		for (times = 1;times < 1000;times++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[times] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[times] = Integer.parseInt(tempVar2);
			}
			if (n[times] == 0)
			{
				break;
			}
				   for (i = 1;i <= n[times];i++)
				   {
					   a[i] = i;
				   }
					if (n[times] == 1)
					{
						a[times] = 1;
					}
		  while (n[times] > 1)
		  {
		   t = m[times] % n[times];
		   i = 1;
		   n[times]--;
			   for (i = 1;i <= n[times];i++)
			   {
			   if (i + t - 1 <= n[times])
			   {
				   b[i] = a[t + i];
			   }
			   else
			   {
				   b[i] = a[t + i - n[times] - 1];
			   }
			   }
			   for (j = 1;j <= n[times];j++)
			   {
					  a[j] = b[j];
			   }
		  }

			   System.out.printf("%d\n",a[1]);
		}


				  return 0;
	}

}

