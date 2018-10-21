package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct person
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	m[100],b[100];
		int n;
		int t;
		int i;
		int j;
		String temp = new String(new char[10]);

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
				m[i].id = tempVar2;
			}
			b[i].id = m[i].id;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i].age = tempVar3;
			}
			b[i].age = m[i].age;
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (m[j].age < m[j + 1].age)
				{
					t = m[j].age;
					m[j].age = m[j + 1].age;
					m[j + 1].age = t;
					temp = m[j].id;
					m[j].id = m[j + 1].id;
					m[j + 1].id = temp;
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				if (m[i].age >= 60)
				{
					System.out.printf("%s\n",m[i].id);
				}
			}
			for (i = 0;i < n;i++)
			{
				if (b[i].age < 60)
				{
					System.out.printf("%s\n",b[i].id);
				}
			}

	}


}

