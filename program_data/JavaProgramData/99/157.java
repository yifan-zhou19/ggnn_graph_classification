package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int age;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int i;
		double b1;
		double b2;
		double b3;
		double b4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age = Integer.parseInt(tempVar2);
			}
			if (age <= 18)
			{
				n1++;
			}
			if (age > 18 && age <= 35)
			{
				n2++;
			}
			if (age > 35 && age <= 60)
			{
				n3++;
			}
			if (age > 60)
			{
				n4++;
			}
		}
		b1 = (double)n1 / a * 100;
		b2 = (double)n2 / a * 100;
		b3 = (double)n3 / a * 100;
		b4 = (double)n4 / a * 100;
		System.out.printf("1-18: %.2lf%%",b1);
		System.out.print("\n");
		System.out.printf("19-35: %.2lf%%",b2);
		System.out.print("\n");
		System.out.printf("36-60: %.2lf%%",b3);
		System.out.print("\n");
		System.out.printf("60??: %.2lf%%",b4);
		return 0;
	}
}

