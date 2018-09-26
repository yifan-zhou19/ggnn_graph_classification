package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int flag = 0;
		final String a = "";
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		n = Integer.parseInt(s);
		for (i = 0;i < n;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, new Scanner(System.in).nextLine());
		}
		t = new Scanner(System.in).nextLine();
		m = Integer.parseInt(t);
	//	printf("%d %d\n",n,m);
		for (;m > 1;m--)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i)[j] == '@')
					{
						if (i != 0 && a.charAt(i - 1)[j] == '.')
						{
							a.charAt(i - 1)[j] = '$';
						}
						if (j != 0 && a.charAt(i)[j - 1] == '.')
						{
							a.charAt(i)[j - 1] = '$';
						}
						if (j != (n - 1) && a.charAt(i)[j + 1] == '.')
						{
							a.charAt(i)[j + 1] = '$';
						}
						if (i != (n - 1) && a.charAt(i + 1)[j] == '.')
						{
							a.charAt(i + 1)[j] = '$';
						}

					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i)[j] == '$')
					{
						a.charAt(i)[j] = '@';
					}
				}
			}


		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a.charAt(i)[j] == '@')
				{
					flag++;
				}
			}
		}
		System.out.printf("%d",flag);
	}


}

