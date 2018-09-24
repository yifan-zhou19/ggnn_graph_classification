package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int f(int x)
	{
		int t = 1;
		int max = 1;
		if (a[x + 1] == 0)
		{
		max = 1;
		}
		else
		{
			for (int i = x + 1;a[i] != 0;i++)
			{
			if (a[x] >= a[i])
			{
						   t = f(i) + 1;
						   if (t > max)
						   {
							   max = t;
						   }
			}
			}
		}
		return max;
	}
	public static int Main()
	{
		  int n;
		  int t;
		  int max;
		  int i;
		  int M;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(a,0,25 * (Integer.SIZE / Byte.SIZE));
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
		  }
		  M = f(n - 1);
		  for (i = n - 2;i >= 0;i--)
		  {
							f(i);
							if (M < f(i))
							{
							M = f(i);
							}
		  }
		  System.out.printf("%d",M);
		  System.in.read();
		  System.in.read();
	}

}

