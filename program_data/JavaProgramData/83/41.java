package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double GPA;
	float c;
	float m;
	float sum = 0F;
	float mum = 0F;
	int n;
	int i;
	int p;
	int q;
	int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct majors
	//	{
	//	float credit;
	//	float marks;
	//	};
		majors jidian;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		jidian = (majors)malloc(sizeof(majors) * n);

		for (i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c = Float.parseFloat(tempVar2);
				}
			 (jidian + i).credit = c;
		}

		for (p = 0;p < n;p++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Float.parseFloat(tempVar3);
			}
			if ((m <= 100F) && (m >= 90F))
			{
				(jidian + p).marks = 4.0;
			}
			else if ((m <= 89F) && (m >= 85F))
			{
				(jidian + p).marks = 3.7;
			}
			else if ((m <= 84F) && (m >= 82F))
			{
				(jidian + p).marks = 3.3;
			}
			else if ((m <= 81F) && (m >= 78F))
			{
				(jidian + p).marks = 3.0;
			}
			else if ((m <= 77F) && (m >= 75F))
			{
				(jidian + p).marks = 2.7;
			}
			else if ((m <= 74F) && (m >= 72F))
			{
				(jidian + p).marks = 2.3;
			}
			else if ((m <= 71F) && (m >= 68F))
			{
				(jidian + p).marks = 2.0;
			}
			else if ((m <= 67F) && (m >= 64F))
			{
				(jidian + p).marks = 1.5;
			}
			else if ((m <= 63F) && (m >= 60F))
			{
				(jidian + p).marks = 1.0;
			}
			else if (m < 60F)
			{
				(jidian + p).marks = 0;
			}
		}

		for (q = 0;q < n;q++)
		{
			sum = sum + ((jidian + q).marks) * ((jidian + q).credit);
		}

		for (u = 0;u < n;u++)
		{
			mum = mum + ((jidian + u).credit);
		}

		GPA = sum / mum;
		System.out.printf("%.2f",GPA);
		jidian = null;

	}


}

