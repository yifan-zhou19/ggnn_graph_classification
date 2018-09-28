package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *xuefen;
		int xuefen;
		int[] score;
		int i;
		int txuefen = 0;
		float[] gpa;
		float total = 0F;
		float part;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		xuefen = (int)malloc((Integer.SIZE / Byte.SIZE) * num);
		score = new int[num];
		gpa = new float[num];
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen + i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score + i = tempVar3;
			}
		}
		for (i = 0;i < num;i++)
		{
			if (score[i] >= 90)
			{
				gpa[i] = 4.0F;
			}
			if (score[i] >= 85 && score[i] <= 89)
			{
				gpa[i] = 3.7F;
			}
			if (score[i] >= 82 && score[i] <= 84)
			{
				gpa[i] = 3.3F;
			}
			if (score[i] >= 78 && score[i] <= 81)
			{
				gpa[i] = 3.0F;
			}
			if (score[i] >= 75 && score[i] <= 77)
			{
				gpa[i] = 2.7F;
			}
			if (score[i] >= 72 && score[i] <= 74)
			{
				gpa[i] = 2.3F;
			}
			if (score[i] >= 68 && score[i] <= 71)
			{
				gpa[i] = 2.0F;
			}
			if (score[i] >= 64 && score[i] <= 67)
			{
				gpa[i] = 1.5F;
			}
			if (score[i] >= 60 && score[i] <= 63)
			{
				gpa[i] = 1.0F;
			}
			if (score[i] <= 59)
			{
				gpa[i] = 0F;
			}
		}
		for (i = 0;i < num;i++)
		{
			part = xuefen[i] * gpa[i];
			total = total + part;
			txuefen = xuefen[i] + txuefen;
		}
		GPA = total / txuefen;
		System.out.printf("%.2f",GPA);
	}
}

