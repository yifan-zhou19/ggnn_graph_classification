package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ys = new String(new char[1000]);
		String re = new String(new char[1000]);
		String bt = new String(new char[1000]);
		int m;
		int n;
		int i;
		int j;
		int k;
		int ss = 0;
		int se = 0;
		ys = new Scanner(System.in).nextLine();
		bt = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		for (i = 0;ys.charAt(i) != 0;i++)
		{
			if (ys.charAt(i) == bt.charAt(0))
			{
				for (k = i + 1, j = 1;ys.charAt(k) != 0 && bt.charAt(j) != 0;k++, j++)
				{
					if (ys.charAt(k) != bt.charAt(j))
					{
			break;
					}
				}
				if (bt.charAt(j) == 0)
				{
			ss = i;
			se = k;
			break;
				}
			}
		}
		if (ss < se)
		{
			if (bt.length() <= re.length())
			{
				for (i = ss,j = 0;re.charAt(j) != 0;i++,j++)
				{
					ys = tangible.StringFunctions.changeCharacter(ys, i, re.charAt(j));
				}
			   for (k = se;ys.charAt(k) != 0;k++,i++)
			   {
					ys = tangible.StringFunctions.changeCharacter(ys, i, ys.charAt(k));
			   }
				ys = ys.substring(0, i);
			}
			else
			{
				i = ys.length() + re.length() - bt.length();
				for (k = ys.length();k >= se;k--,i--)
				{
					ys = tangible.StringFunctions.changeCharacter(ys, i, ys.charAt(k));
				}
			   for (i = ss,j = 0;re.charAt(j) != 0;i++,j++)
			   {
					ys = tangible.StringFunctions.changeCharacter(ys, i, re.charAt(j));
			   }
			}
		}
		System.out.print(ys);
		return 0;
	}

}

