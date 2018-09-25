package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *xuefen;
		float xuefen;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *chengji;
		float chengji;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *GPA;
		float GPA;
		float xf;
		float cj;
		float xuefensum = 0F;
		float GPAsum = 0F;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		xuefen = (float)malloc((Float.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		chengji = (float)malloc((Float.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		GPA = (float)malloc((Float.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf = Float.parseFloat(tempVar2);
			}
			*(xuefen + i) = xf;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj = Float.parseFloat(tempVar3);
			}
			*(chengji + i) = cj;
		}
		for (i = 0;i < n;i++)
		{
			if (*(chengji + i) >= 90 && *(chengji + i) <= 100)
			{
				*(GPA + i) = 4.0;
			}
			else if (*(chengji + i) >= 85 && *(chengji + i) <= 89)
			{
				*(GPA + i) = 3.7;
			}
			else if (*(chengji + i) >= 82 && *(chengji + i) <= 84)
			{
				*(GPA + i) = 3.3;
			}
			else if (*(chengji + i) >= 78 && *(chengji + i) <= 81)
			{
				*(GPA + i) = 3.0;
			}
			else if (*(chengji + i) >= 75 && *(chengji + i) <= 77)
			{
				*(GPA + i) = 2.7;
			}
			else if (*(chengji + i) >= 72 && *(chengji + i) <= 74)
			{
				*(GPA + i) = 2.3;
			}
			else if (*(chengji + i) >= 68 && *(chengji + i) <= 71)
			{
				*(GPA + i) = 2.0;
			}
			else if (*(chengji + i) >= 64 && *(chengji + i) <= 67)
			{
				*(GPA + i) = 1.5;
			}
			else if (*(chengji + i) >= 60 && *(chengji + i) <= 63)
			{
				*(GPA + i) = 1.0;
			}
			else
			{
				*(GPA + i) = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			GPAsum += (*(GPA + i)) * (*(xuefen + i));
		}
		for (i = 0;i < n;i++)
		{
			xuefensum += *(xuefen + i);
		}
		System.out.printf("%.2f\n",GPAsum / xuefensum);
		return 0;
	}
}

