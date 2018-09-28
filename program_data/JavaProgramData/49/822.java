package <missing>;

public class GlobalMembers
{
	//********************************
	//*???4.cpp   **
	//*?????? 1200012768 **
	//*???2012.11.  **
	//*???????  **
	//********************************
	public static int Main()
	{
		String ch = new String(new char[500]);
		int i = 0;
		int j;
		int k;
		int len;
		int flag = 1;
		do
		{
			cin.get(ch.charAt(i));
			if (ch.charAt(i) == '\n')
			{
				break;
			}
			i++;
		} while (i < 500);
		ch = tangible.StringFunctions.changeCharacter(ch, i, '\0');
		len = ch.length();
		for (j = 2; j <= len; j++)
		{
			for (i = 0; i <= len - j; i++)
			{
				for (k = i; k <= i + (j - 1) / 2; k++)
				{
					if (ch.charAt(k) != ch.charAt(2 * i + j - 1 - k))
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (k = i; k < i + j; k++)
					{
						System.out.print(ch.charAt(k));
					}
					System.out.print("\n");
				}
				flag = 1;
			}
		}
		return 0;
	}

}

