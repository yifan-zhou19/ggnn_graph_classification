package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100000]);
		int i;
		int j;
		int t;
		int k;
		int c;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			for (j = 0;j < l;j++)
			{
				c = 0;
				for (k = 0;k < l;k++)
				{
					if ((j != k) && (a.charAt(j) == a.charAt(k)))
					{
						c = 1;
						break;
					}
				}
				if (c == 0)
				{
					System.out.printf("%c\n",a.charAt(j));
					break;
				}
				if ((j == l - 1) && (c == 1))
				{
					System.out.print("no\n");
				}
			}
		}
	}


}

