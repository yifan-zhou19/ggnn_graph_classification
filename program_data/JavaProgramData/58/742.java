package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		int n;
		int o = 1;
		int count = 0;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (j = 0;j < n;j++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				o = 0;
			}
			else
			{
				for (i = 0;i < l;i++)
				{
					if ((a.charAt(i) >= '0' && a.charAt(i) <= '9' || a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) == '_'))
					{
						count++;
					}
				}
			}
			if (count == l)
			{
				o = 1;
			}
			else
			{
				o = 0;
			}
			System.out.printf("%d\n",o);
			count = 0;
			for (i = 0;i < 100;i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
			}
		}


		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

