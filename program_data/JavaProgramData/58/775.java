package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char b;
		String a = new String(new char[100]);
		for (i = 0;i < n;i++)
		{
			l = 1;
			cin.get(b);
			cin.get(a,100,'\n');
		j = 0;
		int k = 0;
		while (a.charAt(j) != '\0')
		{
			j++;
			k++;
		}

		if ((a.charAt(0) == 95) || (a.charAt(0) > 64 && a.charAt(0) < 91) || (a.charAt(0)>96 && a.charAt(0) < 123))
		{
			for (m = 1;m < k;m++)
			{
				if (!((a.charAt(m) == 95) || (a.charAt(m) > 64 && a.charAt(m) < 91) || (a.charAt(m)>96 && a.charAt(m) < 123) || (a.charAt(m)>47 && a.charAt(m) < 58)))
				{
					System.out.print(0);
					System.out.print("\n");
				l = 0;
				break;
				}
			}
			if (l != 0)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		}
		return (0);
	}


}

