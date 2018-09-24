package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] num = new int[500];
		int l;
		int t = 0;
		int i;
		int j;
		String s = new String(new char[500]);
		char[][] gram =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		l = s.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				gram[i][j] = s.charAt(i + j);
			}
		}

		for (i = 0;i < l - n + 1;i++)
		{
			if (strcmp(gram[i],"\0") == 0)
			{
				continue;
			}
			else
			{
				t = 0;
				for (j = 0;j < l - n + 1;j++)
				{
					if (strcmp(gram[i],gram[j]) == 0)
					{
					t++;
					if (i != j)
					{
						gram[j][0] = '\0';
					}
					}
				}
				num[i] = t;
			}
		}
		t = num[0];
		for (i = 0;i < l - n + 1;i++)
		{
			if (num[i] > t)
			{
				t = num[i];
			}
		}
		if (t <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",t);
			for (i = 0;i < l - n + 1;i++)
			{
				if (num[i] == t)
				{
					System.out.printf("%s\n",gram[i]);
				}
			}
		}
	}



}

