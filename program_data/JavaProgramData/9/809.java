package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	pa[1000],t;


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
				pa[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].age = tempVar3;
			}




		}


		for (i = 0;i < n;i++)
		{

			for (j = n - 1;j >= 0;j--)
			{


	if (pa[j].age > pa[j - 1].age && pa[j].age >= 60)


	{

	t = pa[j];
	pa[j] = pa[j - 1];
	pa[j - 1] = t;

	}
			}

		}
		for (i = 0;i < n;i++)
		{
			if (pa[i].age >= 60)
			{
				System.out.printf("%s\n",pa[i].id);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pa[i].age < 60)
			{
				System.out.printf("%s\n",pa[i].id);
			}
		}
	}

}

