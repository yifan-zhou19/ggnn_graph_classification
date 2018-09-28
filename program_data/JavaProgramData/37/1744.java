package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int flag;
		int len;
		String a = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		//getchar()();
		while (t-- != 0)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			for (i = 0;i < len;i++)
			{
				flag = 1;
				if (a.charAt(i) == '@')
				{
					continue;
				}
				for (j = i + 1;j < len;j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '@');
						flag = 0;
					}
				}
				if (flag == 1)
				{
					System.out.print(a.charAt(i));
					break;
				}
			}
			if (i == len)
			{
				System.out.print("no");
			}
			System.out.print(10);
		}

	}

}

