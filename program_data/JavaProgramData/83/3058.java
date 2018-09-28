package <missing>;

public class GlobalMembers
{
	public static float GradePoint(int marks)
	{
		if (marks >= 90 && marks <= 100)
		{
			return 4.0F;
		}
		else if (marks >= 85 && marks <= 89)
		{
			return 3.7F;
		}
		else if (marks >= 82 && marks <= 84)
		{
			return 3.3F;
		}
		else if (marks >= 78 && marks <= 81)
		{
			return 3.0F;
		}
		else if (marks >= 75 && marks <= 77)
		{
			return 2.7F;
		}
		else if (marks >= 72 && marks <= 74)
		{
			return 2.3F;
		}
		else if (marks >= 68 && marks <= 71)
		{
			return 2.0F;
		}
		else if (marks >= 64 && marks <= 67)
		{
			return 1.5F;
		}
		else if (marks >= 60 && marks <= 63)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}

	}
	public static void Main()
	{
		int n;
		int i;
		int count = 0;
		int[] XueFen;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *Marks;
		int Marks;
		float GPA = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		XueFen = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		Marks = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				XueFen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				Marks[i] = tempVar3;
			}
		}


		for (i = 0;i < n;i++)
		{
			GPA = GPA + XueFen[i] * GradePoint(Marks[i]);
			count += XueFen[i];
		}
		System.out.printf("%3.2f",GPA / count);



	}
}

