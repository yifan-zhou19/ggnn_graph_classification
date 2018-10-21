package <missing>;

public class GlobalMembers
{
	public static int same(tangible.RefObject<String> p, tangible.RefObject<String> q)
	{
		int a;
		int b;
			for (a = 0; * (q.argValue.Substring(a)) != '\0';)
			{
				for (b = 0; * (q.argValue.Substring(a) + b) == *(p.argValue.Substring(b));b++)
				{
					if (*(p.argValue.Substring(b) + 1) == '\0')
					{
						return a;
					}
				}
				a++;
			}
			return 0;
	}

	public static int Main()
	{
		String w = new String(new char[2000]); //??
		String s = new String(new char[200]);
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
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_w = new tangible.RefObject<String>(w);
		System.out.printf("%d",same(tempRef_s, tempRef_w));
		w = tempRef_w.argValue;
		s = tempRef_s.argValue;
		return 0;
	}

}

