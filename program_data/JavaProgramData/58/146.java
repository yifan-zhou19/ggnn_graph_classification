package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
			int k;
				String a = new String(new char[81]);
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				System.in.read();
		for (int i = 0;i < n;i++)
		{
			k = 1;
			a = new Scanner(System.in).nextLine();
			if (a.charAt(0) <= '9' && a.charAt(0) >= '0')
			{
				System.out.printf("%d\n",k - 1);
				continue;
			}
			for (int j = 0;a.charAt(j) != '\0';j++)
			{
				if ((a.charAt(j) <= 'z' && a.charAt(j) >= 'a') || (a.charAt(j) <= 'Z' && a.charAt(j) >= 'A') || (a.charAt(j) == '_') || (a.charAt(j) <= '9' && a.charAt(j) >= '0'))
				{
				}
				else
				{
					k--;
					System.out.printf("%d\n",k);
					break;
				}

			}
			if (k == 1)
			{
			System.out.printf("%d\n",k);
			}
		}
		return 0;
	}

}

