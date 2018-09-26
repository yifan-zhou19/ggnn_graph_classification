package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pa
	//	{
	//		char id[20];
	//		int old;
	//	}
	//	pai[101],ol[101],you[101];

		int n;
		int i;
		int j;
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
				pai[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pai[i].old = tempVar3;
			}
		}
		l = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (pai[i].old >= 60)
			{
				ol[l] = pai[i];
				l++;
			}
			if (pai[i].old < 60)
			{
				you[k] = pai[i];
				k++;
			}
		}


		for (i = 0;i < l;i++)
		{
		for (j = 0;j < l - i;j++)
		{
			if (ol[j].old < ol[j + 1].old)
			{
				ol[100] = ol[j];
				ol[j] = ol[j + 1];
				ol[j + 1] = ol[100];
			}

		}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%s\n",ol[i].id);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%s\n",you[i].id);
		}
		System.out.printf("%s",you[k - 1].id);
	}
}

