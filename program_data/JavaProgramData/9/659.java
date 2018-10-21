package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	s[100];

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
				s[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].age = tempVar3;
			}
		}
		while (true)
		{
			int max = 0;
			for (i = 0;i < n;i++)
			{
			if (s[i].age > s[max].age)
			{
				max = i;
			}
			}
		if (s[max].age >= 60)
		{
			System.out.printf("%s\n",s[max].id);
			s[max].age = 0;
		}
		else
		{
			break;
		}
		}
		for (i = 0;i < n;i++)
		{
		if (s[i].age > 0)
		{
			System.out.printf("%s\n",s[i].id);
		}
		}

	}

}

