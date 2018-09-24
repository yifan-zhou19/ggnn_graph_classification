package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void match(char a[]);
		int signal = 1;
		int i;
		String s = new String(new char[101]);
		final String s1 = "";
		s = new Scanner(System.in).nextLine();
		while (signal != 0)
		{
			match(s);
			s1 = s;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			if (strcmp(s,s1) == 0)
			{
				signal = 0;
			}
		}

		return 0;
	}

	public static void match(String a)
	{
		int i;
		int j;
		int k;
		int len;
		int f1 = 0;
		int f2 = 0;
		int f3 = 1;
		len = a.length();
		if (len != 0)
		{
		System.out.printf("%s\n",a);
		}
		do
		{
		  if (len != 0)
		  {
			f1 = 0;
			f2 = 0;
			f3 = 1; //??????
			for (i = len - 1;i >= 0;i--)
			{
				if (a[i].equals('('))
				{
					f1 = 1; //????????
					for (j = i + 1;a[j] != null;j++)
					{
						if (a[j].equals(')'))
						{
							f2 = 1; //??????????
							a[j] = '0';
							a[i] = '0';
							break;
						}
					}
					if (f2 == 0) //???????,a[i]?????
					{
						a[i] = '1';
					}

				}
				if (f1 == 1)
				{
					break;
				}
			}
			if (f1 == 0) //???????
			{
				for (i = 0;a[i] != null;i++)
				{
					if (a[i].equals(')')) //??????????2
					{
						a[i] = '2';
					}
				}
			}
			for (i = 0;a[i] != null;i++)
			{
				if (a[i].equals('(') || a[i].equals(')'))
				{
					f3 = 0;
					break;
				}
			}
		  }
		}while (f3 == 0);
		for (i = 0;a[i] != null;i++)
		{
			if (a[i].equals('1'))
			{
				System.out.print("$");
			}
			else if (a[i].equals('2'))
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
}

