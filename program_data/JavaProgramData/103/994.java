package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int length = 1;
		int i;
		int len;
		char q;
		String data = new String(new char[1000]);
		data = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = data.length();
		for (i = 0; i < len;)
		{
			q = data.charAt(i);
			if (data.charAt(i) > 96)
			{
				q -= 32;
			}
			length = 0;
			do
			{
				length++;
			}while (data.charAt(i + length) == q || data.charAt(i + length) == q + 32);
			System.out.print("(");
			System.out.print(q);
			System.out.print(",");
			System.out.print(length);
			System.out.print(")");
			i += length;
		}
		System.out.print("\n");
		return 0;
	}
}

