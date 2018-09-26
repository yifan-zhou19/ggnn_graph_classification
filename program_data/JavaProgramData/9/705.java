package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char a[10];
	//		int age;
	//	}
	//	pat[100];
		int n;
		int i;
		int m;
		int[] b = new int[100];
		int l = 0;
		int p;
		int q = 0;
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
				pat[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age >= 60)
			{
				l = l + 1;
				b[l] = pat[i].age;
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (m = i + 1;m <= l;m++)
			{
				if (b[i] < b[m])
				{
					p = b[i];
					b[i] = b[m];
					b[m] = p;
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (m = 1;m <= l;m++)
			{
				if (b[i] == b[m])
				{
					if (i != m)
					{
						b[m] = 0;
					}
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (m = 0;m < n;m++)
			{
				if (pat[m].age == b[i])
				{
					System.out.printf("%s\n",pat[m].a);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				System.out.printf("%s\n",pat[i].a);
			}
		}
		return 0;
	}
}

