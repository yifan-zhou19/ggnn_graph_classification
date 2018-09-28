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
		int q1;
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q1 = Integer.parseInt(tempVar);
		}

		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;;i++)
		{
			for (j = 0;j + flag <= n;j++)
			{
				if (*(a.Substring(j) + flag) == ' ')
				{
					flag = j + flag + 1;
					j = 0;
					break;
				}
				else if (*(a.Substring(j) + flag) == ',')
				{
					flag = j + flag + 2;
					j = 0;
					break;
				}
				else
				{
					*(*(b.Substring(i)) + j) = *(a.Substring(j) + flag);
				}
			}
			if (j + flag == n + 1)
			{
				break;
			}
		}
		max = String.valueOf(*(b.Substring(0))).length(),s = 0;
		min = String.valueOf(*(b.Substring(0))).length(),t = 0;
		for (j = 1;j <= i;j++)
		{
			if (String.valueOf(*(b.Substring(j))).length() > max)
			{
				max = String.valueOf(*(b.Substring(j))).length();
				s = j;
			}
			if (String.valueOf(*(b.Substring(j))).length() < min)
			{
				min = String.valueOf(*(b.Substring(j))).length();
				t = j;
			}
		}

		System.out.printf("%s\n%s\n",*(b.Substring(s)),*(b.Substring(t)));



	//	for (j=0;j<=i;j++)
	//		printf("%s\n",b[j]);

		return 0;
	}



}

