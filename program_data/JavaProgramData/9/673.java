package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char num[10];
	//		int age;
	//	}
	//	pa[100],pao[100],pay[100],blank;
		int i;
		int j = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pa[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pa[i].age = tempVar3;
			}
			if (pa[i].age >= 60)
			{
				pao[j++] = pa[i];
			}
			else
			{
				pay[k++] = pa[i];
			}
		}
		int t;
		for (i = 0;i < j;i++)
		{
			for (t = i + 1;t < j;t++)
			{
				if (pao[t].age > pao[i].age)
				{
					blank = pao[i];
					pao[i] = pao[t];
					pao[t] = blank;
				}

			}
		}
		for (i = 0;i < j;i++)
		{
			if (pao[i].age != pao[i - 1].age)
			{
				for (t = 0;t < n;t++)
				{
					if (pa[t].age == pao[i].age)
					{
						System.out.printf("%s\n",pa[t].num);
					}
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",pay[i].num);
		}
	}





}

