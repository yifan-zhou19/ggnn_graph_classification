package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[10000]);
		char c = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		for (i = 0;i < 10000;i++)
		{
			b = b.substring(0, i);
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			{
				b.charAt(a.charAt(i))++;
				c = 1;
			}
		else
		{
			continue;
		}
		}
		if (c != 0)
		{
			for (i = 'a';i <= 'z';i++)
			{

			if (b.charAt(i) != 0)
			{

				System.out.printf("%c=%d\n",i,b.charAt(i));
			}
			}
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}


}

