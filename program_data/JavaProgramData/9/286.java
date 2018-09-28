package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int f = 0;
		int m = 0;
		int j;


//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	bingren[100],t[100],l[100],c;
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
				bingren[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bingren[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (bingren[i].age >= 60)
			{
				t[f++] = bingren[i];
			}
			else if (bingren[i].age < 60)
			{
				l[m++] = bingren[i];
			}
		}


		for (i = 1;i < f;i++)
		{
			for (j = i;j > 0;j--)
			{
			  if (t[j].age > t[j - 1].age)
			  {
			  c = t[j];
			  t[j] = t[j - 1];
			  t[j - 1] = c;
			  }
			}
		}

		for (i = 0;i < f;i++)
		{
			System.out.printf("%s\n",t[i].id);
		}

		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",l[i].id);
		}
		return 0;
	}



}

