package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int i;
		int j;
		int k;
		String a = new String(new char[30]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
			k = 0;
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 1;j < l;j++)
			{
				if ((a.charAt(0) == '_' || (a.charAt(0) >= 65 && a.charAt(0) <= 90) || (a.charAt(0) >= 97 && a.charAt(0) <= 122)) && ((a.charAt(j) >= 48 && a.charAt(j) <= 57) || (a.charAt(j) >= 65 && a.charAt(j) <= 90) || (a.charAt(j) >= 97 && a.charAt(j) <= 122) || a.charAt(j) == '_'))
				{
				k = k + 1;
				}
			}
			if (k == l - 1)
			{
				System.out.print("yes\n");
			}
			else if (k < l - 1)
			{
				System.out.print("no\n");
			}
		}
	}

}

