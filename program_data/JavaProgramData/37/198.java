package <missing>;

public class GlobalMembers
{
	public static String b = new String(new char[100001]);
	public static int Main()
	{

		int[] a = new int[26];
		int flag = 0;
		int i;
		int t;
		int j;

		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= t; j++)
		{
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 0; b.charAt(i) != '\0'; i++)
			{
				a[b.charAt(i) - 'a']++;
			}

			flag = 0;
			for (i = 0; b.charAt(i) != '\0'; i++)
			{
				if (a[b.charAt(i) - 'a'] == 1)
				{
					flag = 1;
					System.out.print(b.charAt(i));
					System.out.print("\n");
					break;
				}
			}

			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}




		return 0;
	}
}

