package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int s = 0;
		int[] num = new int[500];
		int k;
		int m;
		int sum;
		int l;
		final String a = "";
		final String b = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		sum = b.length();
		for (i = 0;i < 500;i++)
		{
			num[i] = 1;
		}
		for (i = 0;i <= sum - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a.charAt(i)[j] = b.charAt(i + j);
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0));
		for (i = 1;i <= sum - n;i++)
		{
			if (strcmp(a.charAt(0),a.charAt(i)) == 0)
			{
				for (j = 0;j < n;j++)
				{
					a.charAt(i)[j] = '\0';
				}
				num[s] = num[s] + 1;
			}
		}
		for (k = 1;k <= sum - n;k++)
		{
			if (a.charAt(k)[0] != '\0')
			{
				s = s + 1;
				c = tangible.StringFunctions.changeCharacter(c, s, a.charAt(k));
			}
			for (j = k + 1;j <= sum - n;j++)
			{
				if (a.charAt(j)[0] != '\0')
				{
					if (strcmp(a.charAt(j),a.charAt(k)) == 0)
					{
						for (l = 0;l < n;l++)
						{
							a.charAt(j)[l] = '\0';
						}
						num[s] = num[s] + 1;
					}
				}
			}
		}
		m = 0;
		for (i = 1;i <= s;i++)
		{
			if (num[i] > num[m])
			{
				m = i;
			}
		}
		if (num[m] == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",num[m]);
			for (i = 0;i <= s;i++)
			{
				if (num[i] == num[m])
				{
					for (j = 0;j < n;j++)
					{
						System.out.printf("%c",c.charAt(i)[j]);
					}
					System.out.print("\n");
				}
			}
		}
	}
}

