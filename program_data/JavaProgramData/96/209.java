package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		int i;
		int j;
		int sum;
		int mod;
		int k;
		if (n == 1)
		{
		  mod = a.charAt(0) - '0';
		 System.out.print("0\n");
		 System.out.printf("%d\n",mod);
		}
		else
		{
		sum = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
		mod = 0;
		k = 0;
		j = 0;
		if (n == 2 & sum <= 12)
		{
		  System.out.print("0\n");
		 System.out.printf("%d\n",sum);
		}
		 else
		 {
			  for (i = 2;i <= n;i++)
			  {
							  k = mod * 10 + sum;
							   mod = k % 13;
							   j = k / 13;
								b = tangible.StringFunctions.changeCharacter(b, i, j + '0');
								if (i == n)
								{
								break;
								}
							   sum = a.charAt(i) - '0';
			  }
			  if (b.charAt(2) == '0')
			  {
				  for (j = 0;j <= n - 3;j++)
				  {
				   b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 3));
				  }
				   b = tangible.StringFunctions.changeCharacter(b, n - 2, '\0');
			  }
			   else
			   {
			   for (j = 0;j <= n - 2;j++)
			   {
			   b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 2));
			   }
			   b = tangible.StringFunctions.changeCharacter(b, n - 1, '\0');
			   }
	   System.out.printf("%s\n",b);
	   System.out.printf("%d\n",mod);
		 }
		}
	   System.in.read();
	   System.in.read();
	}

}

