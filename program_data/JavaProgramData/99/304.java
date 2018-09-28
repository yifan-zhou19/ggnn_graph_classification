package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[101];
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				age[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (age[j] <= 18)
			{
				a++;
			}
			if (age[j] <= 35 && age[j]>18)
			{
				b++;
			}
			if (age[j] <= 60 && age[j]>35)
			{
				c++;
			}
			if (age[j] > 60)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",(double)a / n * 100);
		System.out.printf("19-35: %.2lf%%\n",(double)b / n * 100);
		System.out.printf("36-60: %.2lf%%\n",(double)c / n * 100);
		System.out.printf("60??: %.2lf%%\n",(double)d / n * 100);
		return 0;
	}



}

