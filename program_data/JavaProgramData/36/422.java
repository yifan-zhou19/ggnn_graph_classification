package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len1;
		int len2;
		int i;
		int j;
		char t;
		String a1 = new String(new char[10]);
		String a2 = new String(new char[10]);
		String p1 = a1;
		String p2 = a2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = tempVar2.charAt(0);
		}
		len1 = a1.length();
		len2 = a2.length();
		if (len1 == len2)
		{
		for (i = 0;i <= len1 - 1;i++)
		{
			for (j = i;j <= len1 - 1;j++)
			{
				if (*(p1.Substring(i)) == *(p2.Substring(j)))
				{
					t = (p2.Substring(i));
					*(p2.Substring(i)) = *(p2.Substring(j));
					*(p2.Substring(j)) = t;
					break;
				}
			}
			if (j == len1)
			{
				System.out.print("NO");
				break;
			}
		}
		if (i == len1)
		{
			System.out.print("YES");
		}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

