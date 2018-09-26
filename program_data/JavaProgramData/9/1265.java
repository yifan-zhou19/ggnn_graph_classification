package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m = 0;
		int t;
		int x;
		String w = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//	int age;
	//	}
	//	a[100];
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
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient1
	//	{
	//		char id[10];
	//	int age;
	//	}
	//	b[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient2
	//	{
	//		char id[10];
	//	int age;
	//	}
	//	c[100];
		for (i = 0;i < n;i++)
		{
			if (a[i].age >= 60)
			{
				b[k].age = a[i].age;
				for (j = 0;j < 10;j++)
				{
					b[k].id[j] = a[i].id[j];
				}
				k++;

			} //???????patient1????
			else
			{
				c[m].age = a[i].age;
				for (j = 0;j < 10;j++)
				{
					c[m].id[j] = a[i].id[j];
				}
				m++;
			}
		} //?????????patient2,???
		for (j = 0;j < k - 1;j++)
		{
			for (i = 0;i < k - 1 - j;i++)
			{
				if (b[i].age < b[i + 1].age)
				{
					t = b[i].age;
					b[i].age = b[i + 1].age;
					b[i + 1].age = t;
					for (x = 0;x < 10;x++)
					{
						w = tangible.StringFunctions.changeCharacter(w, x, b[i].id[x]);
						b[i].id[x] = b[i + 1].id[x];
						b[i + 1].id[x] = w.charAt(x);
					}
				}
			}
		} //???patient1?age???????id
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",b[i].id); //??patient1
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",c[i].id); //??patient2
		}
		return 0;
	}



}

