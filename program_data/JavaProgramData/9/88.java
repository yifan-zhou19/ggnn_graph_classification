package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] age = new int[100];
		int i;
		int j;
		char[][] id = new char[100][11];
		String str = new String(new char[11]);
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
		}
		for (i = 110;i >= 60;i--)
		{
			for (j = 0;j < n;j++)
			{
				if (age[j] == i)
				{
					System.out.printf("%s\n",id[j]);
					age[j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] != 0)
			{
				System.out.printf("%s\n",id[i]);
			}
		}
		return 0;
	}

}

