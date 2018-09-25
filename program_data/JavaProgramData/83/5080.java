package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sc;
		int[] xuefen = new int[10];
		int S = 0;
		float s = 0F;
		float gpa;
		float average;
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
			S = S + xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sc = Integer.parseInt(tempVar3);
			}

				if (sc <= 100 && sc >= 90)
				{
				gpa = 4.0F;
				}
				else if (sc <= 89 && sc >= 85)
				{
				gpa = 3.7F;
				}
				else if (sc <= 84 && sc >= 82)
				{
				gpa = 3.3F;
				}
				else if (sc >= 78 && sc <= 81)
				{
				 gpa = 3.0F;
				}
				else if (sc >= 75 && sc <= 77)
				{
				gpa = 2.7F;
				}
				else if (sc >= 72 && sc <= 74)
				{
				gpa = 2.3F;
				}
				else if (sc >= 68 && sc <= 71)
				{
				gpa = 2.0F;
				}
					else if (sc >= 64 && sc <= 67)
					{
			   gpa = 1.5F;
					}
				else if (sc >= 60 && sc <= 63)
				{
			   gpa = 1.0F;
				}
				   else if (sc < 60)
				   {
				gpa = 0.0F;
				   }
				   s = s + xuefen[i] * gpa;
		}
		average = s / S;
		System.out.printf("%.2f",average);
	}



}

