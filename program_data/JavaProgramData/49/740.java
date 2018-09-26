package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int s = 0;
		for (int i = 0;i < 500;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				s++;
			}
		}
		for (int j = 2;j <= s;j++)
		{
			for (int i = 0;i < s;i++)
			{
				String b = new String(new char[j]);
				for (int k = i;k < i + j;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(2 * i + j - 1 - k));
				}
				for (int m = i;m < i + j;m++)
				{
					if (a.charAt(m) != b.charAt(m))
					{
						break;
					}
					if (a.charAt(m) == b.charAt(m) && m == i + j - 1)
					{
						for (int p = i;p < i + j;p++)
						{
					System.out.print(a.charAt(p));
						}
					System.out.print("\n");
					}
				}
			}
		}
			return 0;
	}








}

