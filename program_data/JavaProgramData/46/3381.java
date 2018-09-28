package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int i;
		int k;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[1000][1000];
		for (i = 0;i < r;i++)
		{
			for (k = 0;k < c;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		int s = 0;
		int h = 0;
		i = 0;
		j = 0;
		p = r * c;
		while (j < p)
		{
		 for (i = s,k = h;k < c;k++)
		 {
			 if (j < p)
			 {
			 System.out.printf("%d\n",a[i][k]);
			 j++;
			 }
		 }
		 s++;
		 for (i = s,k = c - 1;i < r;i++)
		 {
			 if (j < p)
			 {
			 System.out.printf("%d\n",a[i][k]);
			 j++;
			 }
		 }
		 c--;
		 for (k = c - 1,i = r - 1;k >= h;k--)
		 {
			 if (j < p)
			 {
			 System.out.printf("%d\n",a[i][k]);
			 j++;
			 }
		 }
		 r--;
		 for (i = r - 1,k = h;i >= s;i--)
		 {
			 if (j < p)
			 {
				 System.out.printf("%d\n",a[i][k]);
				 j++;
			 }
		 }
		 h++;
		}
		return 0;
	}




}

