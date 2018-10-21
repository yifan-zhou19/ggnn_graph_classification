package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int sum = 0;
		int mark = 0;
		int[] flag = new int[100000];
		String ch = new String(new char[100000]);
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < N;i++)
		{
			mark = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE));
			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;ch.charAt(j) != '\0';j++)
			{
				sum = 1;
				if (flag[j] != 0)
				{
					continue;
				}
				for (k = j + 1;ch.charAt(k) != '\0';k++)
				{
					if (ch.charAt(k) == ch.charAt(j))
					{
						flag[k] = 1,sum++;
					}
				}
				if (sum == 1)
				{
					System.out.print(ch.charAt(j));
					System.out.print("\n",mark = 1);
					break;
				}
			}
			if (mark == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

