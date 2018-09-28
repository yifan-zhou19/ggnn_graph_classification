package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[5]);
		int i;
		int count;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}

		count = str.length();
		for (i = count - 1; i >= 0; i--)
		{
			System.out.printf("%c", str.charAt(i));
		}


	}
}

