package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[22]);
		String b = new String(new char[4]);
		String c = new String(new char[11]);
		String d = new String(new char[11]);
		int s1;
		int s2;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		do
		{

			s1 = a.length();
			s2 = b.length();
			for (i = 0;i < s1;i++)
			{
				int num = 0;
				for (j = 0;j < s1;j++)
				{
					if ((int)a.charAt(j) <= (int)a.charAt(i))
					{
						num++;
					}
				}
				if (num == s1)
				{
					for (j = 0;j <= i;j++)
					{
						c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j));
					}
					c = tangible.StringFunctions.changeCharacter(c, i + 1, '\0');
					for (j = i + 1;j < s1;j++)
					{
						d = tangible.StringFunctions.changeCharacter(d, j - i - 1, a.charAt(j));
					}
					d = tangible.StringFunctions.changeCharacter(d, s1 - i - 1, '\0');
					c += b;
					c += d;
					System.out.printf("%s\n",c);
					break;
				}
			}

		} while (scanf("%s%s",a,b) != EOF);
	}
}

