package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char ID[10];
	//		int age;
	//	}
	//	pat[100],old[100];
		int n;
		int i;
		int j;
		int k = 0;
		int a;
		String b = new String(new char[10]);
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
				pat[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
			if (pat[i].age >= 60)
			{
				old[k].ID = pat[i].ID;
				old[k].age = pat[i].age;
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < k - 1 - i;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					a = old[j].age;
					old[j].age = old[j + 1].age;
					old[j + 1].age = a;
					b = old[j].ID;
					old[j].ID = old[j + 1].ID;
					old[j + 1].ID = b;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",old[i].ID);
		}
		for (i = 0;i < n;i++)
		{
			if (pat[i].age < 60)
			{
				System.out.printf("%s\n",pat[i].ID);
			}
		}
	}
}

