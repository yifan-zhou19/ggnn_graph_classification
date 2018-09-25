package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *w,sum2=0,gpa;
		float w;
		float sum2 = 0F;
		float gpa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		w = (float)malloc((Float.SIZE / Byte.SIZE) * n);
		for (m = 0,sum = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q + m = Integer.parseInt(tempVar2);
			}
			sum = sum + *(q + m);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w + m = Float.parseFloat(tempVar3);
			}
			if (*(w + m) <= 100 && *(w + m) >= 90)
			{
				sum2 = sum2 + 4.0 * *(q + m);
			}
			else if (*(w + m) <= 89 && *(w + m) >= 85)
			{
				sum2 = sum2 + 3.7 * *(q + m);
			}
			else if (*(w + m) <= 84 && *(w + m) >= 82)
			{
				sum2 = sum2 + 3.3 * *(q + m);
			}
			else if (*(w + m) <= 81 && *(w + m) >= 78)
			{
				sum2 = sum2 + 3.0 * *(q + m);
			}
			else if (*(w + m) <= 77 && *(w + m) >= 75)
			{
				sum2 = sum2 + 2.7 * *(q + m);
			}
			else if (*(w + m) <= 75 && *(w + m) >= 72)
			{
				sum2 = sum2 + 2.3 * *(q + m);
			}
			else if (*(w + m) <= 71 && *(w + m) >= 68)
			{
				sum2 = sum2 + 2.0 * *(q + m);
			}
			else if (*(w + m) <= 67 && *(w + m) >= 64)
			{
				sum2 = sum2 + 1.5 * *(q + m);
			}
			else if (*(w + m) <= 63 && *(w + m) >= 60)
			{
				sum2 = sum2 + 1.0 * *(q + m);
			}
			else if (*(w + m) <= 59)
			{
				sum2 = sum2 + 0.0 * *(q + m);
			}
		}
		gpa = sum2 / sum;
		System.out.printf("%.2f",gpa);
		return;
	}
}

