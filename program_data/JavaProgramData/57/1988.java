package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[15]);
			String b;
			int l;
			b = a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			l = a.length();
			b = a.charAt(l - 1);
			if (strcmp(b,"r") == 0 || strcmp(b,"y") == 0)
			{
			   a = a.substring(0, l - 2);
			}
			if (strcmp(b,"g") == 0)
			{
			   a = a.substring(0, l - 3);
			}
			 b = a;
			 System.out.print(b);
			 System.out.print("\n");
		}
		return 0;
	}

}

