package <missing>;

public class GlobalMembers
{
	//????????????
	public static int Main()
	{
		String a = new String(new char[100001]); // ??a?????
		int[] count = new int[26]; // ??count????
		int i; // i,j??
		int j;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= t; j++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count, 0, (Integer.SIZE / Byte.SIZE)); // ????????
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				count[a.charAt(i) - 'a']++; // ???????1
			}
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				if (count[a.charAt(i) - 'a'] == 1) // ??????????
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (a.charAt(i) == '\0') // ???????????
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

