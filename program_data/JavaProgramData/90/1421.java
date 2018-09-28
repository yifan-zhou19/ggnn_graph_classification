package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		  int t;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[t];
		  int[] b = new int[t];
		  int apple = new int(int m,int n);
		  for (i = 0;i < t;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  for (i = 0;i < t;i++)
		  {
			  System.out.printf("%d\n",apple(a[i], b[i]));
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(b);
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}
	public static int apple(int m,int n)
	{
		int c = 0;

		if (n == 1 || m == 1)
		{
				   c = 1;
		}
		else
		{
			if (m < n)
			{
				   n = m;
				   c = apple(m, n);
			}
			else if (m == n)
			{
					c = apple(m, n - 1) + 1;
			}
			else
			{
					c = apple(m - n, n) + apple(m, n - 1);
			}
		}
		return (c);
	}


}

