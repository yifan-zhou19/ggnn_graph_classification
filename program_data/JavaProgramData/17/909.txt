package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[120]);
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
		String res = new String(new char[120]); //result
		int lens;
		int leftnum = 0; //remaining leftnum
		int[] left = new int[120];
		lens = s.length();
		for (int i = 0;i < lens;i++)
		{
			res = tangible.StringFunctions.changeCharacter(res, i, ' ');
		}
		for (int i = 1;i < 120;i++)
		{
		  left[i] = -1;
		}
		for (int i = 0;i < lens;i++)
		{
			if (s.charAt(i) == '(')
			{
				left[++leftnum] = i;
			}
			if (s.charAt(i) == ')')
			{
				if (leftnum == 0)
				{
				  res = tangible.StringFunctions.changeCharacter(res, i, '?');
				}
				else
				{
				  left[leftnum] = -1;
				  leftnum--;
				}
			}
		}
		for (int i = 1;i <= leftnum;i++)
		{
			res = tangible.StringFunctions.changeCharacter(res, left[i], '$');
		}
		for (int i = 0;i < lens;i++)
		{
			System.out.print(s.charAt(i));
		}
		System.out.print("\n");
		for (int i = 0;i < lens;i++)
		{
			System.out.print(res.charAt(i));
		}
		System.out.print("\n");
		}

		return 0;
	}

}

