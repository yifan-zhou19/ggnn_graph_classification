package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		int i;
		int j = 0;
		int a;
		int b = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			a = i + 1;
		}
		for (i = 0;t.charAt(i) != '\0';i++)
		{
			if (t.charAt(i) == s.charAt(0))
			{
				for (j = 0;j < a;j++)
				{
					if (t.charAt(i + j) == s.charAt(j))
					{
						b++;
					}
				}
				if (b == a)
				{
					c = i;
				}
				else
				{
					b = 0;
				}
			}
		}
		System.out.printf("%d\n",c);
		return 0;
	}

}

