package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		char a = 'z';
		char b = 'q';
		char c = 's';
		char d = 'l';
		int temp;
		char chtemp;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 1; s <= 5; s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1; l <= 5; l++)
					{
						if (l == z && l == q && l == s)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							if (z > q)
							{
								temp = z;
								z = q;
								q = temp;
								chtemp = a;
								a = b;
								b = chtemp;
							}
							if (q > s)
							{
								temp = s;
								s = q;
								q = temp;
								chtemp = c;
								c = b;
								b = chtemp;
								if (z > q)
								{
									temp = z;
									z = q;
									q = temp;
									chtemp = a;
									a = b;
									b = chtemp;
								}
							}
							if (s > l)
							{
								temp = s;
								s = l;
								l = temp;
								chtemp = c;
								c = d;
								d = chtemp;
								if (q > s)
								{
									temp = s;
									s = q;
									q = temp;
									chtemp = c;
									c = b;
									b = chtemp;
									if (z > q)
									{
										temp = z;
										z = q;
										q = temp;
										chtemp = a;
										a = b;
										b = chtemp;
									}
								}
							}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
												goto part1;
						}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		part1:
								System.out.print(d);
								System.out.print(" ");
								System.out.print(l * 10);
								System.out.print("\n");
								System.out.print(c);
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								System.out.print(b);
								System.out.print(" ");
								System.out.print(q * 10);
								System.out.print("\n");
								System.out.print(a);
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
		return 0;
	}
}
