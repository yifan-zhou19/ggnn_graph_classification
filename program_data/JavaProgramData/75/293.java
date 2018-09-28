package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x0 = new String(new char[4000]);
		String y0 = new String(new char[4000]);
		int[] x = new int[1000];
		int[] y = new int[1000];
		int people;
		int i;
		int j = 0;
		int[] num = new int[1000];
		int nummax = 0;
		int c = 0;
		int min = 2000;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x0 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y0 = tempVar2.charAt(0);
		}
		for (i = 0;i <= (x0.length() - 1);i++)
		{
		 if ((x0.charAt(i) >= '0') && (x0.charAt(i) <= '9'))
		 {
		  c = c * 10 + x0.charAt(i) - '0';
		 }
		 else
		 {
		  x[j++] = c;
		  c = 0;
		 }
		 if (i == (x0.length() - 1))
		 {
		  x[j++] = c;
		  c = 0;
		 }
		}
		j = 0;
		c = 0;
		for (i = 0;i <= y0.length() - 1;i++)
		{
		 if ((y0.charAt(i) >= '0') && (y0.charAt(i) <= '9'))
		 {
			c = c * 10 + y0.charAt(i) - '0';
		 }
		 else
		 {
		  y[j++] = c;
		  c = 0;
		 }
		 if (i == (y0.length() - 1))
		 {
		  y[j++] = c;
		  c = 0;
		 }
		}
		people = j;
		for (i = 0;i <= (people-1);i++)
		{
		 if (x[i] < min)
		 {
		  min = x[i];
		 }
		 if (y[i] > max)
		 {
		  max = y[i];
		 }
		}
		for (i = min;i <= max;i++)
		{
		 for (j = 0;j <= people-1;j++)
		 {
		  if ((i >= x[j]) && (i < y[j]))
		  {
		   num[i]++;
		  }
		 }
		}
		for (i = 0;i <= 999;i++)
		{
		 if (num[i] > nummax)
		 {
		  nummax = num[i];
		 }
		}
		System.out.printf("%d %d",people,nummax);
	}
}

