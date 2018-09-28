package <missing>;

public class GlobalMembers
{
	public static void arrange(String w)
	{
		int i;
		int j;
		char c;
		for (i = 19;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (w[j].compareTo(w[j + 1]) < 0)
				{
					c = w[j];
					w[j] = w[j + 1];
					w[j + 1] = c;
				}
			}
		}
	}

	public static void Main()
	{
		char[] w1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] w2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	/*	while (scanf("%s%s",w1,w2)!=EOF)
		{*/
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		arrange(w1);
			arrange(w2);
			if (strcmp(w1,w2))
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.print("YES\n");
			}
		/*}*/
	}
}

