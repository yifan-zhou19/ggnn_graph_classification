package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] age = new int[100];
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
			age[i] = Integer.parseInt(tempVar2);
		}
		}

		for (i = 0;i < n;i++)
		{
						if (age[i] <= 18)
						{
						a++;
						}
						else
						{
							if (age[i] <= 35)
							{
							b++;
							}
							else
							{
								if (age[i] <= 60)
								{
								c++;
								}
								else
								{
								d++;
								}
							}
						}
		}
		System.out.printf("1-18: %.2f",(double)(100 * a) / (double)n);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2f",(double)(100 * b) / (double)n);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2f",(double)(100 * c) / (double)n);
		System.out.print("%%\n");
		System.out.printf("60??: %.2f",(double)(100 * d) / (double)n);
		System.out.print("%%\n");
		return 0;
	}
}

