package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}

		int ls = s.length();
		int lw = w.length();
		int i;
		int j;
		int t = 1;

		//printf("%d\n",ls);
		for (i = 0;i < 50;i++)
		{

			for (j = 0;j < ls;j++)
			{
			//	printf("%c %c\n",w[i+j],s[j]);
				if (w.charAt(i + j) != s.charAt(j))
				{
					t = 0;
					break;
				}

				if (w.charAt(i + j) == s.charAt(j))
				{
					t = 1;
					continue;
				}

			}

			if (t == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}

		return 0;
	}

}

