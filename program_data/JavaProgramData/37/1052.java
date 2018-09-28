package <missing>;

public class GlobalMembers
{
	public static char yici(String s)
	{
		int i;
		int j;
		int temp = 0;
		int time = 0;
		char a;
		for (i = 0;i < s.length();i++)
		{
			for (j = 0;j < s.length();j++)
			{
				if (s[i].equals(s[j]))
				{
					temp++;
				}
			}
			if (temp == 1)
			{
				a = s[i];
				time = 1;
				break;

			}


			else
			{
				temp = 0;
			}



		}
		if (time == 1)
		{
			return (a);
		}
		else
		{
			return ('0');
		}
	}
	public static void Main()
	{
		String s = new String(new char[100000]);
		int n;
		int i;
		int j;
		int temp = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			if (yici(s) == '0')
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",yici(s));
			}
		}

	}
}

