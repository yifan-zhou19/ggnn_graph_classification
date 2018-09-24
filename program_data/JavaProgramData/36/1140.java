package <missing>;

public class GlobalMembers
{
	public static void paixu(tangible.RefObject<String> x)
	{
		int i;
		int k;
		char temp;
		for (k = 1;k < x.argValue.length();k++)
		{
			for (i = 0;i < x.argValue.length() - k;i++)
			{
				if (x.argValue.charAt(i) > x.argValue.charAt(i + 1))
				{
					temp = x.argValue.charAt(i + 1);
					x.argValue.charAt(i + 1) = x.argValue.charAt(i);
					x.argValue.charAt(i) = temp;
				}
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() == b.length())
		{
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			paixu(tempRef_a);
			a = tempRef_a.argValue;
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			paixu(tempRef_b);
			b = tempRef_b.argValue;
			if (strcmp(a,b) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
}

