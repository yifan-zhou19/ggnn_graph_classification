package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		final String c = "";
		int i;
		int j;
		int[] len = new int[2];
		int t = 0;
		int k;
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
		len[0] = a.length();
		len[1] = b.length();
			 if (len[0] == 1 && len[1] == 1)
			 {
				   if (a.charAt(0) == '0' && b.charAt(0) == '0')
				   {
			  System.out.print("0");
				   }
			 }
		for (i = len[0] - 1, j = len[1] - 1, k = 251;i >= 0 && j >= 0;i--, j--, k--)
		{
			if (a.charAt(i) - 48 + b.charAt(j) - 48 + t > 9 && a.charAt(i) - 48 + b.charAt(j) - 48 + t < 20)
			{
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i) - 48 + b.charAt(j) - 10 + t);
		t = 1;
			}
		else if (a.charAt(i) - 48 + b.charAt(j) - 48 + t >= 20)
		{
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i) - 48 + b.charAt(j) - 20 + t);
		t = 2;
		}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i) - 48 + b.charAt(j) + t);
		t = 0;
		}
		}
		if (j >= 0)
		{
		for (;j >= 0;k--,j--)
		{
			if (t + b.charAt(j) - 48 > 9)
			{
			c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(j) + t - 10);
		t = 1;
			}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, k, b.charAt(j) + t);
		t = 0;
		}
		}
		}
		else if (i >= 0)
		{
		for (;i >= 0;k--,i--)
		{
			if (t + a.charAt(i) - 48 > 9)
			{
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i) + t - 10);
		t = 1;
			}
		else
		{
			c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i) + t);
		t = 0;
		}
		}
		}
		if (t > 0)
		{
			c = tangible.StringFunctions.changeCharacter(c, k, t + 48);
		k--;
		}
		for (j = k + 1;j < 252;j++)
		{
			if (c.charAt(j) != 48)
			{
					   break;
			}
		}
			 for (i = j;i < 252;i++)
			 {
				  System.out.printf("%c",c.charAt(i));
			 }
	}

}

