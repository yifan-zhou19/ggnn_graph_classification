package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int number;
	//		int chinese;
	//		int math;
	//		int sum;
	//		}
	//		students[100000];
			int n;
			int i;
			int a1;
			int b1;
			int a2;
			int b2;
			int a3;
			int b3;
			int c1;
			int c2;
			int max = 0;
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
				students[i].number = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				students[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				students[i].math = tempVar4;
			}
			students[i].sum = students[i].chinese + students[i].math;
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (students[i].sum > max)
			{
				max = students[i].sum;
				a1 = students[i].number;
				b1 = students[i].sum;
				c1 = i;
			}
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
		if (students[i].sum > max && i != c1)
		{
				max = students[i].sum;
				a2 = students[i].number;
				b2 = students[i].sum;
				c2 = i;
		}
		}
	   max = 0;
	   for (i = 0;i < n;i++)
	   {
			if (students[i].sum > max && i != c2 && i != c1)
			{
				max = students[i].sum;
				a3 = students[i].number;
				b3 = students[i].sum;
			}
	   }
		System.out.printf("%d %d\n",a1,b1);
		System.out.printf("%d %d\n",a2,b2);
		System.out.printf("%d %d\n",a3,b3);
		return 0;
	}







}

