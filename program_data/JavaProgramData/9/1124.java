package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	p,q,a[100],old[100],yog[100];
		int n;
		int i = 0;
		int x = 0;
		int y = 0;
		int k;
		int l;
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
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = tempVar3;
			}
			if (a[i].age >= 60)
			{
				old[x] = a[i];
				x++;
			}
			if (a[i].age < 60)
			{
				yog[y] = a[i];
				y++;
			}
		}
		for (k = 1;k < x;k++)
		{
			for (i = 0;i < x - 1;i++)
			{
				if (old[i].age < old[i + 1].age)
				{
					p = old[i + 1];
					old[i + 1] = old[i];
					old[i] = p;
				}
			}
		}
		for (i = 0;i < x;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",yog[i].id);
		}
		return 0;
	}

}

