package <missing>;

public class GlobalMembers
{
	public static int search(String a, String b)
	{
		int la = a.length();
		int lb = b.length();
		int i;
		int j;
		for (i = 0;i <= lb - la;i++)
		{
			for (j = 0;j < la;j++)
			{
				if (!a[j].equals(b[i + j]))
				{
				   break;
				}
			}
			if (j == la)
			{
			   return i;
			}
		}
		return 999;
	}
	public static int Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		m = search(a, s);
		if (m == 999)
		{
		   System.out.printf("%s\n",s);
		   System.in.read();
		   System.in.read();
		   return 0;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.printf("%s",b);
		for (i += a.length();i < s.length();i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

