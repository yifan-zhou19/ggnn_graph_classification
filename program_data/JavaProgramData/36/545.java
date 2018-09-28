package <missing>;

public class GlobalMembers
{
	public static int f(String a, String b)
	{
		int l1;
		int l2;
		int i;
		int j;
		char q;
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			return (0);
		}
		for (i = 0;i <= l1;i++)
		{
			for (j = i;j <= l2;j++)
			{
			if (a[i].equals(b[j]))
			{
			q = b[j];
			b[j] = b[i];
			b[i] = q;
			break;
			}
			}
		if (!a[i].equals(b[i]))
		{
			return (0);
		}
		}
		return (1);
	}
	public static void Main()
	{
		String str = new String(new char[20]);
		String str1 = new String(new char[20]);
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		c = f(str, str1);
		if (c == 1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

