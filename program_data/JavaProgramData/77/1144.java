package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		int[] b = new int[101];
		int top = 0;
		String s = new String(new char[101]);
		char boy;
		s = new Scanner(System.in).nextLine();
		boy = s.charAt(0);
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) == boy)
			{
				b[top] = i;
				top++;
			}
			else if (s.charAt(i) != boy && s.charAt(i) != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, b[top - 1], ' ');
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				System.out.printf("%d %d\n",b[top - 1],i);
				top--;
			}
		}
		return 0;
	}
}

