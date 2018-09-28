package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] id = new char[100][10];
		int[] o = new int[100];
		int n;
		int i;
		int j;
		int[] s = new int[100];
		int b = 0;
		int t;
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
				o[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (o[i] >= 60)
			{
				s[b] = o[i];
				b++;
			}
		}
		for (i = 0;i < b;i++)
		{
			for (j = b - 1;j > i;j--)
			{
				if (s[j] > s[j - 1])
				{
					t = s[j];
					s[j] = s[j - 1];
					s[j - 1] = t;
				}
			}
		}
		for (i = 0;i < b - 1;i++)
		{
			if (s[i] == s[i + 1])
			{
				s[i] = -1;
			}
		}
		for (i = 0;i < b;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (o[j] == s[i])
				{
					System.out.printf("%s\n",id[j]);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (o[i] < 60)
			{
				System.out.printf("%s\n",id[i]);
			}
		}
		return 0;
	}

}

