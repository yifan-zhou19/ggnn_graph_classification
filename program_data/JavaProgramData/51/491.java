package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] o = new int[500];
		int ji;
		int max = 0;
		String a = new String(new char[502]);
		String b = new String(new char[6]);
		String cmp = new String(new char[6]);
		char[][] c = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = tangible.StringFunctions.changeCharacter(b, n, '\0');
		cmp = tangible.StringFunctions.changeCharacter(cmp, n, '\0');
		System.in.read();
		a = new Scanner(System.in).nextLine();
		int len;
		len = a.length();
		ji = 0;
		for (i = 0;i < len - n + 1;i++)
		{
			o[ji] = 0;
			for (j = 0;j < n;j++)
			{
				c[ji][j] = a.charAt(i + j);
			}
			c[ji][n] = '\0';
			for (j = 0;j < len - n + 1;j++)
			{
				int k;
				for (k = 0;k < n;k++)
				{
					cmp = tangible.StringFunctions.changeCharacter(cmp, k, a.charAt(j + k));
				}
				if (strcmp(cmp,c[ji]))
				{
				}
				else
				{
					o[ji]++;
				}
			}
			if (o[ji] > max)
			{
				max = o[ji];
			}
			for (j = 0;j < ji;j++)
			{
				if (strcmp(c[j],c[ji]))
				{
				}
				else
				{
					ji--;
					break;
				}
			}
			ji++;
		}
		j = 0;
		if (max != 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < ji;i++)
			{
				if (o[i] == max)
				{
					System.out.println(c[i]);
				}
			}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

