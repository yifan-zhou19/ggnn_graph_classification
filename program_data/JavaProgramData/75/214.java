package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int c;
		int k;
		int r;
		int n;
		int m;
		int max = 0;
		int flag;
		int temp;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		j = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		 while (c = System.in.read() != '\n')
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[j] = Integer.parseInt(tempVar2);
			 }
			 j++;
		 }
		 j = 1;
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[0] = Integer.parseInt(tempVar3);
		 }
		  while (c = System.in.read() != '\n')
		  {
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  b[j] = Integer.parseInt(tempVar4);
			  }
			  j++;
		  }
		 System.out.printf("%d ",j);
		// printf("%d %d\n",a[1],b[1]);
		for (i = 0;i < 1000;i++)
		{
			d[i] = 0;
		}
		 for (i = 0;i < 1000;i++)
		 {
			for (k = 0;k < j;k++)
			{
				if (a[k] <= i != 0 && b[k]> i)
				{
					d[i]++;
				}
			}
		 }

		 for (i = 0;i < 1000;i++)
		 {
			 if (max < d[i])
			 {
			 max = d[i];
			 r = i;
			 }
		 }
			 System.out.printf("%d\n",max);
	}
}

