package <missing>;

public class GlobalMembers
{
	public static int[] u = new int[100];
	public static int Main()
	{
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		int n;
		int i;
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
		u[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (u[i] <= 18)
	{
	a++;
	}
	if (u[i] >= 19 && u[i] <= 35)
	{
	b++;
	}
	if (u[i] >= 36 && u[i] <= 60)
	{
	c++;
	}
	if (u[i] > 60)
	{
	d++;
	}
	}
	a = a / n * 100;
	b = b / n * 100;
	c = c / n * 100;
	d = d / n * 100;
	System.out.printf("1-18: %.2f%%\n",a);
	System.out.printf("19-35: %.2f%%\n",b);
	System.out.printf("36-60: %.2f%%\n",c);
	System.out.printf("60??: %.2f%%\n",d);
		   return 0;
	}
}

