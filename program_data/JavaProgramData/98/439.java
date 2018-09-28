package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int lw;
		int len = 0;
		String p = new String(new char[100]);
		String w = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = "";
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",p);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				w = tempVar2.charAt(0);
			}
			lw = w.length();
			if (len + lw > 80)
			{
				System.out.print("\n");
				len = 0;
			}
			else if (i != 0)
			{
				System.out.print(" ");
			}
			len += lw + 1;
			p = w;
		}
		System.out.printf("%s\n",p);

		return 0;
	}


}

