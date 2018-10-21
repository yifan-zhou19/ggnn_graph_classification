package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int q;
		int len;
		String mark = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mark = tempVar.charAt(0);
		}
		len = mark.length();
		for (p = len - 1;p > 0;p--)
		{
			for (q = 0;q < p;q++)
			{
				if (mark.charAt(q) > mark.charAt(q + 1))
				{
					char a;
					a = mark.charAt(q);
					mark = tangible.StringFunctions.changeCharacter(mark, q, mark.charAt(q + 1));
					mark = tangible.StringFunctions.changeCharacter(mark, q + 1, a);
				}
			}
		}
		int judge = 0;
		for (i = 0;i < len;i++)
		{
			if (mark.charAt(i) >= 97 && mark.charAt(i) <= 122)
			{
				judge++;
				int n = 1;
				for (j = i + 1;j < len;j++)
				{
					if (mark.charAt(j) == mark.charAt(i))
					{
						n++;
						mark = mark.substring(0, j);
					}
				}
				if (n != 0)
				{
					System.out.printf("%c=%d\n",mark.charAt(i),n);
				}
			}
		}
		if (judge == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

