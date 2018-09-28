package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int z;
	  int q;
	  int s;
	  int l;
	  int t;
	  int[] num = new int[4];
	  char ch;
	  String name = new String(new char[4]);
	  for (int z = 1; z <= 5; ++z)
	  {
		for (int q = 1; q <= 5; ++q)
		{
		  for (int s = 1; s <= 5; ++s)
		  {
			for (int l = 1; l <= 5; ++l)
			{
			  if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
			  {
								  num[0] = z;
								  num[1] = q;
								  num[2] = s;
								  num[3] = l;
								  name = tangible.StringFunctions.changeCharacter(name, 0, 'z');
								  name = tangible.StringFunctions.changeCharacter(name, 1, 'q');
								  name = tangible.StringFunctions.changeCharacter(name, 2, 's');
								  name = tangible.StringFunctions.changeCharacter(name, 3, 'l');
								  for (int i = 0; i < 4 ; ++i)
								  {
									for (int j = i; j < 4; ++j)
									{
									  if (num[j] > num[i])
									  {
									  t = num[i];
									  num[i] = num[j];
									  num[j] = t;
														  ch = name.charAt(i);
														  name = tangible.StringFunctions.changeCharacter(name, i, name.charAt(j));
														  name = tangible.StringFunctions.changeCharacter(name, j, ch);
									  }
									}
								  }
								  for (int i = 0; i < 4; ++i)
								  {
									System.out.print(name.charAt(i));
									System.out.print(" ");
									System.out.print(num[i] * 10);
									System.out.print("\n");
								  }
								  return 0;
			  }
			}
		  }
		}
	  }
	}

}

