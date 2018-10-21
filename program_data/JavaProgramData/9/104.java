package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pat
	//	{
	//	   char id[10];
	//	   int age;
	//	}
	//	pat[201];
		int i;
		int n;
		int j;
		int x = 0;
		int y = 0;
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
				pat[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
			System.out.print("\n");
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				pat[100 + x] = pat[i];
			x++;
			}
			else
			{
				pat[y] = pat[i];
				y++;
			}
		}
		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - i - 1;j++)
			{
				if (pat[100 + j].age < pat[101 + j].age)
				{
					pat[200] = pat[100 + j];
					pat[100 + j] = pat[101 + j];
					pat[101 + j] = pat[200];
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%s\n",pat[100 + i].id);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",pat[i].id);
		}
	}

}

