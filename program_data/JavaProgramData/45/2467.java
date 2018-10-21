package <missing>;

public class GlobalMembers
{
	public static int locate(String s, String w)
	{
		int m;
		int k;
		int len1;
		int len2;
	len1 = s.length();
	len2 = w.length();
	m = 0;
	while (m + len1 <= len2)
	{
	k = 0;
	while ((k < len1) && (s[k].equals(w[m + k])))
	{
		++k;
	}
	if (k == len1)
	{
		return m;
	}
	m++;
	}
	return -1; // ???
	}
	public static int Main()
	{
		String s = new String(new char[50]);
		String w = new String(new char[50]);
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
		int a;
		a = locate(s, w);
		System.out.printf("%d",a);
		return 0;
	}

}

