package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student
	//	{
	//		int num;
	//		int ch;
	//		int math;
	//	}
	//	stu[100000];
		int n;
		int i;
		int x = 0;
		int m = 0;
		int k = 0;
		int j;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].ch = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
			a[i] = stu[i].ch + stu[i].math;
		}
		for (j = 0;j < 3;j++)
		{
			for (i = 0;i < n;i++)
			{

				   if (a[i] > m)
				   {
				m = a[i];
				x = stu[i].num;
				k = i;
				   }

			}
		System.out.printf("%d %d\n",x,m);
		a[k] = 0;
				m = 0;
				x = 0;
		}
		return 0;
	}







}

