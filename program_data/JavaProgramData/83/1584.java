package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int grade;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] credit = new float[10];
		float a = 0F;
		float b = 0F;
		float GPA;
		for (i = 1;i <= n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							credit[i] = Float.parseFloat(tempVar2);
						}
						a += credit[i];
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			grade = Integer.parseInt(tempVar3);
		}
		if (90 <= grade != 0 && grade <= 100)
		{
		b += credit[i] * 4.0;
		}
		else if (85 <= grade != 0 && grade <= 89)
		{
		b += credit[i] * 3.7;
		}
		else if (82 <= grade != 0 && grade <= 84)
		{
		b += credit[i] * 3.3;
		}
		else if (78 <= grade != 0 && grade <= 81)
		{
		b += credit[i] * 3.0;
		}
		else if (75 <= grade != 0 && grade <= 77)
		{
		b += credit[i] * 2.7;
		}
		else if (72 <= grade != 0 && grade <= 74)
		{
		b += credit[i] * 2.3;
		}
		else if (68 <= grade != 0 && grade <= 71)
		{
		b += credit[i] * 2.0;
		}
		else if (64 <= grade != 0 && grade <= 67)
		{
		b += credit[i] * 1.5;
		}
		else if (60 <= grade != 0 && grade <= 63)
		{
		b += credit[i] * 1.0;
		}
		else
		{
		b += credit[i] * 0;
		}
		}
		GPA = b / a;
		System.out.printf("%.2f",GPA);
	}

}

