package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int l;
		int i;
		String c = new String(new char[10]);
		String str = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,0,(Character.SIZE / Byte.SIZE));
			str = new Scanner(System.in).nextLine();
			l = str.length();
			for (i = 0;i < l;i++)
			{
				switch (str.charAt(i))
				{
				case'A':
				System.out.print("T");
				break;
				case'T':
				System.out.print("A");
				break;
				case'C':
				System.out.print("G");
				break;
				case'G':
				System.out.print("C");
				break;
				}
			}
			System.out.print("\n");
		}
	}

}

