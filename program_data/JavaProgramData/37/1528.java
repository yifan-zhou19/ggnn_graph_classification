package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int m;
		int b;
		String a = new String(new char[100000]);
		String c = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			b = 0;
			a = new Scanner(System.in).nextLine();
			for (j = 0;j < a.length();j++)
			{
				s = 0;
				for (k = 0;k < a.length();k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						s++;
					}
				}

				if (s == 1)
				{
					b = 1;
					m = j;
					break;
				}

			}
			if (b == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",a.charAt(m));
			}

		}
		return 0;
	}
}

