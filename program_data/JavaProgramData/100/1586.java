package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String w = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String a = new String(new char[300]);
		int[] num = new int[52];
		int i;
		int j;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,300);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		for (i = 0;i < 300;i++)
		{
			for (j = 0;j < 52;j++)
			{
				if (a.charAt(i) == w.charAt(j))
				{
					num[j]++;
				}
			}
		}
		for (j = 0;j < 52;j++)
		{
			if (num[j] != 0)
			{
				System.out.printf("%c=%d\n",w.charAt(j),num[j]);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

