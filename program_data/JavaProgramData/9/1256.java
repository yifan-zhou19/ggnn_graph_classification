package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct old
	//	{
	//		char ID[10];
	//		int age;
	//	};
		old[] ill = tangible.Arrays.initializeWithDefaultoldInstances(100);
		old[] t1 = tangible.Arrays.initializeWithDefaultoldInstances(100);
		old[] t2 = tangible.Arrays.initializeWithDefaultoldInstances(100);
		old t = new old();
		int n;
		int i;
		int j = 0;
		int k = 0;
		int num60 = 0;
		int num0 = 0;
		int[] b = new int[100];
		int p;
		int num = 0;
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
				ill[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ill[i].age = tempVar3;
			}
			if (ill[i].age >= 60)
			{
				t1[j] = ill[i];
				j++;
				num60++;
			}
			else
			{
				t2[k] = ill[i];
				k++;
				num0++;
			}
		}
		for (i = 0;i < num60;i++)
		{
			p = 0;
			for (j = 0;j < num60;j++)
			{
				if (t1[j].age > p && b[j] == 0)
				{
					p = t1[j].age;
					num = j;
				}
			}
			System.out.printf("%s\n",t1[num].ID);
			b[num] = 1;
		}
		for (i = 0;i < num0;i++)
		{
			System.out.printf("%s\n",t2[i].ID);
		}
		return 0;
	}
}

