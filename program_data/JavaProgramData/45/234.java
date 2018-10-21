package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		int i;
		int j;
		int m;
		int n;
		int x;
		j = 0;
		n = 0;
		m = 0;
		for (i = 0;i < 50;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar);
			}
			if (s.charAt(i) == ' ')
			{
				break;
			}
			j++;
		}
		for (i = 0;i < 50;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				w = tangible.StringFunctions.changeCharacter(w, i, tempVar2);
			}
			if (w.charAt(i) == '\n')
			{
				break;
			}
		}
		i = 0;
		while (i < 50)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
			else if ((s.charAt(i) != '\0') && (s.charAt(i) == w.charAt(i)))
			{
				n++;
				i++;
			}
			else
			{
				for (x = 0;x < 50;x++)
				{
				w = tangible.StringFunctions.changeCharacter(w, x, w.charAt(x + 1));
				}
				m++;
				i = 0;
			}
			if (n == j)
			{
				break;
			}
		}
		System.out.printf("%d\n",m);
	}

}

