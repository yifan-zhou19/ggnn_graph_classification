package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s3 = new String(new char[100]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String s = new String(new char[100]);
		int q = 0;
		int a;
		int b;
		int i;
		int p = 0;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s3 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		t = s3.length();
		for (i = t - 1;i >= 0;i--)
		{
			s = tangible.StringFunctions.changeCharacter(s, t - 1 - i, s3.charAt(i));
			s = tangible.StringFunctions.changeCharacter(s, t - i, '\0');
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				q = q + (s.charAt(i) - 'a' + 10) * Math.pow(a,i);
			}
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				q = q + (s.charAt(i) - 'A' + 10) * Math.pow(a,i);
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				q = q + (s.charAt(i) - '0') * Math.pow(a,i);
			}
		}
			if (q == 0)
			{
				System.out.print("0");
			}
			else if (q != 0)
			{
			   for (i = 0;q != 0;i++)
			   {
				 p = q % b;
				 if (p >= 10)
				 {
					s1 = tangible.StringFunctions.changeCharacter(s1, i, p + 55);
				 }
				 else
				 {
					s1 = tangible.StringFunctions.changeCharacter(s1, i, p + 48);
				 }
				 s1 = tangible.StringFunctions.changeCharacter(s1, i + 1, '\0');
				 q = q / b;
			   }
			   m = s1.length();
			   for (i = m - 1;i >= 0;i--)
			   {
				  s2 = tangible.StringFunctions.changeCharacter(s2, m - 1 - i, s1.charAt(i));
				  s2 = tangible.StringFunctions.changeCharacter(s2, m - i, '\0');
			   }
				System.out.printf("%s",s2);
			}

				   return 0;
	}

}

