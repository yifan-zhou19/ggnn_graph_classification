package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		double sumcredit = 0;
		double sumgpa = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a,*b;
		double a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *b;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (double)malloc(n * (Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (double)malloc(n * (Double.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a + i) = Double.parseDouble(tempVar2);
			}
			sumcredit = sumcredit + *(a + i);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b + i) = Double.parseDouble(tempVar3);
			}
			if (*(b + i) >= 90 && *(b + i) <= 100)
			{
				*(b + i) = 4.0 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 85 && *(b + i) <= 89)
			{
				*(b + i) = 3.7 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 82 && *(b + i) <= 84)
			{
				*(b + i) = 3.3 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 78 && *(b + i) <= 81)
			{
				*(b + i) = 3.0 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 75 && *(b + i) <= 77)
			{
				*(b + i) = 2.7 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 72 && *(b + i) <= 74)
			{
				*(b + i) = 2.3 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 68 && *(b + i) <= 71)
			{
				*(b + i) = 2.0 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 64 && *(b + i) <= 67)
			{
				*(b + i) = 1.5 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) >= 60 && *(b + i) <= 63)
			{
				*(b + i) = 1.0 * *(a + i);
				sumgpa = sumgpa + *(b + i);
			}
			if (*(b + i) < 60)
			{
				*(b + i) = 0;
				sumgpa = sumgpa + *(b + i);
			}
		}
		System.out.printf("%.2lf",sumgpa / sumcredit);
	}
}

