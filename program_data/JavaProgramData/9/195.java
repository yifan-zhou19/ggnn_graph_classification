package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	pa[100]={0},old[100]={0},young[100]={0},t;
		int i;
		int j;
		int k = 0;
		int l = 0;
		int n;
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
				pa[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pa[i].age >= 60)
			{
				old[k] = pa[i];
				k++;
			}
			else
			{
				young[l] = pa[i];
					l++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					t = old[j];
					old[j] = old[j + 1];
					old[j + 1] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%s\n",young[i].id);
		}
	}
}

