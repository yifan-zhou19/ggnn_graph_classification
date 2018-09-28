package <missing>;

public class GlobalMembers
{
	public static double judge(int a)
	{
		if (a <= 100 && a >= 90)
		{
			return 4.0;
		}
		else if (a <= 89 && a >= 85)
		{
			return 3.7;
		}
		else if (a <= 84 && a >= 82)
		{
			return 3.3;
		}
		else if (a <= 81 && a >= 78)
		{
			return 3.0;
		}
		else if (a <= 77 && a >= 75)
		{
			return 2.7;
		}
		else if (a <= 74 && a >= 72)
		{
			return 2.3;
		}
		else if (a <= 71 && a >= 68)
		{
			return 2.0;
		}
		else if (a <= 67 && a >= 64)
		{
			return 1.5;
		}
		else if (a <= 63 && a >= 60)
		{
			return 1.0;
		}
		else
		{
			return 0.0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pp[2];
		int[] pp = new int[2];
		int sumPOINT = 0;
		double sumGPA = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp[0] = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp[1] = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pp[0] + i = Integer.parseInt(tempVar2);
			}
			sumPOINT += *(pp[0] + i);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pp[1] + i = Integer.parseInt(tempVar3);
			}
			sumGPA += judge(*(pp[1] + i)) * *(pp[0] + i);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[0]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[1]);
		System.out.printf("%.2f\n",sumGPA / sumPOINT);
		return 0;
	}
}

