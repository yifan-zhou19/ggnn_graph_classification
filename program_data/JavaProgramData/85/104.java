package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m = 0;
		int n;
		int i;
		int j;
		int l;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if ((j == 0 && (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_')) || (j != 0 && (a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_' || a.charAt(j) >= 48 && a.charAt(j) <= 57)))
				{
					   m++;
				}
			}
			if (m != l)
			{
				System.out.print("no\n");
			}
			if (m == l)
			{
				System.out.print("yes\n");
			}
		}
	}


}

