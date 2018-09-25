package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int count = 0;
		int flag = 0;
		String word = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			if (count + word.length() + 1 <= 80)
			{
				if (flag == 0)
				{
					System.out.printf("%s",word);
					flag = 1;
					count += word.length();
				}
				else
				{
					System.out.print(" ");
					System.out.printf("%s",word);
					count += word.length() + 1;
				}

			}
			else
			{
				System.out.print("\n");
				System.out.printf("%s",word);
				count = word.length();
			}
		}
		return 0;
	}

}

