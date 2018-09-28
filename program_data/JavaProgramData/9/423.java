package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct br
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	*patients,t;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		patients = (br)malloc(sizeof(br) * n);

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patients[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				patients[i].age = tempVar3;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = n - 1; j > i; j--)
			{
				if (patients[j].age >= 60 && patients[j].age > patients[j - 1].age)
				{
					t = patients[j];
					patients[j] = patients[j - 1];
					patients[j - 1] = t;
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", patients[i].id);
		}

		return 0;
	}

}

