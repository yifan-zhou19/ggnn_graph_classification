package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int length;
		String a = new String(new char[100005]);
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= t;i++)
		{
			a = new Scanner(System.in).nextLine();
			length = a.length();
			for (j = 0;j < length;j++)
			{
				l = 0;
				for (k = 0;k < length;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						l += 1;
					}
					if (l == 2)
					{
						break;
					}
				}
				if (l == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
				if (j == length - 1 && l == 2)
				{
					System.out.print("no\n");
				}

			}

		}

		return 0;
	}

}

