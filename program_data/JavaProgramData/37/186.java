package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100001]);
		int l;
		int[] count = new int[26];
		int i;
		int j;
		int n;
		int flag;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(count,0,(Integer.SIZE / Byte.SIZE));
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < a.length();j++)
			{
				count[a.charAt(j) - 'a']++;
			}
			for (j = 0;j < a.length();j++)
			{
				if (count[a.charAt(j) - 'a'] == 1)
				{
					flag = 1;
					System.out.print(a.charAt(j));
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

