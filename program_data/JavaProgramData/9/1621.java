package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int pass;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[L];
	//		int age;
	//	}
	//	men[M],temp;
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
				men[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				men[i].age = tempVar3;
			}
		}
		for (pass = 1;pass < n;pass++)
		{
			for (i = n - 1;i > pass - 1;i--)
			{
				if (men[i].age >= 60 && men[i].age > men[i - 1].age)
				{
					temp = men[i];
					men[i] = men[i - 1];
					men[i - 1] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",men[i].id);
		}
		return 0;
	}

}

