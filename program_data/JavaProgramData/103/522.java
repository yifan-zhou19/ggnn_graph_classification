package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		char c;
		int sum = 1;
		int i;

	   while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	   {
		if (a.length() == 1)
		{
			c = a.charAt(0);
			if ((c >= 'a') && (c <= 'z'))
			{
						c = c - 'a'+'A';
			}
					   System.out.print('(');
					   System.out.print(c);
					   System.out.print(',');
					   System.out.print(1);
					   System.out.print(')');
					   System.out.print("\n");
			continue;
		}
		for (i = 0;i < a.length();i++)
		{

			if (i > 0)
			{
				if ((a.charAt(i - 1) == a.charAt(i)) || (a.charAt(i - 1) == a.charAt(i) - 'A'+'a') || (a.charAt(i - 1) == a.charAt(i) - 'a'+'A'))
				{
					sum++;
					if (i == a.length() - 1)
					{
						c = a.charAt(i - 1);
					   if ((c >= 'a') && (c <= 'z'))
					   {
						c = c - 'a'+'A';
					   }
					   System.out.print('(');
					   System.out.print(c);
					   System.out.print(',');
					   System.out.print(sum);
					   System.out.print(')');
					}
				}
				else
				{
					c = a.charAt(i - 1);
					if ((c >= 'a') && (c <= 'z'))
					{
						c = c - 'a'+'A';
					}
					System.out.print('(');
					System.out.print(c);
					System.out.print(',');
					System.out.print(sum);
					System.out.print(')');
					sum = 1;
					if (i == a.length() - 1)
					{
						c = a.charAt(i);
						if ((c >= 'a') && (c <= 'z'))
						{
						c = c - 'a'+'A';
						}
					System.out.print('(');
					System.out.print(c);
					System.out.print(',');
					System.out.print(sum);
					System.out.print(')');
					}

				}
			}
		}
		System.out.print("\n");
	   }
		return 0;
	}
}

