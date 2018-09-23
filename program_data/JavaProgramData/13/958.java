package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int[] flag = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag, 0, (Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (0 == flag[t])
			{
				flag[t] = 1;
				if (0 == i)
				{
					System.out.print(t);
				}
					 else
					 {
						 System.out.print(" ");
						 System.out.print(t);
					 }
			}
		}
		System.out.print("\n");
		return 0;
	}
}

