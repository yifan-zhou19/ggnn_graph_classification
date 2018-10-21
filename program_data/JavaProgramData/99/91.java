package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] p = new int[100];
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int i;
		int n;
		double b1 = 0;
		double b2 = 0;
		double b3 = 0;
		double b4 = 0;
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
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] >= 0 && p[i] <= 18)
			{
				n1++;
			}
			else if (p[i] >= 19 && p[i] <= 35)
			{
				n2++;
			}
			else if (p[i] >= 36 && p[i] <= 60)
			{
				n3++;
			}
			 else if (p[i] >= 61)
			 {
				n4++;
			 }
		}
		b1 = (double)n1 / n * 100;
	b2 = (double)n2 / n * 100;
	b3 = (double)n3 / n * 100;
	b4 = (double)n4 / n * 100;
	System.out.printf("1-18: %.2f",b1);
	System.out.print("%%\n");
	System.out.printf("19-35: %.2f",b2);
	System.out.print("%%\n");
	System.out.printf("36-60: %.2f",b3);
	System.out.print("%%\n");
	System.out.printf("60??: %.2f",b4);
	System.out.print("%%");
	}


}

