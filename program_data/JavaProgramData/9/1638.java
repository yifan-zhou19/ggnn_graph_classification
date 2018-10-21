package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		int j;
		char[][] id = new char[100][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k = 0;
		char[][] shuchu = new char[100][10];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			if (age[i] < 60)
			{
				shuchu[k++] = id[i];
			}
		}
		char[][] mid = new char[100][10];
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (age[j] < age[j + 1])
				{
					t = age[j];
					age[j] = age[j + 1];
					age[j + 1] = t;
					mid[j] = id[j];
					id[j] = id[j + 1];
					id[j + 1] = mid[j];
				}
			}
		}
		if (age[0] < 60)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto E;
		}
		else
		{
			for (i = 0;age[i] >= 60;i++)
			{
				System.out.printf("%s\n",id[i]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	E:
	;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",shuchu[i]);
		}
		return 0;
	}
}

