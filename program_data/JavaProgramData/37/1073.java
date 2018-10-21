package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int len;
		int d;
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (d = 0;d < t;d++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (i = 0;i < len;i++)
			{
				for (j = 0;j < len;j++)
				{
					if (i == j)
					{

						continue;
					}
					else if (str.charAt(i) == str.charAt(j))
					{
						break;
					}
				}
				if (j >= len)
				{
					System.out.printf("%c\n",str.charAt(i));
					break;
				}
			}
			if (i >= len)
			{
				System.out.print("no\n");
			}
		}
	}


}

