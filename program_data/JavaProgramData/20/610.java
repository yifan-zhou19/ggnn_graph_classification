package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int i;
		int j;
		String p1;
		while (scanf("%s",a) != EOF)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b = tempVar.charAt(0);
			}
			p1 = a.charAt(0);
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) > p1)
				{
					p1 = a.charAt(i);
				}
			}
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) != p1)
				{
					System.out.printf("%c",a.charAt(i));
				}
				if (a.charAt(i) == p1)
				{
					System.out.printf("%c%c%c%c", p1,b.charAt(0),b.charAt(1),b.charAt(2));
				}
			}
			System.out.print("\n");
		}

	}
}

