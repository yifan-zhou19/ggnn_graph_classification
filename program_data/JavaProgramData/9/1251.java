package <missing>;

public class GlobalMembers
{
	public static void Main(void argc, String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//	char ID[10];
	//	int age;
	//}
	//stu[100],stud[100];
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int c;
		int j;
		int x;
		int n;
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
				stu[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].age = tempVar3;
			}
		}
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].age >= 60)
			{
				a[k] = stu[i].age;
				b[k] = i;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < k;j++)
			{
				if (a[j] < a[j + 1])
				{
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
					x = b[j];
					b[j] = b[j + 1];
					b[j + 1] = x;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			c = b[i];
		   System.out.printf("%s\n",stu[c].ID);
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].age < 60)
			{
				System.out.printf("%s\n",stu[i].ID);
			}
		}
	}
}

