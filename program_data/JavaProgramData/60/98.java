package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int t = 0;
		int s = 0;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		  for (j = 3;j <= n;j++)
		  {
			for (i = 2;i <= Math.sqrt(j);i++)
			{
				if (j % i != 0)
				{
					k = 0;
				}
				else
				{
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
				continue;
			}
			else
			{
				a[t] = j;
				t++;
			}
		  }
	//	for(i=0;i<t;i++)
	//		printf("%d ",a[i]);

		  for (i = 0;i < t - 1;i++)
		  {
			if ((a[i + 1] - a[i]) == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				s++;
			}
			else
			{
				continue;
			}
		  }
		  if (s == 0)
		  {
			System.out.print("empty\n");
		  }
	}




}

