package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int a = 0;
	 int b = 0;
	 int c = 0;
	 int d = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	 for (int i = 1;i <= n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
	 if (k <= 18)
	 {
	 a = a + 1;
	 }
	 else if (k <= 35)
	 {
	 b = b + 1;
	 }
	 else if (k <= 60)
	 {
	 c = c + 1;
	 }
	 else
	 {
	 d = d + 1;
	 }
	 }
	 a = a * 100;
	 b = b * 100;
	c = c * 100;
	d = d * 100;
	 System.out.printf("1-18: %.2lf%\n",a * 1.0 / n);
	 System.out.printf("19-35: %.2lf%\n",b * 1.0 / n);
	  System.out.printf("36-60: %.2lf%\n",c * 1.0 / n);
	 System.out.printf("60??: %.2lf%\n",d * 1.0 / n);
	return 0;
	}

}

