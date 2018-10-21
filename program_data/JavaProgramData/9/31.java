package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[MAX + 10];
		int[] num = new int[MAX + 10];
		char[][] id = {0};
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
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
			num[i] = i;
		}
		int flag;
		int tempnum;
		int tempage;
		int j;
		String tempid = new String(new char[ID_DIGITS + 1]);
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				flag = 0;
				if (age[j] >= 60 && age[j - 1] < 60)
				{
					flag = 1;
				}
				else if (age[j] >= 60 && age[j - 1] >= 60)
				{
					if (age[j] > age[j - 1])
					{
						flag = 1;
					}
					else if (age[j] == age[j - 1])
					{
						if (num[j] < num[j - 1])
						{
							flag = 1;
						}
					}
				}
				else if (age[j] < 60 && age[j - 1] < 60)
				{
					if (num[j] < num[j - 1])
					{
						flag = 1;
					}
				}
				if (flag != 0)
				{
					tempnum = num[j];
					num[j] = num[j - 1];
					num[j - 1] = tempnum;
					tempage = age[j];
					age[j] = age[j - 1];
					age[j - 1] = tempage;
					tempid = id[j];
					id[j] = id[j - 1];
					id[j - 1] = tempid;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",id[i]);
		}
		return 0;
	}
}

