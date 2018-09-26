package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String art = new String(new char[8000]);
		art = new Scanner(System.in).nextLine();
		int len;
		len = art.length();
		int i;
		int j = 0;
		int k = 0;
		char[][] wor = new char[200][40];
		for (i = 0;i < len;i++)
		{
			if (art.charAt(i) != ' ')
			{
				wor[j][k] = art.charAt(i);
				k++;
			}
			else
			{
				wor[j][k] = '\0';
				k = 0;
				j++;
			}
		}
		wor[j][k] = '\0';
		int sum = 0;
		int a;
		int be = 0;
		int ed;
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(wor[i]).length();
			sum += a + 1;
			if (sum <= 81)
			{
				ed = i;
			}
			else
			{
				for (j = be;j < ed;j++)
				{
					System.out.printf("%s ",wor[j]);
				}
				System.out.printf("%s\n",wor[ed]);
				be = i;
				sum = a + 1;
			}
		}
		for (i = be;i < n - 1;i++)
		{
			System.out.printf("%s ",wor[i]);
		}
		System.out.printf("%s",wor[n - 1]);
		return 0;
	}

}

