package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int m;
		int L;
		int l1;
		int l2;
		String s = new String(new char[1000]);
		String a = new String(new char[300]);
		String b = new String(new char[300]);
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
		System.in.read();
		L = s.length();
		l1 = a.length();
		l2 = b.length();
		n = 0;
		for (i = 0;i < L;i++)
		{
			if (a.charAt(0) == s.charAt(i))
			{
				 n++;
				 for (k = 1; k < l1; k++)
				 {
					 if (s.charAt(i + k) == a.charAt(k))
					 {
						  n++;
					 }
					 else
					 {
							n = 0;
							break;
					 }
				 }
			}
			if (n == l1)
			{
				 break;
			}
		}
		for (k = 0;k < i;k++)
		{
			System.out.printf("%c",s.charAt(k));
			System.in.read();
		}
		for (k = 0;i != L && k < l2;k++)
		{
			System.out.printf("%c",b.charAt(k));
			System.in.read();
		}
		for (k = i + l1;i != L && k < L;k++)
		{
			System.out.printf("%c",s.charAt(k));
			System.in.read();
		}
		return 0;
	}


}

