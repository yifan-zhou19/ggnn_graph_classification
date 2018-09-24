package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[300]);
		char j;
		int b;
		int i;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = tempVar.charAt(0);
		}
		for (i = 0;p.charAt(i) != '\0';i++)
		{
			if ((p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') || (p.charAt(i) >= 'a' && p.charAt(i) <= 'z'))
			{
				a++;
			}
		}
		if (a == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (j = 'A';j <= 'Z';j++)
			{
				b = 0;
				for (i = 0;p.charAt(i) != '\0';i++)
				{

					if (p.charAt(i) == j)
					{
						b++;
					}
				}

				if (b != 0)
				{
					System.out.printf("%c=%d\n",j,b);
				}
			}
			for (j = 'a';j <= 'z';j++)
			{
				b = 0;
				for (i = 0;p.charAt(i) != '\0';i++)
				{

					if (p.charAt(i) == j)
					{
						b++;
					}
				}

				if (b != 0)
				{
					System.out.printf("%c=%d\n",j,b);
				}
			}

		}
		return 0;
	}

}

