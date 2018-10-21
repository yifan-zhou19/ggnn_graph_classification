package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int k;
		int j;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[251]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() < b.length())
		{
			t = b.length();
			 k = b.length() - a.length();
			 for (i = t - 1;i >= 0;i--)
			 {
			 if (i > k - 1)
			 {
				 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - k));
			 }
			 else
			 {
				 a = tangible.StringFunctions.changeCharacter(a, i, '0');
			 }
			 }
		}


		else
		{
			t = a.length();
			 k = a.length() - b.length();
			 for (i = t - 1;i >= 0;i--)
			 {
			 if (i > k - 1)
			 {
				 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - k));
			 }
			 else
			 {
				 b = tangible.StringFunctions.changeCharacter(b, i, '0');
			 }
			 }
		}





		for (i = t - 1;i > 0;i--)
		{
			 c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - '0');
			 if ((c.charAt(i) >= '0') && (c.charAt(i) <= '9'))
			 {
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i));
			 }
			else
			{
		   c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
			a.charAt(i - 1)++;
			}
		}
		  c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0) + b.charAt(0) - '0');
		   if (c.charAt(0) > '9')
		   {
		   c = tangible.StringFunctions.changeCharacter(c, 0, c.charAt(0) - 10);
		   System.out.print("1");
		   System.out.printf("%s\n",c);
		   }
		   else
		   {
			k = 0;
			for (i = 0;i < t;i++)
			{
			if (c.charAt(i) != '0')
			{
			for (j = i;j < t;j++)
			{
			System.out.printf("%c",c.charAt(j));
			}
			k = 1;
			}
		   if (k == 1)
		   {
		   break;
		   }
			}
			k = 0;
			for (i = 0;i < t;i++)
			{
				if (c.charAt(i) != '0')
				{
			k = k + 1;
				}
			}
			if (k == 0)
			{
			System.out.print("0");
			}

			  return 0;
		   }
	}
}

