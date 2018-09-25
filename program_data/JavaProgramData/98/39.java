package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[500][41];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		int count = -1;
		for (i = 0;i < n;i++)
		{
			count += String.valueOf(s[i]).length() + 1;
			if ((count - String.valueOf(s[i]).length() - 1) == -1)
			{
							System.out.printf("%s",s[i]);
							continue;
			}
			else if (count > 0 && count <= 80)
			{
				System.out.printf(" %s",s[i]);
			}
			else if (count > 80)
			{
				count = -1;
				i--;
				System.out.print("\n");
			}


		}

		return 0;
	}


}

