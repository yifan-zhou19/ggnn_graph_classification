package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return (a > b != 0?a:b);
	}
	public static int Main()
	{
		int imax = 0;
		int s = 0;
		int[] x = new int[2200];
		int[] y = new int[2200];
		int i = 0;
		int j;
		int k;
		int m;
		char c;
		do
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x[i] = Integer.parseInt(tempVar);
		  }
		  y[i] = 1;
		  i++;
		} while ((c = System.in.read()) != '\n');
		System.out.printf("%d ",i);
		do
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  x[i] = Integer.parseInt(tempVar2);
		  }
		  x[i]--;
		  y[i] = -1;
		  i++;
		} while ((c = System.in.read()) != '\n');
		for (j = 0;j < i;j++)
		{
		for (k = i - 1;k > j;k--)
		{
		  if (x[k] < x[k - 1])
		  {
			m = x[k];
			x[k] = x[k - 1];
			x[k - 1] = m;
			m = y[k];
			y[k] = y[k - 1];
			y[k - 1] = m;
		  }
		}
		s += y[j];
		imax = max(imax, s);
		}
		System.out.printf("%d",imax);
		return 0;
	}


}

