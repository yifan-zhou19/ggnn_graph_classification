package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		int p = s.length();
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int q = a.length();
		int l = b.length();
		int i;
		int j;
		int k = 0;
		int t;
		if (a.charAt(0) == s.charAt(0))
		{
			for (i = 1;i < q;i++)
			{
				if (a.charAt(i) != s.charAt(i))
				{
					k = 1;
					break;
				}
			}
			if (k == 0)
			{
			   if (q > l)
			   {
				  for (i = 0;i < l;i++)
				  {
					  s = tangible.StringFunctions.changeCharacter(s, i, b.charAt(i));
				  }
				  for (i = l;i < p - l;i++)
				  {
					  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + q - 1));
				  }
			   }
			   if (q < l)
			   {
				  for (i = p + l - q;i > 0;i--)
				  {
					  s = tangible.StringFunctions.changeCharacter(s, i + l - q, s.charAt(i));
				  }
				  for (i = 0;i < l;i++)
				  {
					  s = tangible.StringFunctions.changeCharacter(s, i, b.charAt(i));
				  }
			   }
			}
		}
		for (i = 0;i < p - 1;i++)
		{
			if (s.charAt(i) == ' ')
			{
				if (s.charAt(i + 1) == a.charAt(0))
				{
					for (j = i + 1,t = 0;j < i + 1 + q;j++,t++)
					{
					   if (a.charAt(t) != s.charAt(j))
					   {
						  k = 1;
						  break;
					   }
					}
					if (k == 0)
					{
					   if (q > l)
					   {
						  for (j = i + 1,t = 0;j < i + 1 + l;j++,t++)
						  {
							  s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(t));
						  }
						  for (j = i + 1 + l;j < p - l;j++)
						  {
							  s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + q - 1));
						  }
					   }
					   if (q < l)
					   {
						  for (j = p + l - q;j > i + 1;j--)
						  {
							  s = tangible.StringFunctions.changeCharacter(s, j + l - q, s.charAt(j));
						  }
						  for (j = i + 1,t = 0;j < i + 1 + l;j++,t++)
						  {
							  s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(t));
						  }
					   }
					}
				}
			}
		}
		System.out.printf("%s\n",s);
	}

}

