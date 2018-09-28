package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int count;
		String s = new String(new char[105]);
		char head;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		count = 0;
		for (;;)
		{
			for (i = 0;i < l;i++)
			{
				if (s.charAt(i) == ' ')
				{
					i++;
				}
				else
				{
					head = s.charAt(i);
					break;
				}
			}
			for (j = i;j < l;j++)
			{
				if (s.charAt(j) != ' ' && s.charAt(j) != head)
				{
					for (k = j - 1;k >= 0;k--)
					{
						if (s.charAt(k) != ' ')
						{
							break;
						}
					}
					System.out.printf("%d %d\n",k,j);
					s = tangible.StringFunctions.changeCharacter(s, k, ' ');
					s = tangible.StringFunctions.changeCharacter(s, j, ' ');
				}
			}
			count += 2;
			if (count == l)
			{
				break;
			}
		}
		return 0;
	}
}

