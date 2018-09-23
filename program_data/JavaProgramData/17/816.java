package <missing>;

public class GlobalMembers
{
	public static void match(tangible.RefObject<String> p)
	{
		int n = p.argValue.intValue().length();
		int[] a = new int[100];
		int i;
		int j;
		for (i = j = 0;i < n;i++)
		{
			if (p.argValue.charAt(i) == ')')
			{
				for (j = i;j >= 0;j--)
				{
					if (p.argValue.charAt(j) == '(')
					{
						p.argValue.charAt(j) = p.argValue.charAt(i) = 'a';
						break;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p.argValue.charAt(i) == '(')
			{
				System.out.print("$");
			}
			else if (p.argValue.charAt(i) == ')')
			{
				System.out.print("?");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\n");

	}
	public static void Main()
	{
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			final String s = "";
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
					System.out.printf("%s\n",s);
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			match(tempRef_s);
			s = tempRef_s.argValue;
			i++;
		}
	}
}

