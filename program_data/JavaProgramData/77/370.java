package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int len;
		int j;
		int k;
		int count;
		String a = new String(new char[1000]);
		char b;
		char g;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a.charAt(0);
		len = a.length();
		count = len / 2;
		for (i = 1;i <= len - 1;i++)
		{
			if (a.charAt(i) != b)
			{
				g = a.charAt(i);
				break;
			}
		}
		for (j = 0;j <= len - 1;j++)
		{
				if (a.charAt(j) == g)
				{

					for (k = j - 1;k >= 0;k--)
					{

						if (a.charAt(k) == 'o')
						{
							continue;
						}
						if (a.charAt(k) == b)
						{
							System.out.print(k);
							System.out.print(" ");
							System.out.print(j);
							if (count != 0)
							{
								System.out.print("\n");
							}
							count--;
							a = tangible.StringFunctions.changeCharacter(a, k, 'o');
							a = tangible.StringFunctions.changeCharacter(a, j, 'o');
							break;
						}
					}
				}
		}
		return 0;
	}












}

