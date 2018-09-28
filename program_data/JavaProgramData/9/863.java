package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] age = new int[100];
		int e;
		char[][] id = new char[100][10];
		String ex = new String(new char[10]);
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				age[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if ((age[j] < age[j + 1] && age[j] >= 60) || (age[j] < age[j + 1] && age[j + 1] >= 60))
				{
					e = age[j];
					age[j] = age[j + 1];
					age[j + 1] = e;
					ex = id[j];
					id[j] = id[j + 1];
					id[j + 1] = ex;

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

