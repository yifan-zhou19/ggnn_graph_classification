package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		char ch;
		int a;
		int n;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		while (i++<n)
		{
			str = new Scanner(System.in).nextLine();
			a = str.length();
			if (str.charAt(0) == 'A')
			{
					System.out.print("T");
			}
				else if (str.charAt(0) == 'C')
				{
					System.out.print("G");
				}
				else if (str.charAt(0) == 'G')
				{
					System.out.print("C");
				}
				else if (str.charAt(0) == 'T')
				{
					System.out.print("A");
				}
			while (j++<a)
			{
				if (str.charAt(j) == 'A')
				{
					System.out.print("T");
				}
				else if (str.charAt(j) == 'C')
				{
					System.out.print("G");
				}
				else if (str.charAt(j) == 'G')
				{
					System.out.print("C");
				}
				else if (str.charAt(j) == 'T')
				{
					System.out.print("A");
				}
			}
			System.out.print("\n");
			j = 0;
		}
	}
}

