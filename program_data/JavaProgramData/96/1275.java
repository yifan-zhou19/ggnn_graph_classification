package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);

		String c = new String(new char[103]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int len;
		int mod;

		k = 0;
		for (j = 0;j < 103;j++)
		{
			c = tangible.StringFunctions.changeCharacter(c, j, '0');
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		if (len == 1)
		{
			System.out.printf("0\n%d",(a.charAt(0) - 48) % 10);
		}
		else if (len == 2 && (a.charAt(0) == 49) && (a.charAt(1) - 48) <= 2)
		{
			System.out.printf("0\n%d",(a.charAt(1) - 38));
		}
		else
		{
			mod = a.charAt(0) - 48;
			 for (i = 1;i < len;i++)
			 {
			c = tangible.StringFunctions.changeCharacter(c, k, (10 * (mod) + a.charAt(i) - 48) / 13 + '0');
			 mod = (10 * (mod) + a.charAt(i) - 48) % 13;
			 k++;
			 }



			 if (c.charAt(0) != 48)
			 {
				 for (l = 0;l < k;l++)
				 {
				 System.out.printf("%c",c.charAt(l));
				 }
			 System.out.printf("\n%d",mod);
			 }
			 if (c.charAt(0) == 48)
			 {
				 for (l = 1;l < k;l++)
				 {
				 System.out.printf("%c",c.charAt(l));
				 }
			 System.out.printf("\n%d",mod);
			 }

		}




	}

}

