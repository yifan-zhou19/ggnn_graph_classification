package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int panduan = new int(char s[],int l);
		int n;
		int i;
		int l;
		String s = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			l = s.length();
			if (panduan(s, l) > 0)
			{
			System.out.print("yes\n");
			}
			else
			{
			System.out.print("no\n");
			}
		}
	}
	public static int panduan(String s, int l)
	{
		int j;
		if ((s[0].compareTo('A') < 0) || (s[0].compareTo('Z') > 0 && s[0].compareTo('_') < 0) || (s[0].compareTo('_') > 0 && s[0].compareTo('a') < 0) || (s[0].compareTo('z') > 0))
		{
		return (0);
		}
		else
		{
		for (j = 1;j < l;j++)
		{

		if ((s[j].compareTo('0') < 0) || (s[j].compareTo('9') > 0 && s[j].compareTo('A') < 0) || (s[j].compareTo('Z') > 0 && s[j].compareTo('_') < 0) || (s[j].compareTo('_') > 0 && s[j].compareTo('a') < 0) || (s[j].compareTo('z') > 0))
		{
			return (0);
			break;
		}
		}
		return (1);

		}
	}
}

