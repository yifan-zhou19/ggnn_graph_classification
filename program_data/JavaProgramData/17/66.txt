package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int k;
		int p;
		int d;
		int x;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		while (gets(a))
		{
			System.out.println(a);
			for (j = 0;a.charAt(j) != '\0';j++)
			{

				if (a.charAt(j) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
				else
				{
					if (a.charAt(j) == ')')
					{
					   b = tangible.StringFunctions.changeCharacter(b, j, '?');
					}
					else
					{
					   b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					}
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			for (k = 0;a.charAt(k) != '\0';k++)
			{
				if (b.charAt(k) == '?')
				{
					   d = 0;
					   for (p = k - 1;p >= 0;p--)
					   {
							if (b.charAt(p) == '$')
							{
								x = p;
								d = 1;
								break;
							}
					   }
					   if (d == 1)
					   {
							b = tangible.StringFunctions.changeCharacter(b, k, ' ');
							b = tangible.StringFunctions.changeCharacter(b, x, ' ');
					   }
				}
			}
		   for (k = j;k >= 0;k--)
		   {
			   if (b.charAt(k) != ' ' && b.charAt(k) != '\0')
			   {
				   break;
			   }
		   }
		   for (p = 0;p < j;p++)
		   {
			   if (b.charAt(p) != ' ')
			   {
				   break;
			   }
		   }
		   for (x = p;x <= k;x++)
		   {
			   System.out.printf("%c",b.charAt(x));
		   }
		   System.out.print("\n");
		}
		return 0;
	}

}

