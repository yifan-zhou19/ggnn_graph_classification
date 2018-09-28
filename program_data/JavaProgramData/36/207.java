package <missing>;

public class GlobalMembers
{
	public static void sort(String str)
	{
		int i;
		int j;
		char swap;
		for (i = 0;i <= str.length() - 2;i++)
		{
			for (j = 0;j <= str.length() - 2 - i;j++)
			{
				if (str[j].compareTo(str[j + 1]) > 0)
				{
					swap = str[j];
					str[j] = str[j + 1];
					str[j + 1] = swap;
				}
			}
		}
	}
	public static void Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int flag;
		int i;

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
		sort(a);
		sort(b);
		flag = 1;
		for (i = 0;i <= a.length();i++)
		{
			if (a.charAt(i) != b.charAt(i))
			{
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

