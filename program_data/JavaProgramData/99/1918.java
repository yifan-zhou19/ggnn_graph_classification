package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] age = new int[100];
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int sum;
		double a1;
		double a2;
		double a3;
		double a4;
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
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] >= 1 && age[i] <= 18)
			{
				s1++;

			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				s2++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				s3++;
			}
			if (age[i] > 60)
			{
				s4++;
			}


		}
		sum = s1 + s2 + s3 + s4;
		a1 = (double)s1 / sum * 100;
		a2 = (double)s2 / sum * 100;
		a3 = (double)s3 / sum * 100;
		a4 = (double)s4 / sum * 100;
		System.out.printf("1-18: %.2lf",a1);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",a2);
	System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",a3);
	System.out.print("%%\n");
		System.out.printf("60??: %.2lf",a4);
	System.out.print("%%\n");
	}


}

