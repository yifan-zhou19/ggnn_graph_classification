package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		String c = new String(new char[252]);
		int i;
		int j;
		int k;
		int tmp = 0;
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
		k = -1;
		for (i = a.length() - 1, j = b.length() - 1; i + 1 && j + 1; i--, j--)
		{
			k++;
			c = tangible.StringFunctions.changeCharacter(c, k, tmp + a.charAt(i) - '0' + b.charAt(j) - '0');
			tmp = c.charAt(k) / 10;
			c.charAt(k) %= 10;
		}
		if (i >= 0)
		{
			 while (i >= 0)
			 {
				 k++;
				 c = tangible.StringFunctions.changeCharacter(c, k, tmp + a.charAt(i) - '0');
				 tmp = c.charAt(k) / 10;
				 c.charAt(k) %= 10;
				 i--;
			 }
		}
		 else if (j >= 0)
		 {
			 while (j >= 0)
			 {
				 k++;
				 c = tangible.StringFunctions.changeCharacter(c, k, tmp + b.charAt(j) - '0');
				 tmp = c.charAt(k) / 10;
				 c.charAt(k) %= 10;
				 j--;
			 }
		 }
		 if (tmp != 0)
		 {
			 c = tangible.StringFunctions.changeCharacter(c, ++k, tmp);
		 }
		 while (k >= 0 && c.charAt(k) == 0)
		 {
			 k--;
		 }
		 for (i = k; i >= 0; i--)
		 {
			 System.out.printf("%d", c.charAt(i));
		 }
		 if (k < 0)
		 {
			 System.out.print("0");
		 }
		 return 0;
	}
}

