package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String q = new String(new char[1000]);
		char[][] t = new char[1000][10];
		int n;
		int i;
		int j;
		int l;
		int[] s = new int[1000];
		int[] f = new int[1000];
		int m;
		int F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = new Scanner(System.in).nextLine();
		q = new Scanner(System.in).nextLine();
		l = q.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
			t[i][j] = q.charAt(i + j);
			}
		}
		for (i = 0;i <= l - n - 1;i++)
		{
			if (t[i][0] != '\0')
			{
			s[i] = 1;
			for (j = i + 1;j <= l - n;j++)
			{
			if (strcmp(t[i],t[j]) == 0 && t[j][0] != '\0')
			{
			s[i]++;
			t[j][0] = '\0';
			}
			}
			}
			else
			{
			s[i] = 0;
			}
		}
		if (t[l - n][0] != '\0')
		{
		s[l - n] = 1;
		}
		else
		{
		s[l - n] = 0;
		}
		m = s[0];
		F = 0;
		f[0] = 0;
		for (i = 1;i <= l - n - 1;i++)
		{
			if (m < s[i])
			{
			F = 0;
			m = s[i];
			f[F] = i;
			}
			else if (m == s[i])
			{
				F++;
				f[F] = i;
			}
		}
		if (s[f[F]] <= 1)
		{
		System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",m);
		for (i = 0;i <= F;i++)
		{
		System.out.printf("%s\n",t[f[i]]);
		}
		}
		return 0;
	}

}

