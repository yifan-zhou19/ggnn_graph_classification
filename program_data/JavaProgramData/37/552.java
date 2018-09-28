package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String s = new String(new char[1001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			int[] freq = new int[27];
			int flag = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			for (i = 0;i < s.length();i++)
			{
				freq[s.charAt(i) - 97]++;
			}
			for (i = 0;i < s.length();i++)
			{
				if (freq[s.charAt(i) - 97] == 1)
				{
					System.out.printf("%c\n",s.charAt(i));
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

