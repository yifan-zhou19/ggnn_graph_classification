package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String p;
			b = a.length();
			p = a.charAt(b - 2);
			if (strcmp(p,"er") == 0 || strcmp(p,"ly") == 0)
			{
				a = a.substring(0, b - 2);
			}

			p = a.charAt(b - 3);
			if (strcmp(p,"ing") == 0)
			{
				a = a.substring(0, b - 3);
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}



}

