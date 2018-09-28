package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t = 0;
		int e;
		int num = 0;
		int k;
		String z = new String(new char[10]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char ID[10];
	//		int age;
	//	}
	//	a[100],b[100];
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
				a[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				num = num + 1;
			}
		}
		int f = num;
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				b[t].age = a[i].age;
				b[t].ID = a[i].ID;
				t++;
			}
			if (a[i].age < 60)
			{
				b[f].age = a[i].age;
				b[f].ID = a[i].ID;
				f++;
			}
		}
		for (i = 0;i < num;i++)
		{
			for (k = 0;k < num - i - 1;k++)
			{
				if (b[k].age < b[k + 1].age)
				{
					e = b[k].age;
					b[k].age = b[k + 1].age;
					b[k + 1].age = e;
					z = b[k + 1].ID;
					b[k + 1].ID = b[k].ID;
					b[k].ID = z;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b[i].ID);
		}











		return 0;


	}
}

