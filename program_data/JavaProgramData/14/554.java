package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max1 = 0;
		int num1 = 0;
		int max2 = 0;
		int num2 = 0;
		int max3 = 0;
		int num3 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int num;
	//		int chn;
	//		int mat;
	//		int sum;
	//	}
	//	sco[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			sco[i].num = ConsoleInput.readToWhiteSpace(true);
			sco[i].chn = ConsoleInput.readToWhiteSpace(true);
			sco[i].mat = ConsoleInput.readToWhiteSpace(true);
			sco[i].sum = sco[i].chn + sco[i].mat;
		}
		for (i = 0;i < n;i++)
		{
			if (sco[i].sum > max1)
			{
				max3 = max2;
				num3 = num2;
				max2 = max1;
				num2 = num1;
				max1 = sco[i].sum;
				num1 = i;

			}
			else
			{
				if (sco[i].sum > max2)
				{
							max3 = max2;
							num3 = num2;
							max2 = sco[i].sum;
							num2 = i;
				}
				else
				{
					if (sco[i].sum > max3)
					{
								max3 = sco[i].sum;
								num3 = i;
					}
				}
			}
		}
			System.out.print(num1 + 1);
			System.out.print(' ');
			System.out.print(max1);
			System.out.print("\n");
			System.out.print(num2 + 1);
			System.out.print(' ');
			System.out.print(max2);
			System.out.print("\n");
			System.out.print(num3 + 1);
			System.out.print(' ');
			System.out.print(max3);
			System.out.print("\n");
		return 0;
	}

}

