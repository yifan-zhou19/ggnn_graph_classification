package <missing>;

public class GlobalMembers
{
	public static void tran(String s)
	{
		int i;
		int j;
		int len;
		char t;
		len = s.length();
		for (i = 0;i < len - 1;i++)
		{
			for (j = i + 1;j < len;j++)
			{
				if (s[i].compareTo(s[j]) > 0)
				{
					t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
	}
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		tran(a);
		tran(b);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}


}

