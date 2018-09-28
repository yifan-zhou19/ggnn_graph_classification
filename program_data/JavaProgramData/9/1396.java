package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] id = new char[100][10];
		String a = new String(new char[10]);
		int n;
		int i;
		int j;
		int[] age = new int[100];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
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

		for (j = n - 1;j > 0;j--)
		{
			for (i = n - 1;i > 0;i--)
			{
				if (age[i] >= 60 && age[i - 1] >= 60)
				{
					if (age[i] > age[i - 1])
					{
						a = id[i];
						b = age[i];
						id[i] = id[i - 1];
						age[i] = age[i - 1];
						id[i - 1] = a;
						age[i - 1] = b;
					}
				}
				if (age[i] >= 60 && age[i - 1] < 60)
				{
						a = id[i];
						b = age[i];
						id[i] = id[i - 1];
						age[i] = age[i - 1];
						id[i - 1] = a;
						age[i - 1] = b;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%s",id[i]);
			}
			else
			{
				System.out.printf("\n%s",id[i]);
			}
		}

		return 0;

	}
}

