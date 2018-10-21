package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[501]);
		String t = new String(new char[501]);
		int i;
		int j;
		int l;
		int c;
		int d;
		int temp = 0;
		int m;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 1;i <= l;i++)
		{
			for (j = 0;j < l - i;j++)
			{
				d = j + i;
				c = j;
				while (c < d)
				{
					  if (s.charAt(c) == s.charAt(d))
					  {
									c++;
									d--;
					  }
					  else
					  {
						   temp = 1;
						   break;
					  }

				}
				if (temp == 0)
				{
					  for (m = j;m <= j + i;m++)
					  {
							t = tangible.StringFunctions.changeCharacter(t, n, s.charAt(m));
							t = tangible.StringFunctions.changeCharacter(t, n + 1, '\0');
							n++;
					  }
						System.out.printf("%s\n",t);
						n = 0;
				}
				 temp = 0;
			}
		}
			return 0;
	}
}

