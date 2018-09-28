package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[] alp = new int[26];
		int flag = 0;
		String a = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < t; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(alp, 0, (Integer.SIZE / Byte.SIZE));
			for (int j = 0; j < a.length(); j++)
			{
				alp[a.charAt(j) - 'a']++;
			}
			for (int k = 0; k < a.length(); k++)
			{
				if (alp[a.charAt(k) - 'a'] == 1)
				{
					System.out.print(a.charAt(k));
					System.out.print("\n");
					flag = 1;
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

