package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10]);
	  int z;
	  int q;
	  int s;
	  int l;
	  int i;
	  int j;
	  int k;
	  int t;
	  for (i = 1;i <= 5;i++)
	  {
		   a = tangible.StringFunctions.changeCharacter(a, i, ' ');
	  }
	  for (z = 1;z <= 5;z++)
	  {
		   for (q = 1;q <= 5;q++)
		   {
					if (z == q)
					{
						continue;
					}
				  for (s = 1;s <= 5;s++)
				  {
						   if ((s == q) || (s == z))
						   {
							   continue;
						   }
						for (l = 1;l <= 5;l++)
						{
							 if ((l == z) || (l == q) || (l == s))
							 {
								 continue;
							 }
						 if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						 {
								 a = tangible.StringFunctions.changeCharacter(a, z, 'z');
							  a = tangible.StringFunctions.changeCharacter(a, q, 'q');
							  a = tangible.StringFunctions.changeCharacter(a, s, 's');
							  a = tangible.StringFunctions.changeCharacter(a, l, 'l');
							  for (i = 5;i >= 1;i--)
							  {
								   if (a.charAt(i) != ' ')
								   {
									   System.out.print(a.charAt(i));
									   System.out.print(' ');
									   System.out.print(i * 10);
									   System.out.print("\n");
								   }
							  }

						 }
						}
				  }
		   }
	  }
	  return 0;

	}

}

