package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		String p;
		p = tangible.StringFunctions.strStr(a,b);
		if (p != null)
		{
			int n = a.length() - p.length();
			int i;
			int k = b.length();
			int l = c.length();
			int m = 0;
			for (i = 0;i < n;i++)
			{
			   System.out.printf("%c",a.charAt(i));
			}
			for (i = n;i < n + l;i++)
			{
				System.out.printf("%c",c.charAt(m));
				m++;
			}
			for (i = n + k;i < (a.length());i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		else
		{
			System.out.printf("%s\n",a);
		}
		return 0;
	}
}

