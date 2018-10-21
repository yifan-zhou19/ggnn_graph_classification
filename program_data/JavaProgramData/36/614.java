package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l1;
		int l2;
		String w1 = new String(new char[20]);
		String w2 = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		l1 = w1.length();
		l2 = w2.length();
		if (l1 == l2)
		{
			for (i = 0;i < l1;i++)
			{
				for (j = 0;j < l1;j++)
				{
					if (w1.charAt(i) == w2.charAt(j))
					{
						w2 = w2.substring(0, j);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto Q;
					}
				}
				System.out.print("NO");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto M;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	Q:
	;
			}
			System.out.print("YES");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	M:
	;
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

