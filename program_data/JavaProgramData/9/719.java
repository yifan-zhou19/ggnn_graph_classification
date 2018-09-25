package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num; //num??????
		int i;
		int j;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct inf //?????????ID
	//	{
	//		char str[10];
	//		int age;
	//	}
	//	infs[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct f
	//	{
	//		char *p1;
	//		int m1;
	//	}
		old[101]; //??????????
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				infs[i].str = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				infs[i].age = tempVar3;
			}
		}
		for (i = 0,j = 0;i < num;i++) //????????????????????????????
		{
			if (infs[i].age >= 60)
			{
				old[j].m1 = infs[i].age;
			 old[j].p1 = infs[i].str; //??????????ID
			 j++;
			}
		}
		int end = j;
		String k;
		for (i = 0;i < end - 1;i++) //?????????????????????
		{
			for (j = 0;j + 1 < end - i;j++)
			{
				if (old[j].m1 < old[j + 1].m1)
				{
					l = old[j].m1;
					old[j].m1 = old[j + 1].m1;
					old[j + 1].m1 = l;
					k = old[j].p1;
					old[j].p1 = old[1 + j].p1;
					old[1 + j].p1 = k;
				}
			}
		}
		for (i = 0;i < end;i++) //??????
		{
			System.out.printf("%s\n",old[i].p1);
		}
		for (i = 0;i < num;i++)
		{
			if (infs[i].age < 60) //????????
			{
			System.out.printf("%s\n",infs[i].str);
			}
		}
	}


}

