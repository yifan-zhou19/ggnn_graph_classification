package <missing>;

public class GlobalMembers
{
	public static int biaozhi(String a)
	{
		int l;
		int i;
		String p;
		p = a;
		if ((a[0].compareTo('z') <= 0 && a[0].compareTo('a') >= 0) || (a[0].compareTo('Z') <= 0 && a[0].compareTo('A') >= 0) || a[0].equals('_'))
		{
			for (i = 1;i < a.length();i++)
			{
				if ((*(p.Substring(i)) <= 'z' && *(p.Substring(i)) >= 'a') || (*(p.Substring(i)) <= 'Z' && *(p.Substring(i)) >= 'A') || *(p.Substring(i)) == '_' || (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9'))
				{
					l = 1;
				}
				else
				{
					l = 0;
					break;
				}
			}
			return l;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[85]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			if (biaozhi(a) != 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}

}

