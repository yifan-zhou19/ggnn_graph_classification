package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String all = new String(new char[257]);
		String sub = new String(new char[257]);
		String re = new String(new char[257]);
		int i;
		int j;
		int k;
		int p;
		int q;
		int r;
		int s;

		all = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		re = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int flag;
		for (i = 0;all.charAt(i) != '\0';i++)
		{
			flag = 1;
			for (j = 0,k = i;sub.charAt(j) != '\0';k++,j++)
			{
				if (all.charAt(k) != sub.charAt(j))
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		if (flag == 1)
		{
			int c = re.length();

			for (p = k,q = c;all.charAt(p) != '\0';p++,q++)
			{
				re = tangible.StringFunctions.changeCharacter(re, q, all.charAt(p));
			}
			re = tangible.StringFunctions.changeCharacter(re, q, '\0');

			for (r = 0,s = i;re.charAt(r) != '\0';r++,s++)
			{
				all = tangible.StringFunctions.changeCharacter(all, s, re.charAt(r));
			}
			all = tangible.StringFunctions.changeCharacter(all, s, '\0');
		}
		System.out.print(all);
		System.out.print("\n");

		return 0;
	}


}

