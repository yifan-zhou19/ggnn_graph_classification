package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] age = new int[100];
		int[] count = new int[4];
		for (i = 0;i < 4;i++)
		{
			count[i] = 0;
		}
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
				(age[i]) = Integer.parseInt(tempVar2);
			}
			if (1 <= age[i] != 0 && age[i] <= 18)
			{
				count[0] += 1;
			}
			else if (19 <= age[i] != 0 && age[i] <= 35)
			{
				count[1] += 1;
			}
			else if (36 <= age[i] != 0 && age[i] <= 60)
			{
				count[2] += 1;
			}
			else if (age[i] >= 61)
			{
				count[3] += 1;
			}
		}
		System.out.printf("1-18: ""%.2lf%""%\n",(double)count[0] / n * 100);
		System.out.printf("19-35: ""%.2lf%""%\n",(double)count[1] / n * 100);
		System.out.printf("36-60: ""%.2lf%""%\n",(double)count[2] / n * 100);
		System.out.printf("60??: ""%.2lf%1""%\n",(double)count[3] / n * 100);
		return 0;
	}

}

