package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[300]);
		final String max = "";
		final String min = "aaaaaaaaaaaaaaa";
		int length;
		int len;
		int sho;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				String = tempVar;
			}
			length = String.length();
			len = max.length();
			sho = min.length();
			if (length > len)
			{
				max = String;
			}
			if (length < sho)
			{
				min = String;
			}
		}while (System.in.read() != '\n');
		System.out.println(max);
		System.out.println(min);
	}
}

