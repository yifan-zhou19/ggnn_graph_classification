package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	a[100],m,k;
		int i;
		int j;
		int n;
		int num = 0;
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
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				num++;
				m = a[i];
				for (j = i;j > 0;j--)
				{
					a[j] = a[j - 1];
				}
				a[0] = m;
			}
		}
		for (i = 0;i < num;i++)
		{
			for (j = i + 1;j < num;j++)
			{
				if (a[i].age <= a[j].age)
				{
					k = a[i];
					a[i] = a[j];
					a[j] = k;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i].id);
		}
		return 0;
	}
}

