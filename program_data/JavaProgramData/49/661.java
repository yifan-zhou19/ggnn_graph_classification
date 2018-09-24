package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int l = s.length();
		int i;
		int j;
		int k;
		int hw;
		for (i = 2;i <= l;i++) //???
		{
			if (i % 2 == 0) //????????
			{
				for (j = i / 2 - 1;j < l - i / 2;j++) //?????
				{
					hw = 1; //?????
					for (k = 1;k <= i / 2;k++)
					{
						if (s.charAt(j - k + 1) != s.charAt(j + k))
						{
							hw = 0;
							break;
						}
					}
					if (hw == 1)
					{
						for (k = j - i / 2 + 1;k <= j + i / 2;k++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
			else
			{
			if (i % 2 == 1) //bug1???????????
			{
				for (j = i / 2;j < l - i / 2 - 1;j++)
				{ //debug??????????????��
					hw = 1;
					for (k = 1;k <= i / 2;k++)
					{
						if (s.charAt(j - k) != s.charAt(j + k))
						{
							hw = 0;
							break;
						}
					}
					if (hw == 1) //????????????
					{
						for (k = j - i / 2;k <= j + i / 2;j++)
						{
							System.out.printf("%c",s.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
			}
		}
		return 0;
	}

}

