package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int m;
		int n;
		int l;
		int count;
		String a = new String(new char[100000]);
		String temp = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= t;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			count = 0;
			for (m = 0;m < l;m++)
			{
				temp = temp.substring(0, m);
				for (n = 0;n < l;n++)
				{
					if (*(a.Substring(m)) == *(a.Substring(n)))
					{
						temp.charAt(m)++;
					}
				}
				if (temp.charAt(m) == 1)
				{
					System.out.printf("%c\n",*(a.Substring(m)));
					break;
				}
				else
				{
					count++;
				}
			}
			if (count == l)
			{
				System.out.print("no\n");
			}

		}
		return 0;
	}










}

