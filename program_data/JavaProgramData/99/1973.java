package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[1000];
	  int i;
	  float e1;
	  float b1;
	  float c1;
	  float d1;
	  float e;
	  float b;
	  float c;
	  float d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (e = 0F,b = 0F,c = 0F,d = 0F,i = 1;i <= n;i = i + 1)
	  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			if ((a[i] >= 1) && (a[i] <= 18))
			{
				e = e+1;
			}
			if ((a[i] >= 19) && (a[i] <= 35))
			{
				b = b + 1;
			}
			if ((a[i] >= 36) && (a[i] <= 60))
			{
				c = c + 1;
			}
			if ((a[i] > 60))
			{
				d = d + 1;
			}

	  }
	   e1 = e / n * 100;
	   b1 = b / n * 100;
	   c1 = c / n * 100;
	   d1 = d / n * 100;
	   System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%",e1,b1,c1,d1);
	}


}

