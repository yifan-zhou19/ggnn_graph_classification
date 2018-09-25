package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int a;
	  int b = 0;
	  int c = 0;
	  int d = 0;
	  int e = 0;
	  double f = 0;
	  double g = 0;
	  double h = 0;
	  double j = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  if (1 <= a != 0 && a <= 18)
	  {
		 b++;
	  }
	  if (19 <= a != 0 && a <= 35)
	  {
		 c++;
	  }
	  if (36 <= a != 0 && a <= 60)
	  {
		 d++;
	  }
	 if (60 < a)
	 {
		 e++;
	 }
	  }
	  f = (double)b / n;
	  g = (double)c / n;
	  h = (double)d / n;
	  j = (double)e / n;
	  System.out.printf("1-18: %.2lf%%\n",f * 100);
	  System.out.printf("19-35: %.2lf%%\n",g * 100);
	  System.out.printf("36-60: %.2lf%%\n",h * 100);
	  System.out.printf("60??: %.2lf%%\n",j * 100);
	  return 0;
	}
}

