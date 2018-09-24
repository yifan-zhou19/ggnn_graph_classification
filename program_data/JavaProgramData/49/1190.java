package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int a;
		int t;
		int i = 0;
		int j = 0;
		int k = 2;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		a = str.length();
		for (k = 2;k <= a;k++)
		{
			for (i = 0;i < a;i++)
			{
				flag = 1;
				j = i;
				for (j = i;j <= i + k - 1;j++)
				{
					if (str.charAt(j) != str.charAt(2 * i - j + k - 1))
					{
						flag = 0;
					}

				}
				if (flag == 1)
				{
					t = i;
				   for (t = i;t <= i + k - 1;t++)
				   {
					   System.out.printf("%c",str.charAt(t));
				   }
				   System.out.print("\n");

				}
			}
		}
		return 0;
	}
}

