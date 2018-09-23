package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		float ave = 0F;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *depart;
		float depart;
		float max = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		depart = (float)malloc(n * (Float.SIZE / Byte.SIZE));
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1; i > 0; i--)
		{
			for (j = 0; j < i; j++)
			{
				if (*(a + j) > *(a + j + 1))
				{
					temp = (a + j);
					*(a + j) = *(a + j + 1);
					*(a + j + 1) = temp;
				}
			}
		}
		//for(i=0; i<n; i++) printf("%d\n",*(a+i));
		for (i = 0; i < n; i++)
		{
			ave = ave + (float) * (a + i) / n;
		}
		for (i = 0; i < n; i++)
		{
			*(depart + i) = ave - *(a + i);
			if (*(depart + i) < 0)
			{
				*(depart + i) = -*(depart + i);
			}
			if (*(depart + i) > max)
			{
				max = (depart + i);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(*(depart + i) - max) < 1.0e-3)
			{
				num = num + 1;
			}
		}
		//for(i=0; i<n; i++) printf("%f\n",*(depart+i));
		//printf("!!!%f\n",max);
		//printf("%d\n",num);

		for (i = 0; i < n; i++)
		{
			if (Math.abs(*(depart + i) - max) < 1.0e-3)
			{
				System.out.printf("%d",*(a + i));
				break;
			}
		}
		i = i + 1;
		for (; i < n; i++)
		{
			if (Math.abs(*(depart + i) - max) < 1.0e-3)
			{
				System.out.printf(",%d",*(a + i));
			}
		}

	}
}

