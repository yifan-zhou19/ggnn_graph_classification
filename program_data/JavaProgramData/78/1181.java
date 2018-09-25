package <missing>;

public class GlobalMembers
{
	//********************************
	//*???8.cpp   **
	//*?????? 1200012768 **
	//*???2013.1.5  **
	//*??????  **
	//********************************
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		for (z = 1; z < 6; z++)
		{
			for (q = 1; q < 6; q++)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 1; s < 6; s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1; l < 6; l++)
					{
						if (l == z || l == s || l == q)
						{
							continue;
						}
						if ((z + q == s + l) && ((z + l) > (s + q)) && (z + s < q))
						{
							for (i = 5; i > 0; i--)
							{
								if (z == i)
								{
									System.out.print("z ");
									System.out.print(z * 10);
									System.out.print("\n");
								}
								else if (q == i)
								{
									System.out.print("q ");
									System.out.print(q * 10);
									System.out.print("\n");
								}
								else if (s == i)
								{
									System.out.print("s ");
									System.out.print(s * 10);
									System.out.print("\n");
								}
								else if (l == i)
								{
									System.out.print("l ");
									System.out.print(l * 10);
									System.out.print("\n");
								}
							}
							break;
						}
					}
				}
			}
		}
		return 0;
	}

}
