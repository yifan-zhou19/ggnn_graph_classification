package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		char c;
		int n;
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int len;
		int num2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			for (j = 0;j < len;j++)
			{
				for (k = 0;k < len;k++)
				{
					if (s.charAt(j) == s.charAt(k))
					{
						a[j]++;
					}
				}
				if (a[j] == 1)
				{
				c = s.charAt(j);
				System.out.printf("%c\n",c);
				for (j = 0;j < len;j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				}
				continue;
				}
			}
			num2 = 0;
			for (k = 0;k < len;k++)
			{
				if (a[k] != 1)
				{
					num2++;
				}
			}
				if (num2 == len)
				{
					System.out.print("no\n");
				}
			for (j = 0;j < len;j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j, '\0');
				a[j] = 0;
			}

		}
	}

}

