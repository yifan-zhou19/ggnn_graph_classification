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


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
			if (age[i] > 60)
			{
				d++;
			}
			else if (age[i] <= 60 && age[i] >= 36)
			{
				c++;
			}
			else if (age[i] <= 35 && age[i] >= 19)
			{
				b++;
			}
			else
			{
				a++;
			}
		}



		System.out.printf("1-18: %.2lf%%\n", (double)a / n * 100);
		System.out.printf("19-35: %.2lf%%\n", (double)b / n * 100);
		System.out.printf("36-60: %.2lf%%\n", (double)c / n * 100);
		System.out.printf("60??: %.2lf%%\n", (double)d / n * 100);

	}


}

