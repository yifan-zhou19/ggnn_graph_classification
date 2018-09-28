package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int age;
	double sum1 = 0.00;
	double sum2 = 0.00;
	double sum3 = 0.00;
	double sum4 = 0.00;
	double k1;
	double k2;
	double k3;
	double k4;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 age = Integer.parseInt(tempVar2);
	 }
	 if (age >= 1 && age <= 18)
	 {
		 sum1 = sum1 + 1;
	 }
	 else if (age <= 35)
	 {
		 sum2 = sum2 + 1;
	 }
	 else if (age <= 60)
	 {
		 sum3 = sum3 + 1;
	 }
	 else
	 {
		 sum4 = sum4 + 1;
	 }
	}
	 k1 = (double)(sum1 / n * 100);
	 k2 = (double)(sum2 / n * 100);
	 k3 = (double)(sum3 / n * 100);
	 k4 = (double)(sum4 / n * 100);
	System.out.printf("1-18: %.2lf%\n",k1);
	System.out.printf("19-35: %.2lf%\n",k2);
	System.out.printf("36-60: %.2lf%\n",k3);
	System.out.printf("60??: %.2lf%\n",k4);
	return 0;
	}

}

