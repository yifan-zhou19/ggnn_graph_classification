package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[10];
	//	int a;
	//	}
	//	all[100],old[100],temp;
		int n;
		int j = 0;
		int k;
		int i;
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
				all[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				all[i].a = tempVar3;
			}
			  if (all[i].a >= 60)
			  {
					   old[j] = all[i];
					j = j + 1;
			  }
		}
		for (i = j - 1;i > 0;i--)
		{
			for (k = 0;k < i;k++)
			{
				if (old[k].a < old[k + 1].a)
				{
					temp = old[k];
					old[k] = old[k + 1];
					old[k + 1] = temp;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (all[i].a < 60)
			{
				System.out.printf("%s\n",all[i].id);
			}
		}
	}
}

