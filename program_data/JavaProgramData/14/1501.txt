package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
		int num;
		int chi;
		int math;
		int sum;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num,chi,math,sum;
	//	}
	//	students[100000];
		int i;
		int STUDENT_NUM;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			STUDENT_NUM = Integer.parseInt(tempVar);
		}
		for (i = 0;i < STUDENT_NUM;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			students[i].num = num;
			students[i].chi = chi;
			students[i].math = math;
			sum = chi + math;
			students[i].sum = sum;
		}
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int num1;
		int num2;
		int num3;
		for (i = 0;i < STUDENT_NUM;i++)
		{
			if (i == 0)
			{
				sum1 = students[0].sum;
				num1 = students[0].num;
			}
			else if (i == 1)
			{
				if (students[1].sum > students[0].sum)
				{
					sum2 = sum1;
					num2 = num1;
					sum1 = students[1].sum;
					num1 = students[1].num;
				}
				else
				{
					sum2 = students[1].sum;
					num2 = students[1].num;
				}
			}
			else
			{
				if (students[i].sum > sum1)
				{
					sum3 = sum2;
					num3 = num2;
					sum2 = sum1;
					num2 = num1;
					sum1 = students[i].sum;
					num1 = students[i].num;
				}
				else if (students[i].sum > sum2)
				{
					sum3 = sum2;
					num3 = num2;
					sum2 = students[i].sum;
					num2 = students[i].num;
				}
				else if (students[i].sum > sum3)
				{
					sum3 = students[i].sum;
					num3 = students[i].num;
				}
			}
		}
		System.out.printf("%d %d\n",num1,sum1);
		System.out.printf("%d %d\n",num2,sum2);
		System.out.printf("%d %d\n",num3,sum3);
	}
}

