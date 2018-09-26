package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[200]);
		int n;
		int i;
		int j;
		int m;
		int k;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			 a = new Scanner(System.in).nextLine();

					  m = a.length();
			flag = 1;
					  k = 0;
			for (j = 0;j < m;j++)
			{
				if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
				{
					k++;
				}
				if (a.charAt(j) >= 'A' && a.charAt(j) <= 'Z')
				{
					k++;
				}
				if (a.charAt(j) == '_')
				{
					k++;
				}
				if (a.charAt(j) >= '0' && a.charAt(j) <= '9')
				{
					k++;
				}
							else
							{
								k = k;
							}
			}
			if (k != m)
			{
				flag = 0;
			}
			if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			{
				flag = 0;
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			else if (flag == 1)
			{
				System.out.print("yes\n");
			}
		}
	}
}

