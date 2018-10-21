package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int x = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ID
	//	{
	//		int age;
	//		char a[10];
	//	}
	//	ID[201];
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
				ID[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ID[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (ID[i].age >= 60)
			{
				ID[100 + x] = ID[i];
				ID[i].a[0] = '\0';
				x++;
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			for (y = 0;y < x - 1 - i;y++)
			{
				if (ID[100 + y].age < ID[y + 101].age)
				{
					ID[200] = ID[100 + y];
					ID[100 + y] = ID[y + 101];
					ID[y + 101] = ID[200];
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%s\n",ID[100 + i].a);
		}
		for (i = 0;i < n;i++)
		{
			if (ID[i].a[0] != '\0')
			{
				System.out.printf("%s\n",ID[i].a);
			}
		}


		return 0;
	}


}

