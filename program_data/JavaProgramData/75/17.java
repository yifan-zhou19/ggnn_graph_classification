package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[2][1000];
		int[][] b = new int[2][1000];
		int i = 0;
		int n;
		int j;
		int m;
		char c = '\0';
	  for (i = 0;c != '\n';i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0][i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
	  }

		i = 0;
		c = '\0';
	  for (i = 0;c != '\n';i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1][i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
	  }
		n = i;
		//for(i=0;i<n;i++)printf("%d %d\n",a[0][i],a[1][i]);
		int[] p = new int[1001];
		float t;
		for (t = 0.5F,i = 0;t <= 998.5F;t++,i++)
		{
		//printf("%f",t);
		for (j = 0;j < n;j++)
		{
		if (a[0][j] < t && a[1][j]> t)
		{
		 p[i] = p[i] + 1;
		}
		}
		//printf("%d ",p[i]);
		}
		m = p[0];
	   //for(i=0;i<1000;i++)printf("%d ",p[i]);
		for (i = 0;i < 1000;i++)
		{
		if (p[i] > m)
		{
			m = p[i];
		}
		}
	   System.out.printf("%d %d",n,m);
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

