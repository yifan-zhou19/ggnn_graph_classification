package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int zxuefen;
		float GPA;
		float zxfjd;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xuefen = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *chengji=(int*)malloc(sizeof(chengji)* n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int chengji = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *jidian=(float*)malloc(sizeof(jidian)* n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		float jidian = (float)malloc((Float.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *xfjd=(float*)malloc(sizeof(xfjd)* n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		float xfjd = (float)malloc((Float.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (chengji[i] >= 90)
			{
				jidian[i] = 4.0;
			}
			else if (chengji[i] >= 85)
			{
				jidian[i] = 3.7;
			}
			else if (chengji[i] >= 82)
			{
				jidian[i] = 3.3;
			}
			else if (chengji[i] >= 78)
			{
				jidian[i] = 3.0;
			}
			else if (chengji[i] >= 75)
			{
				jidian[i] = 2.7;
			}
			else if (chengji[i] >= 72)
			{
				jidian[i] = 2.3;
			}
			else if (chengji[i] >= 68)
			{
				jidian[i] = 2.0;
			}
			else if (chengji[i] >= 64)
			{
				jidian[i] = 1.5;
			}
			else if (chengji[i] >= 60)
			{
				jidian[i] = 1.0;
			}
			else
			{
				jidian[i] = 0;
			}
			xfjd[i] = jidian[i] * xuefen[i];
		}
		zxuefen = 0;
		zxfjd = 0F;
		for (i = 0;i < n;i++)
		{
			zxuefen += xuefen[i];
		}

		for (i = 0;i < n;i++)
		{
			zxfjd += xfjd[i];
		}

		GPA = zxfjd / zxuefen;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

