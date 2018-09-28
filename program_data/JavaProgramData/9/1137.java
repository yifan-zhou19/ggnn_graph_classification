package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] id = new char[100][10];
		char[][] id1 = new char[100][10];
		String t = new String(new char[10]);
		int n;
		int i;
		int j;
		int b;
		int[] age = new int[100];
		int[] age1 = new int[100];
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
			id1[i] = id[i];
			age1[i] = age[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (age1[j] < age1[j + 1])
				{
					b = age1[j];
					age1[j] = age1[j + 1];
					age1[j + 1] = b;
					t = id1[j];
					id1[j] = id1[j + 1];
					id1[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age1[i] >= 60)
			{
				System.out.printf("%s\n",id1[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
				System.out.printf("%s\n",id[i]);
			}
		}
		return 0;
	}
}

