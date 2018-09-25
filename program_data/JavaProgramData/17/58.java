package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sen = new String(new char[100]);
	int z;
	int y;
	int i;
	int j;
	int l;
	int t;
	int m;
	while (gets(sen))
	{
		z = 0;
		y = 0;
		l = sen.length();
		System.out.printf("%s\n",sen);

		for (i = 0;i < l;i++)
		{
		   if (sen.charAt(i) == '(')
		   {
			   z++;
		   }
		   if (sen.charAt(i) == ')')
		   {
			   y++;
		   }
		}
		   if (z > y)
		   {
			   m = y;
		   }
		   else
		   {
			   m = z;
		   }

		for (i = 0;i < m;i++)
		{
			j = 1;
			for (t = 0;t < l;t++)
			{
			  if (sen.charAt(t) == '(')
			  {
				 j = 0;
				 z = t;
			  }
			 if (sen.charAt(t) == ')')
			 {
			   if (j == 0)
			   {
				   sen = tangible.StringFunctions.changeCharacter(sen, z, '0');
				   sen = tangible.StringFunctions.changeCharacter(sen, t, '0');
			   }
			   j = 1;
			 }
			}
		}
		for (i = 0;i < l;i++)
		{
			if (sen.charAt(i) == '(')
			{
				System.out.print("$");
			}
			else if (sen.charAt(i) == ')')
			{
				System.out.print("?");
			}
			else if ((sen.charAt(i) != '(') && (sen.charAt(i) != ')'))
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");
	}
	return 0;
	}

}

