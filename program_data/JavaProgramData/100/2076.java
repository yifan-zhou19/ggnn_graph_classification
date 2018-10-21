package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		for (i = 'A';i <= 'A'+'Z'-'A';i++)
		{
			k = 0;
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == i)
				{
					k++;
				}

			}
			if (k != 0)
			{
					System.out.printf("%c=%d\n",i,k);
			}
		}
		for (i = 'a';i <= 'a'+'z'-'a';i++)
		{
			k = 0;
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == i)
				{
					k++;
				}

			}
				if (k != 0)
				{
					System.out.printf("%c=%d\n",i,k);
				}
		}
		l = 0;
		for (i = 'A';i <= 'A'+'Z'-'A';i++)
		{
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == i)
				{
					l++;
				}

			}
		}
		for (i = 'a';i <= 'a'+'z'-'a';i++)
		{
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == i)
				{
					l++;
				}

			}

		}
		if (l == 0)
		{
			System.out.print("No\n");
		}


		return 0;
	}



}
