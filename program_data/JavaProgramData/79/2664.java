package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[301];
		int num;
		int m;
		int[] b = new int[N];
		int[] c = new int[N];
		int s;
		int t;
		s = 0;
		for (t = 1;t < 10000;t++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(b[t]) = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(c[t]) = Integer.parseInt(tempVar2);
		}
		if (b[t] == 0 && c[t] == 0)
		{
			break;
		}
		s = s + 1;
		}
	for (t = 1;t <= s;t++)
	{
		j = 0,k = 0;
		for (i = 1;i <= b[t];i++)
		{
		 a[i] = 1;
		}
		for (i = 1;i <= b[t];i++)
		{
		 if (a[i] == 1)
		 {
		  j = j + a[i];
		  if (j == c[t])
		  {
		   j = 0;
		   a[i] = 0;
		   k++;
		  if (k == b[t])
		  {
			num = i;
			break;
		  }
		  }
		 }
		if (i == b[t])
		{
		i = 0;
		}
		}
	  System.out.printf("%d\n",num);
	}
	}

}

