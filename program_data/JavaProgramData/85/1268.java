package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			j = 0;
			k = 0;
			while (a.charAt(j) != 0)
			{
				if (j == 0 && (a.charAt(j) != '_') && (a.charAt(j) < 'A' || a.charAt(j)>'Z') && (a.charAt(j) < 'a' || a.charAt(j)>'z'))
				{
					k = 1;
					break;
				}
				if (j != 0 && (a.charAt(j) != '_') && (a.charAt(j) < 'A' || a.charAt(j)>'Z') && (a.charAt(j) < 'a' || a.charAt(j)>'z') && (a.charAt(j) < '0' || a.charAt(j)>'9'))
				{
					k = 1;
					break;
				}
				j++;
			}
			if (k != 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

