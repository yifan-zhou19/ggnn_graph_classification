package <missing>;

public class GlobalMembers
{
	public static int indent(String zfc)
	{
		int i;
		int s = 0;
		int sum = 0;
		String p = zfc;
		if ((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p == '_'))
		{
			for (i = 1;i < zfc.length();i++)
			{
				if ((*(p.Substring(i)) >= 'a' && *(p.Substring(i)) <= 'z') || (*(p.Substring(i)) >= 'A' && *(p.Substring(i)) <= 'Z') || (*(p.Substring(i)) == '_') || (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9'))
				{
				sum++;
				}
			}
		}
		if (sum == zfc.length() - 1)
		{
		s = 1;
		}
		return s;
	}
	public static void Main(String[] args)
	{
		int n;
		int s;
		int i;
		String zfc = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		zfc = new Scanner(System.in).nextLine();
		s = indent(zfc);
		System.out.printf("%d\n",s);
		}
	}
}

