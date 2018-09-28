package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int sign;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		String a = new String(new char[81]);
		for (i = 1;i <= n;i++)
		{
			a = new Scanner(System.in).nextLine();
			len = a.length();
			sign = 1;
			if (a.charAt(0) != 95 && Character.isLetter(a.charAt(0)) == 0)
			{
				sign = 0;
			}
			for (j = 1;j < len;j++)
			{
				if (Character.isLetterOrDigit(a.charAt(j)) == 0 && a.charAt(j) != 95)
				{
					sign = 0;
				}
			}
			System.out.printf("%d\n",sign);
		}
		return 0;
	}

}

