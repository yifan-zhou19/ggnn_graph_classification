package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
		int l;
		int sum = 0;
		int a;
		int b;
		String c = new String(new char[100]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0;i < c.length();i++)
		{
								if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
								{
								c.charAt(i) -= 47;
								}
								else if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
								{
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 11);
								}
								else if (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z')
								{
								c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A' + 11);
								}
		}
		for (k = 0;k < c.length();k++)
		{
								sum = sum * a + (c.charAt(k) - 1);
	//                            printf("%d",sum);
		}
		for (j = 0;sum > 0;j++)
		{
					 c = tangible.StringFunctions.changeCharacter(c, j, sum % b);
					 sum = sum / b;
		}
		for (t = 0;t < j;t++)
		{
								if (c.charAt(t) >= 0 && c.charAt(t) <= 9)
								{
								c.charAt(t) += 48;
								}
								else if (c.charAt(t) >= 10 && c.charAt(t) <= 36)
								{
								c = tangible.StringFunctions.changeCharacter(c, t, c.charAt(t) + 'A' - 10);
								}
		}
		if (j != 0)
		{
		  for (l = j - 1;l >= 0;l--)
		  {
						   System.out.printf("%c",c.charAt(l));
		  }
		}
		  else
		  {
			  System.out.print("0");
		  }
		System.out.print("\n");
	}


}

