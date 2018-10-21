package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int abc = new int(double n,float k);
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		System.out.printf("%ld\n",abc(a, b));
	}
	public static int abc(double n,float k)
	{
		double sum = 0;
		int i;
		int j;
		for (i = 1;;i++)
		{
			sum = i * (n - 1);
			for (j = 0;j < n;j++)
			{
				sum = n / (n - 1) * sum + k;
				if ((sum - (int)sum) != 0)
				{
			break;
				}
			}
			if ((sum - (int)sum) == 0)
			{
			break;
			}
		}
		return ((int)sum);


	}



}

