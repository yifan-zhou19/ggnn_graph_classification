package <missing>;

public class GlobalMembers
{
	public static int work(tangible.RefObject<String> input)
	{
		String p = input.argValue;
		char c = '0';
		for (c = '0';c <= '9';c++)
		{
			if (p == c)
			{
				return 0;
			}
		}
		int n = input.argValue.length();
		for (int i = 0;i < n;i++)
		{
			if (compare(*(p.Substring(i))) == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int compare(char a)
	{
		char c = '0';
		for (c = '0';c <= '9';c++)
		{
			if (a == c)
			{
				return 1;
			}
		}
		for (c = 'A';c <= 'Z';c++)
		{
			if (a == c)
			{
				return 1;
			}
		}
		for (c = 'a';c <= 'z';c++)
		{
			if (a == c)
			{
				return 1;
			}
		}
		   if (a == '_')
		   {
			return 1;
		   }
		else
		{
			return 0;
		}
	}
	public static void Main(String[] args)
	{
		int n = 0;
		int k = 0;
		String n1 = new String(new char[6]);
		String input = new String(new char[80]);
				   n1 = new Scanner(System.in).nextLine();
		n = Integer.parseInt(n1);
		for (int i = 0;i < n;i++)
		{
			input = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_input = new tangible.RefObject<String>(input);
			k = work(tempRef_input);
			input = tempRef_input.argValue;
		tangible.RefObject<String> tempRef_input2 = new tangible.RefObject<String>(input);
			System.out.printf("%d\n",work(tempRef_input2));
			input = tempRef_input2.argValue;
		}
	}
}

