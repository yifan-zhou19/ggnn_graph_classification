package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] age = new int[100];
		char[][] id = new char[100][10];
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
				(age[i]) = Integer.parseInt(tempVar3);
			}
		}
		int e;
		String e_id = new String(new char[10]);
		for (int k = 1;k <= n;k++)
		{
			for (int m = 0;m < n - k;m++)
			{
				if ((age[m] >= 60 && age[m + 1] >= 60 && age[m] < age[m + 1]) || (age[m] < 60 && age[m + 1] >= 60))
				{
					e = age[m + 1];
					e_id = id[m + 1];
					age[m + 1] = age[m];
					id[m + 1] = id[m];
					age[m] = e;
					id[m] = e_id;
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

