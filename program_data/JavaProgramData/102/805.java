package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p;
		int j = 0;
		int k = 0;
		double tempHeight;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char sex[7];
	//		double height;
	//	}
	//	student[41];

		int count = 0;
		double[] maleHeight = new double[41];
		double[] femaleHeight = new double[41];
		for (i = 0; i < n; i++)
		{
			student[i].sex = ConsoleInput.readToWhiteSpace(true);
			student[i].height = ConsoleInput.readToWhiteSpace(true);
			if (student[i].sex[0] == 'm')
			{
				count++;
			}
		}

		for (i = 0; i < n; i++)
		{
			if (student[i].sex[0] == 'm')
			{
				maleHeight[i] = student[i].height;
			}
			if (student[i].sex[0] == 'f')
			{
				femaleHeight[i] = student[i].height;
			}
		}

		for (i = 0; i < n - 1; i++)
		{
			for (p = 0; p < n - 1 - i; p++)
			{
				if (maleHeight[p] > maleHeight[p + 1])
				{
					tempHeight = maleHeight[p];
					maleHeight[p] = maleHeight[p + 1];
					maleHeight[p + 1] = tempHeight;
				}
			}
		}
		for (i = 0; i <= n - 1; i++)
		{
			for (p = 0; p <= n - 1 - i; p++)
			{
				if (femaleHeight[p] < femaleHeight[p + 1])
				{
					tempHeight = femaleHeight[p];
					femaleHeight[p] = femaleHeight[p + 1];
					femaleHeight[p + 1] = tempHeight;
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			if (maleHeight[i] != 0)
			{
				j = i;
				System.out.printf("%.2f", maleHeight[j]);
				break;
			}
		}
		for (i = j + 1; i < n; i++)
		{
			if (maleHeight[i] != 0)
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", maleHeight[i]);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (femaleHeight[i] != 0)
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", femaleHeight[i]);
			}
		}
		return 0;
	}
}

