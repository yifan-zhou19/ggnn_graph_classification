package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[200]);
		String x = new String(new char[200]);
		String d = new String(new char[200]);
		int ka = 1;
		int kb = 1;
		int z = 0;
		int ia = 0;
		int ib = 0;
		int i2 = 0;
		int z0 = 100;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();

		for (i = 0;;i++,ka++,kb++)
		{
			if (s.charAt(i) == '\0')
			{
				if (ka > z)
				{
				  for (j = ia;j <= i - 1;j++)
				  {
					 d = tangible.StringFunctions.changeCharacter(d, i2, s.charAt(j));
					 i2++;
				  }
				  d = tangible.StringFunctions.changeCharacter(d, i2, '\0');

				   z = ka;

				   i2 = 0;


				}
				if ((kb < z0) && (((s.charAt(i - 1) <= 90) && (s.charAt(i - 1) >= 65)) || ((s.charAt(i - 1) <= 122) && (s.charAt(i - 1) >= 97))))
				{
				  for (j = ib;j <= i - 1;j++)
				  {
					 x = tangible.StringFunctions.changeCharacter(x, i2, s.charAt(j));
					 i2++;
				  }
				  x = tangible.StringFunctions.changeCharacter(x, i2, '\0');

				   z0 = kb;

				   i2 = 0;


				}
				ka = 0;
				kb = 0;
				ia = i + 1;
				ib = i + 1;
				break;
			}
			else
			{

			 if (((s.charAt(i) <= 90) && (s.charAt(i) >= 65)) || ((s.charAt(i) <= 122) && (s.charAt(i) >= 97)))
			 {
			 }
			 else
			 {
				if (ka > z)
				{
				  for (j = ia;j <= i - 1;j++)
				  {
					 d = tangible.StringFunctions.changeCharacter(d, i2, s.charAt(j));
					 i2++;
				  }
				  d = tangible.StringFunctions.changeCharacter(d, i2, '\0');

				   z = ka;

				   i2 = 0;


				}
				if (kb < z0)
				{
				  for (j = ib;j <= i - 1;j++)
				  {
					 x = tangible.StringFunctions.changeCharacter(x, i2, s.charAt(j));
					 i2++;
				  }
				  x = tangible.StringFunctions.changeCharacter(x, i2, '\0');

				   z0 = kb;

				   i2 = 0;


				}
				ka = 0;
				kb = 0;
				ia = i + 1;
				ib = i + 1;
			 }



			}
		}
		System.out.printf("%s\n",d);
		System.out.printf("%s\n",x);
	}



}

