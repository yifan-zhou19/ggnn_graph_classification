package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		char[][] b = new char[600][10];
		String s = new String(new char[10]);
		int[] c = new int[600];
		int n;
		int l;
		int i;
		int j;
		int k;
		int m;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length();
		k = 0;
		for (j = 0;j < n;j++)
		{
				b[0][j] = a.charAt(j);
		}
		b[0][n] = '\0';
		for (i = 1;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, a.charAt(i + j));
			}
			s = tangible.StringFunctions.changeCharacter(s, n, '\0');
			for (m = 0;m <= k;m++)
			{
				if (strcmp(s,b[m]) == 0)
				{
					c[m]++;
					break;
				}
			}
			if (m == k + 1)
			{
				k++;
				b[k] = s;
			}

		}
		max = 0;
		for (i = 0;i <= k;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max + 1);
			for (i = 0;i <= k;i++)
			{
				if (c[i] == max)
				{
					System.out.println(b[i]);
				}
			}
		}
		return 0;
	}



}

