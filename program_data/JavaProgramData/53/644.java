package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[300];
		int[] p = new int[300];
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p[0] = a;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[0] + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1,j = 1;i <= n - 1;i++)
		{
		  for (k = 0;k <= j - 1;k++)
		  {
			  if (a[i] == p[k])
			  {
			  m = 0;
			  break;
			  }
		  else
		  {
		  m = 1;
		  }
		  }
		  if (m != 0)
		  {
			  p[j] = p[0] + i;
			  j++;
		  }
		}
		for (i = 0;i <= j - 2;i++)
		{
			System.out.printf("%d,",p[i]);
		}
		System.out.printf("%d",p[j - 1]);
	}
}

