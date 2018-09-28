package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????????????
		int i;
		int len = 0;
		String p = null; //??
		char[][] word = new char[2000][40]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}
		p = word[0]; //?????????
		for (i = 0;i < n - 1;i++)
		{
			len += String.valueOfp.length();
			if (len + 1 + String.valueOf(*(p.Substring(1))).length() > 80) //??????80
			{
				System.out.print(p);
				System.out.print("\n");
				len = 0;
				p += 1;
			}
			else
			{
				len += 1;
				System.out.print(p);
				System.out.print(" ");
				p += 1;
			}
		}
		System.out.print(p);
		return 0;
	}
}

