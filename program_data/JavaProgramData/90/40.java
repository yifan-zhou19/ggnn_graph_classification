package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int put = new int(int,int);
		int n;
		int m;
		int t;
		int way;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   n = Integer.parseInt(tempVar3);
		   }
		   way = put(m, n);
		   System.out.printf("%d\n",way);
		}
	}
	public static int put(int m,int n)
	{
		int way;
		if (m == 1 || n == 1 || m == 0 || n == 0)
		{
			way = 1;
		}
		else if (m < n)
		{
			way = put(m, n - 1);
		}
		else if (m >= n)
		{
			way = put(m, n - 1) + put(m - n, n);
		}
		return (way);
	}

}

