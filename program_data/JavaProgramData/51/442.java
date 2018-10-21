package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		final String s = ""; //s1?????,s2???s1??????????
		final String s1 = "";
		final String s2 = "";
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		int l = s.length(); //i????????????i1?????????????j???s2???,j1?????s2???
		int i;
		int i1;
		int j;
		int j1;
		int k = 0;
		int[] a = new int[500];
		int[] num = new int[500];
		int max = 0;
		for (i = 0;i <= l - n;i++)
		{
			if (a[i] == 0)
			{
				for (i1 = i;i1 <= n + i - 1;i1++)
				{
					s1 = tangible.StringFunctions.changeCharacter(s1, k++, s.charAt(i1));
				}
				k = 0;
				for (j = i + 1;j <= l - n;j++)
				{
					for (j1 = j;j1 <= n + j - 1;j1++)
					{
						s2 = tangible.StringFunctions.changeCharacter(s2, k++, s.charAt(j1));
					}
					k = 0;
					if (strcmp(s1,s2) == 0)
					{
						a[j] = 1;
						num[i] += 1;
					}
				}
			}
		}
		for (i = 0;i <= 499;i++)
		{
			if ((num[i] + 1) > max)
			{
				max = num[i] + 1;
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= 499;i++)
			{
				if ((num[i] + 1) == max)
				{
					for (j = i;j <= i + n - 1;j++)
					{
						System.out.printf("%c",s.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

