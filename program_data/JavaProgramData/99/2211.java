package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;
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
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{

			if (a[i] <= 18)
			{
				j++;
			}
			else if (a[i] <= 35)
			{
				k++;
			}
			else if (a[i] <= 60)
			{
				l++;
			}
			else
			{
				m++;
			}
		}
		System.out.print("1-18: ");
		System.out.printf("%.2f%%\n",(float)j / n * 100);
	System.out.print("19-35: ");
	System.out.printf("%.2f%%\n",(float)k / n * 100);


	System.out.print("36-60: ");
	System.out.printf("%.2f%%\n",(float)l / n * 100);
	System.out.print("60??: ");
	System.out.printf("%.2f%%\n",(float)m / n * 100);
	}

}

