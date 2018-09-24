package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[26];
		int q = 0;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int as = a.length();
		int i;
		for (i = 0;i < 26;i++)
		{
			shu[i] = 0;
		}
		for (i = 0;i < as;i++)
		{
			if ((int)a.charAt(i) - 97 >= 0 && (int)a.charAt(i) - 97 < 26)
			{
				shu[(int)a.charAt(i) - 97]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (shu[i] != 0)
			{
				System.out.printf("%c=%d\n",(char)(i + 97),shu[i]);
			}
			else
			{
				q++;
			}
		}
		if (q == 26)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

