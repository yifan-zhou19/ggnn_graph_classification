package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		int flag = 0;
		int max;
		int min;
		int s;
		int t;
		int p;
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;;i++)
		{
			for (j = 0;j + flag <= n;j++)
			{
				if (a.charAt(j + flag) == ' ')
				{
					flag = j + flag + 1;
					j = 0;
					break;
				}
				else if (a.charAt(j + flag) == ',')
				{
					flag = j + flag + 2;
					j = 0;
					break;
				}
				else
				{
					b.charAt(i)[j] = a.charAt(j + flag);
				}
			}
			if (j + flag == n + 1)
			{
				break;
			}
		}
		max = String.valueOf(b.charAt(0)).length(),s = 0;
		min = String.valueOf(b.charAt(0)).length(),t = 0;
		for (j = 1;j <= i;j++)
		{
			if (String.valueOf(b.charAt(j)).length() > max)
			{
				max = String.valueOf(b.charAt(j)).length();
				s = j;
			}
			if (String.valueOf(b.charAt(j)).length() < min)
			{
				min = String.valueOf(b.charAt(j)).length();
				t = j;
			}
		}

		System.out.printf("%s\n%s\n",b.charAt(s),b.charAt(t));

		return 0;
	}
}

