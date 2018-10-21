package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int p;
		int q;
		int[] c = new int[251];
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		char d;
		a = new Scanner(System.in).nextLine();
		p = a.length();
		if (p < 250)
		{
			for (i = 0;(d = a.charAt(i)) != '\0';i++)
			{
		 m = i + 1;
			}
		}
		 else
		 {
			 m = 250;
		 }

		b = new Scanner(System.in).nextLine();
		q = b.length();
		if (q < 250)
		{
			for (i = 0;(d = b.charAt(i)) != '\0';i++)
			{
		 n = i + 1;
			}
		}
		 else
		 {
			 n = 250;
		 }

		for (i = m - 1;i >= 0;i--)
		{
		  a = tangible.StringFunctions.changeCharacter(a, 250 - m + i, a.charAt(i));
		}
		for (i = n - 1;i >= 0;i--)
		{
		  b = tangible.StringFunctions.changeCharacter(b, 250 - n + i, b.charAt(i));
		}


		for (i = 0;i < 250 - m;i++)
		{
		a = a.substring(0, i);
		}
		for (i = 250 - m;i < 250;i++)
		{
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
		}

		for (i = 0;i < 250 - n;i++)
		{
		b = b.substring(0, i);
		}
		for (i = 250 - n;i < 250;i++)
		{
		b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 48);
		}

		  for (i = 249;i >= 1;i--)
		  {
			  if (a.charAt(i) + b.charAt(i) > 9)
			  {
			   c[i + 1] = a.charAt(i) + b.charAt(i) - 10;
			a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) + 1);
			  }
		   else
		   {
			   c[i + 1] = a.charAt(i) + b.charAt(i);
		   }
		  }

		  if (a.charAt(0) + b.charAt(0) > 9)
		  {
				c[1] = a.charAt(0) + b.charAt(0) - 10;
			 c[0] = 1;
		  }
		  else
		  {
				c[1] = a.charAt(0) + b.charAt(0);
			 c[0] = 0;
		  }
		 i = 0;
		 do
		 {
			 i = i + 1;
		 } while (c[i] == 0);
		  k = i;

		 if (k < 251)
		 {
			 for (i = k;i < 251;i++)
			 {
			  c[i] = c[i] + 48;
		   System.out.printf("%c",c[i]);
			 }
		 }
		 else
		 {
		 System.out.print("0");
		 }


		  return 0;
	}
}

