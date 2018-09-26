package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int a;
		String s = new String(new char[100]);
		int[] sz = new int[1000];
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = '_';
		for (int a = 0;a < n;a++)
		{
			sz[a] = 0;
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if ((s.charAt(0) >= '0') && (s.charAt(0) <= '9'))
				{
					sz[i] = 1;
					break;
				}
				if (((s.charAt(j) >= '0') && (s.charAt(j) <= '9')) || ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z')) || ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z')) || (s.charAt(j) == x))
				{
				continue;
				}
				else
				{
					sz[i] = 1;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 1)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

