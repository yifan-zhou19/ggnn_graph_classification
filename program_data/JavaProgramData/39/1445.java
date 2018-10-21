package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stud
	//	{
	//		char name[1000];
	//		int gra;
	//		int grcla;
	//		char of;
	//		char won;
	//		int essay;
	//		int sum;
	//	};
		stud[] a = tangible.Arrays.initializeWithDefaultstudInstances(1000);


		int n;
		int i;
		int all = 0;
		int j = 0;
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
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].gra = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].grcla = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].of = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].won = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].essay = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			a[i].sum = 0;
			if (a[i].gra > 80 && a[i].essay >= 1)
			{
				a[i].sum = 8000;
			}
			if (a[i].gra > 85 && a[i].grcla > 80)
			{
				a[i].sum = a[i].sum + 4000;
			}
			if (a[i].gra > 90)
			{
				a[i].sum = a[i].sum + 2000;
			}
			if (a[i].gra > 85 && a[i].won == 'Y')
			{
				a[i].sum = a[i].sum + 1000;
			}
			if (a[i].grcla > 80 && a[i].of == 'Y')
			{
				a[i].sum = a[i].sum + 850;
			}
		}

		for (i = 0;i < n;i++)
		{
			all = all + a[i].sum;
		}



		for (i = 0;i <= n - 1;)
		{
			if (a[i].sum < a[j + 1].sum)
			{
				i = i + 1;
			}
			else if (a[i].sum >= a[j + 1].sum)
			{
				j++;
			}
			if (j >= n)
			{
				break;
			}
		}


		System.out.printf("%s\n",a[i].name);
		System.out.printf("%d\n",a[i].sum);
		System.out.printf("%d\n",all);

	}



}

