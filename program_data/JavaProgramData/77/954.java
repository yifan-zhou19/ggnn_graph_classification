package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		char c;
		char d;
		int i;
		int j;
		int flag;
		int flag1;
		a = new Scanner(System.in).nextLine();
		c = a.charAt(0);
		d = a.charAt(a.length() - 1);
		do
		{
			  flag = 0;
			  flag1 = 0;
				 for (i = 0;i < (a.length() - 1);i++)
				 {
					 if (a.charAt(i) != 1)
					 {
						flag = 1;
						break;
					 }
				 }
				for (i = 0;i < (a.length() - 1);i++)
				{
					if (a.charAt(i) != c)
					{
						continue;
					}
					  for (j = i + 1;a.charAt(j) != c && j < (a.length());j++)
					  {
						  if (a.charAt(j) == d)
						  {
							System.out.printf("%d %d\n",i,j);
						   a = tangible.StringFunctions.changeCharacter(a, j, 1);
						   a = tangible.StringFunctions.changeCharacter(a, i, 1);
						   flag1 = 1;
						  }
						  if (flag1 != 0)
						  {
							  break;
						  }
					  }
						if (flag1 != 0)
						{
							break;
						}
				}
		} while (flag != 0);
			return 0;
	}

}

