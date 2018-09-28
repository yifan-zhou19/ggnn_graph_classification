package <missing>;

public class GlobalMembers
{
	public static String m = new String(new char[100002]);
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			int[] b = new int[28];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = tempVar.charAt(0);
			}
			int len = m.length();
			for (int j = 0;j < len;j++)
			{
				b[m.charAt(j) - 'a']++;
			}
			int f = 0;
			for (int j = 0;j < len;j++)
			{
				if (b[m.charAt(j) - 'a'] == 1)
				{
					f++;
					System.out.print(m.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (f <= 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

