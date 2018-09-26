package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int z;
		int s;
		int l;
		int s1;
		int s2;
		int s3;
		String weight = new String(new char[6]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(weight,0,(Character.SIZE / Byte.SIZE));
		for (q = 1;q < 6;q++)
		{
			for (z = 1;z < 6;z++)
			{
				if (z == q)
				{
					continue;
				}
				for (s = 1;s < 6;s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1;l < 6;l++)
					{
						if (l == s || l == z || l == q)
						{
							continue;
						}
						s1 = (z + q) == (s + l);
						s2 = (z + l) > (s + q);
						s3 = (z + s) < q;
						if (s1 + s2 + s3 == 3)
						{
							weight = tangible.StringFunctions.changeCharacter(weight, q, 'q');
							weight = tangible.StringFunctions.changeCharacter(weight, z, 'z');
							weight = tangible.StringFunctions.changeCharacter(weight, s, 's');
							weight = tangible.StringFunctions.changeCharacter(weight, l, 'l');
							for (int i = 5;i > 0;i--)
							{
								if (weight.charAt(i) != '\0')
								{
									System.out.print(weight.charAt(i));
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

