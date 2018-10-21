package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int AGE;
		int i;
		int A1_18 = 0;
		int A19_35 = 0;
		int A36_60 = 0;
		int A_60 = 0;
		float a;
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
				AGE = Integer.parseInt(tempVar2);
			}
			if (AGE <= 18)
			{
				A1_18++;
			}
			else if (AGE > 60)
			{
				A_60++;
			}
			else if (AGE > 18 && AGE <= 35)
			{
				A19_35++;
			}
			else
			{
				A36_60++;
			}
		}
		a = A1_18 * 100.0 / n;
		System.out.printf("1-18: %.2f%%\n",a);
		a = A19_35 * 100.0 / n;
		System.out.printf("19-35: %.2f%%\n",a);
		a = A36_60 * 100.0 / n;
		System.out.printf("36-60: %.2f%%\n",a);
		a = A_60 * 100.0 / n;
		System.out.printf("60??: %.2f%%\n",a);
	}


}

