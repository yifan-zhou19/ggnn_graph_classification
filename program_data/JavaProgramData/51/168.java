package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[501]);
		char[][] str2 = new char[500][6];
		int i;
		int a;
		int j;
		int t;
		int b;
		int[] k = new int[500];
		int temp;
		int max;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			for (j = 0;j < n;j++)
			{
				str2[i][j] = s.charAt(i + j);
			}
				str2[i][j] = '\0';
		}
		for (i = 0;i < l;i++)
		{
			k[i] = 1;
		}
		for (i = 0;i < l;i++)
		{
			for (j = i + 1;j < l;j++)
			{
				b = strcmp(str2[i],str2[j]);
				if (b == 0)
				{
					k[i] = k[i] + 1;
				}
			}
		}
		max = k[0];
		for (i = 0;i <= l;i++)
		{
			if (max < k[i])
			{
				max = k[i];
			}
		}
		t = 0;
		if (max <= 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= l;i++)
			{
				if (k[i] == max)
				{
					for (a = i;a >= 0;a--)
					{
						if (strcmp(str2[i],str2[j]) != 0)
						{
							temp = 1;
						}
						else
						{
							temp = 0;
						}
					}
					if (temp == 1)
					{
						System.out.printf("%s\n",str2[i]);
					}
				}
			}
		}
	}

}

