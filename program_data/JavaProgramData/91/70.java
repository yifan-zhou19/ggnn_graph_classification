package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String data = new String(new char[101]);
		String output = new String(new char[101]);
		data = new Scanner(System.in).nextLine();
		int len = data.length();
		int i;

		for (i = 0; i <= len - 2; i++)
		{
			  *(output.Substring(i)) = *(data.Substring(i)) + *(data.Substring(i) + 1);
		}

		*(output.Substring(len) - 1) = *(data.Substring(len) - 1) + *data;
		*(output.Substring(len)) = '\0';
		System.out.println(output);

		return 0;
	}


}
