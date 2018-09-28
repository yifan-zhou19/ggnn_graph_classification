package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w = new String(new char[1000]);
		char[][] sub = new char[1000][50];
		int[] s = new int[1000];
		int k;
		int t;
		int n = 0;
		int m = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		w = new Scanner(System.in).nextLine();

		t = w.length();

		for (i = 0;i <= t - n;i++)
		{
			for (j = 0;j < n;j++)
			{
			sub[i][j] = w.charAt(i + j);
			}
		sub[i][n] = '\0';

		}
		for (i = 0;i <= t - n;i++)
		{
			for (j = i;j <= t - n;j++)
			{
				if (strcmp(sub[i],sub[j]) == 0)
				{
					s[i]++;
				}
			}

		}
		for (i = 0;i < t - n;i++)
		{
			if (s[i] > m)
			{
				m = s[i];
			}
		}
	if (m == 1)
	{
		System.out.print("NO\n");
	}
	else
	{
			System.out.printf("%d\n",m);
	for (i = 0;i <= t - n;i++)
	{

	if (s[i] == m)
	{
	System.out.printf("%s\n",sub[i]);
	}
	}
	}
	return 0;

	}



}

