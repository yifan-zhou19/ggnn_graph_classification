package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[1]);
		int[] m = new int[300];
		int a;
		int b;
		int c;
		int d;
		a = 0;
		b = 0;
		while (a == 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m[b] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				str = tangible.StringFunctions.changeCharacter(str, 0, tempVar2);
			}
			if (str.charAt(0) == '\n')
			{
				a = 1;
				b++;
			}
			else
			{
				b++;
			}
		}

		for (a = 0;a < b;a++)
		{
			for (c = 1;c < b;c++)
			{
				if (m[c - 1] < m[c])
				{
					d = m[c - 1];
					m[c - 1] = m[c];
					m[c] = d;
				}
			}
		}
		c = 0;

		for (a = 1;a < b;a++)
		{
			if (m[a] == m[a - 1])
			{
			}
			else
			{
				System.out.printf("%d",m[a]);
					a = b;
					c = 1;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}

	}


}

