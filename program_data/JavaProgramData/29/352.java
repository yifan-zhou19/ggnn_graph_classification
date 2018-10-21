package <missing>;

public class GlobalMembers
{
	public static float f(int n)
	{
		float d;
		if (n == 0 || n == 1)
		{
		return 1F;
		}
		else
		{
			d = f(n - 1) + f(n - 2);
		}
		return d;
	}
	public static int Main()
	{
		  int m;
		  int[] a = new int[1000];
		  int j;
		  int n;
		  int i;
		  float c;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < m;i++)
		  {
				c = 0F;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}
				for (j = 1;j <= n;j++)
				{
						 c = c + f(j + 1) / f(j);
				}
				System.out.printf("%.3f\n",c);
		  }
		  System.in.read();
		  System.in.read();
	}

}

