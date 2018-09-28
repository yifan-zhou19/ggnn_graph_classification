package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String s = new String(new char[256]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			len = s.length();
			for (int j = 0;j < len;j++)
			{
				if (s.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				if (s.charAt(j) == 'T')
				{
					System.out.print("A");
				}
				if (s.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				if (s.charAt(j) == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}
	}
}

