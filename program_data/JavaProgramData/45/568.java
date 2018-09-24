package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
		final String w = "";
		int i;
		int j;
		int num;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		p = tangible.StringFunctions.strStr(w,s);
		p = '!';
		for (i = 0;i < w.length();i++)
		{
			if (w.charAt(i) == '!')
			{
			num = i;
			break;
			}
		}

		System.out.printf("%d\n",num);
	}

}

