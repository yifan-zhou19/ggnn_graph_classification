package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[20]);
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (j = 0;j < n;j++)
		{
			c = new Scanner(System.in).nextLine();
			m = 0;
			if (c.charAt(0) < 65 || (c.charAt(0)>90 && c.charAt(0) < 95) || c.charAt(0) == 96 || c.charAt(0)>122)
			{
				System.out.print("no\n");
			}
			else
			{
				for (i = 1;c.charAt(i) != '\0';i++)
				{
					if (c.charAt(i) < 48 || (c.charAt(i)>57 && c.charAt(i) < 65) || (c.charAt(i)>90 && c.charAt(i) < 95) || c.charAt(i) == 96 || c.charAt(i)>122)
					{
						m = m + 1;
					}
				}
				if (m == 0)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
	}

}

