package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String beDiv = new String(new char[101]);
		int i;
		int r;
		int tell;
		int lenth;
		int[] result = new int[101];
		beDiv = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0, r = 0; beDiv.charAt(i) != '\0'; i++)
		{
			r = r * 10 + beDiv.charAt(i) - '0';
			result[i] = r / 13;
			r %= 13;
		}
		lenth = i;
		if ((lenth == 2 && (beDiv.charAt(0) - '0') * 10 + beDiv.charAt(1) - '0' < 13) || lenth == 1)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
					  for (i = 0, tell = 0; i < lenth; i++)
					  {
				if (result[i] != 0)
				{
					tell = 1;
				}
				if (tell != 0)
				{
					System.out.print(result[i]);
				}
					  }
		}
		System.out.print("\n");
		System.out.print(r);
		System.out.print("\n");
		return 0;
	}
}

