package <missing>;

public class GlobalMembers
{
	public static int charnum(char c, String m)
	{
		int len = m.length();
		int i;
		int sum = 0;
			for (i = 0;i < len;i++)
			{
				if (m[i].equals(c))
				{
					sum++;
				}
			}
		return sum;
	}
	public static int Main()
	{
		String zifu = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zifu = tempVar.charAt(0);
		}
		int j;
		int sum;
		int no = 0;
		 for (j = 97;j < 123;j++)
		 {
			sum = charnum((char)j, zifu);
			if (sum != 0)
			{
				System.out.printf("%c=%d\n",j,sum);
				no++;
			}
		 }

		if (no == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

