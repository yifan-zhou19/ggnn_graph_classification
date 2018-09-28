package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		final String a = "";
		int i;
		int j;
		int n;
		int[] m = new int[500];
		int mm = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		for (i = 0;i <= word.length() - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a.charAt(i)[j] = word.charAt(i + j);
			}
		}
		for (i = 0;i <= word.length() - n;i++)
		{
			for (j = i;j <= word.length() - n;j++)
			{
				if (strcmp(a.charAt(i),a.charAt(j)) == 0)
				{
					m[i]++;
				}
			}
		}
		for (i = 0;i <= word.length() - n;i++)
		{
			if (mm < m[i])
			{
				mm = m[i];
			}
		}
		if (mm != 1)
		{
			System.out.printf("%d\n",mm);
		for (i = 0;i <= word.length() - n;i++)
		{
			if (m[i] == mm)
			{
				for (j = 0;j < n;j++)
				{
					System.out.printf("%c",a.charAt(i)[j]);
				}
				System.out.print("\n");
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

