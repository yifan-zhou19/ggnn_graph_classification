package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int p;

	  double m;
	  double q;
	  double k = 0.0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] num = new int[300];
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num[i] = Integer.parseInt(tempVar2);
		  }
		  k = k + num[i];
	  }

	  m = k / n;
	  int a;
	  int b;
	  if (num[0] > num[1])
	  {
		  a = num[1];
		  b = num[0];
	  }
	  else
	  {
		  a = num[1];
		  b = num[0];
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (num[i] < a)
		  {
			  a = num[i];
		  }
		  if (num[i] > b)
		  {
			  b = num[i];
		  }
	  }
	  if ((m - a) > (b - m))
	  {
		  System.out.printf("%d",a);
	  }
	if ((m - a) == (b - m))
	{
		System.out.printf("%d,",a);
	}
	if ((m - a) <= (b - m))
	{
		System.out.printf("%d",b);
	}
	}
}

