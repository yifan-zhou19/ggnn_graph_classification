package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] age = new int[100];
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double agea;
		double ageb;
		double agec;
		double aged;
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
			if (age[i] <= 18)
			{
				a++;
			}
			if (age[i] >= 19 && age[i] <= 35)
			{
				b++;
			}
			if (age[i] >= 36 && age[i] <= 60)
			{
				c++;
			}
			if (age[i] > 60)
			{
				d++;
			}
		}
		agea = (double)a / n * 100;
		ageb = (double)b / n * 100;
		agec = (double)c / n * 100;
		aged = (double)d / n * 100;
		System.out.printf("1-18: %.2lf",agea);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",ageb);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",agec);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",aged);
		System.out.print("%%\n");
	}

}

