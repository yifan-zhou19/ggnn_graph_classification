package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] y = new int[100];
		int i;
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;
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
				y[i] = Integer.parseInt(tempVar2);
			}
			 if (y[i] <= 18)
			 {
				 a++;
			 }
			 if ((y[i] >= 19) && (y[i] <= 35))
			 {
				 b++;
			 }
			 if ((y[i] >= 36) && (y[i] <= 60))
			 {
				 c++;
			 }
			 if (y[i] > 60)
			 {
				 d++;
			 }
		}
			System.out.printf("1-18: %.2f%%\n",100.0 * a / n);
			System.out.printf("19-35: %.2f%%\n",100.0 * b / n);
			System.out.printf("36-60: %.2f%%\n",100.0 * c / n);
			System.out.printf("60??: %.2f%%\n",100.0 * d / n);
	}

}

