package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		char num[10];
	//		int age;
	//	}
	//	peo[100],pai[100],temp;

		int i;
		int n;
		int j = 0;
		int k = 0;

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
		}


		for (i = 0;i < n;i++)
		{
			if (peo[i].age >= 60)
			{
				pai[j] = peo[i];
				j++;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (peo[i].age < 60)
			{
				pai[j] = peo[i];
				j++;
			}
		}



		for (k = 0;k < j - 1;k++)
		{
			for (i = 0;i < j - 1 - k;i++)
			{
				if ((pai[i].age < pai[i + 1].age) && (pai[i + 1].age >= 60))
				{
					temp = pai[i];
					pai[i] = pai[i + 1];
					pai[i + 1] = temp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",pai[i].num);
		}
	}



}

