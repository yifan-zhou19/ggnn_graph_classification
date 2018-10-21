package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sixty = new int[100];
				 int n;
				 int i;
				 int j;
				 int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//		 struct patient
	//		 {
	//	char num[11];
	//	int age;
	//		 }
	//		 peo[100];
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
				peo[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				peo[i].age = tempVar3;
			}
			if (peo[i].age >= 60)
			{
				sixty[i] = peo[i].age;

			}
			else
			{

				sixty[i] = 0;
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = n - 1;i > j;i--)
			{
				if (sixty[i - 1] < sixty[i])
				{
					a = sixty[i - 1];
					sixty[i - 1] = sixty[i];
					sixty[i] = a;

				}
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sixty[i] == peo[j].age && sixty[i] != sixty[i - 1])
				{
					System.out.printf("%s\n",peo[j].num);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (peo[i].age < 60)
			{
				System.out.printf("%s\n",peo[i].num);
			}
		}


		return 0;

	}
}

