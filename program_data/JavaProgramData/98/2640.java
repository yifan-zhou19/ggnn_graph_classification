package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		String word = new String(new char[41]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			if (m == 0)
			{
				System.out.printf("%s",word);
				m = m + word.length();
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					word = tempVar3.charAt(0);
				}
			}
			else
			{
				if (m + word.length() + 1 > 80)
				{
					System.out.print("\n");
					m = 0;
					i--;
				}
				else
				{
					System.out.printf(" %s",word);
					m = m + word.length() + 1;
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						word = tempVar4.charAt(0);
					}
				}
			}
		}
		return 0;
	}


}

