package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int b;
	  int i = 1;
	  int sum = 0;
	  int n;
	  double a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
		for (i = 1;i <= n;i++)
		{
		a = (double)(i - 7) / 10;
		b = (i - 7) / 10;
		if (i % 7 == 0 || i < 80 && i>69 || a == b)
		{
			continue;
		}
		else
		{
			sum += i * i;
		}
		}
	  System.out.printf("%d\n",sum);
	  return 0;
	}

}

