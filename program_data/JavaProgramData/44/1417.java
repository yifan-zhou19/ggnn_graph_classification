package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int i;
		int j;
		int s;
		int[] a = new int[20];
		int t = 0;
		if (n >= 0)
		{
			 s = n;
		}
		else
		{
			 s = -n;
		}
		for (i = 0;s != 0;i++)
		{
			  a[i] = s % 10;
			  s = (s - a[i]) / 10;
		}
		for (j = 0;j < i;j++)
		{
			  t = 10 * t + a[j];
		}
		if (n < 0)
		{
			 return -t;
		}
		else
		{
			 return t;
		}
	}
	public static int Main()
	{
		  int i;
		  int[] c = new int[6];
		  for (i = 0;i < 6;i++)
		  {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 c[i] = Integer.parseInt(tempVar);
				 }
				 System.out.printf("%d\n",reverse(c[i]));
		  }
	}
}

