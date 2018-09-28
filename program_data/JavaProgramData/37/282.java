package <missing>;

public class GlobalMembers
{
	//????????????
	//???
	//1000062701
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String str = new String(new char[10000]); //?????
		for (i = 0; i < t; i++)
		{
			int[] count = new int[10000]; //????
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				count[str.charAt(j)]++;
			}
			for (k = 0; str.charAt(k) != '\0'; k++)
			{
				if (count[str.charAt(k)] == 1)
				{
					System.out.print(str.charAt(k));
					System.out.print("\n");
					break;
				}
				if (str.charAt(k + 1) == '\0')
				{
					System.out.print("no");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

