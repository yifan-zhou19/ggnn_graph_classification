package <missing>;

public class GlobalMembers
{
	///#include <math.h>




	public static int Main()
	{

		int n;
		int ta;
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ta = Integer.parseInt(tempVar2);
			}

			if (ta <= 18)
			{
				t1++;
			}
			else if (ta <= 35)
			{
				t2++;
			}
			else if (ta <= 60)
			{
				t3++;
			}
			else
			{
				t4++;
			}
		}

		System.out.printf("1-18: %.2lf%\n",(double)t1 * 100 / n);
		System.out.printf("19-35: %.2lf%\n",(double)t2 * 100 / n);
		System.out.printf("36-60: %.2lf%\n",(double)t3 * 100 / n);
		System.out.printf("60??: %.2lf%\n",(double)t4 * 100 / n);
		return 0;
	}

}

