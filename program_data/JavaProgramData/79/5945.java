package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int[] b = new int[30];
	public static int f(int n,int m)
	{
		int i;
		int[] p = new int[301];
		int q = 1;
		int r = 0;
		for (i = 1;i <= n;i++)
		{
			p[i] = 1;
		}
		i = 0;
		while (r < n)
		{
			i++;
			if (i <= n)
			{
			  if (p[i] != 0)
			  {
				 if (q == m)
				 {
					 p[i] = 0;
					 q = 1;
					 r++;
				 }
				 else
				 {
					 q++;
				 }
			  }
			}
			else
			{
				i = 0;
			}
		}
		return (i);
	}
	public static void Main()
	{
		int j;
		int i = 0;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			i = i + 1;
		} while (a[i - 1] != 0 && b[i - 1] != 0);
		for (j = 0;j < i - 1;j++)
		{
		  System.out.printf("%d\n",f(a[j], b[j]));
		}
	}


}

