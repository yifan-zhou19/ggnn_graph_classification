package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		char[][] danCi = new char[N][LEN];

		int n;
		int i;
		int len;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				danCi[i] = tempVar2.charAt(0);
			}
		}

		for (i = 0; i < n; i++)
		{
			len = String.valueOf(danCi[i]).length();

			if ((danCi[i][len - 1] == 'r') || (danCi[i][len - 1] == 'y'))
			{
				danCi[i][len - 2] = 0;
			}
			else
			{
				danCi[i][len - 3] = 0;
			}

		}

		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", danCi[i]);
		}

		return 0;
	}
}

