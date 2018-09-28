package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t = 0;
		int b;
		String s = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			b = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (Character.isLetter(s.charAt(0)) == 0 && s.charAt(0) != '_')
			{
				b = 1;
			}
			else
			{
				for (j = 0;j < s.length();j++)
				{
					if (Character.isLetterOrDigit(s.charAt(j)) == 0 && s.charAt(j) != '_')
					{
				//	if(ispunct(s[j])!=0||s[j]!='_')
						b = 1;
						break;
					}
				}
			}
			if (b == 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

