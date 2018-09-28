package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int max = 1;
		int cnt;
		int num;
		int sofar = 1;
		char tmp;
		String c = new String(new char[501]);
		String gram = new String(new char[5]);
		char[][] maxc = new char[250][5];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		gram = tangible.StringFunctions.changeCharacter(gram, n, '\0');
		tmp = System.in.read();
		c = new Scanner(System.in).nextLine();
		len = c.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				gram = tangible.StringFunctions.changeCharacter(gram, j, c.charAt(i + j));
			}
			cnt = 1;
			for (j = i + 1;j <= len - n;j++)
			{
				if (c.charAt(j) == gram.charAt(0))
				{
					num = 0;
					for (k = 1;k < n;k++)
					{
						if (c.charAt(j + k) != gram.charAt(k))
						{
							num++;
							break;
						}
					}
					if (num == 0)
					{
						cnt++;
					}
				}
			}
			if (cnt > max)
			{
				max = cnt;
				maxc[0] = gram;
				sofar = 1;
			}
			else if (cnt == max)
			{
				sofar++;
				maxc[sofar - 1] = gram;
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (j = 0;j < sofar;j++)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%c",maxc[j][k]);
				}
				System.out.print("\n");
			}
		}


		return 0;
	}
}

