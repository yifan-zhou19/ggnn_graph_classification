package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		int k;
	//		char id[10];
	//		int age;
	//	}
	//	pa[100]={0,"",0},pb[100]={0,"",0},temp;


		int n;
		int i;
		int j;
		int k;
		int age;
		int na;
		int nb;
		final String id = "";

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0,j = 0;i + j < n;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age = Integer.parseInt(tempVar3);
			}
			if (age >= 60)
			{
				pa[i].age = age;
				pa[i].id = id;
				pa[i].k = i;
				i++;
			}
			else
			{
				pb[j].age = age;
				pb[j].id = id;
				pb[j].k = j;
				j++;
			}
		}
		na = i;
		nb = j;




		for (j = 1;j <= n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (pa[i].age < pa[i + 1].age)
				{
					temp.age = pa[i + 1].age;
					temp.id = pa[i + 1].id;
					pa[i + 1].age = pa[i].age;
					pa[i + 1].id = pa[i].id;
					pa[i].age = temp.age;
					pa[i].id = temp.id;

				}

			}
		}

		System.out.printf("%s",pa[0].id);
		for (i = 1;i <= na;i++)
		{
			System.out.printf("\n%s",pa[i].id);
		}
		for (j = 0;j <= nb;j++)
		{
			System.out.println(pb[j].id);
		}

	}
}

