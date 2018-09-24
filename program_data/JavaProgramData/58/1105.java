package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int result = 0;
		char c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			c = System.in.read();
			if (!(c == '_' || Character.isLetter(c)))
			{
				System.out.printf("%d\n",result);
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
				while (System.in.read() != '\n')
				{
					;
				}
				continue;
			}

			while (true)
			{
				if (!(c == '_' || Character.isLetterOrDigit(c)))
				{
					result = 0;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
					while (System.in.read() != '\n')
					{
						;
					}
					break;
				}
				else
				{
					result = 1;
				}
				if ((c = System.in.read()) == '\n')
				{
					break;
				}
			}
			System.out.printf("%d\n",result);
			result = 0;
		}
	}
}

