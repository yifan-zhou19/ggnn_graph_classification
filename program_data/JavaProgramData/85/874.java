package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sign = new String(new char[L + 1]);
		int n;
		int len;
		int i;
		int j;
		int t = 1;
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
				sign = tempVar2.charAt(0);
			}
			len = sign.length();
			if (sign.charAt(0) >= '0' && sign.charAt(0) <= '9')
			{
				System.out.print("no\n");
				t = 0;
			}
			if (t == 1)
			{
				for (j = 0;j < len;j++)
				{
					if (!(sign.charAt(j) == '_' || sign.charAt(j) >= '0' && sign.charAt(j) <= '9' || sign.charAt(j) >= 'a' && sign.charAt(j) <= 'z' || sign.charAt(j) >= 'A' && sign.charAt(j) <= 'Z'))
					{
						System.out.print("no\n");
						break;
					}
				}
				if (j == len)
				{
					System.out.print("yes\n");
				}
			}
			t = 1;
		}
	return 0;
	}

}

