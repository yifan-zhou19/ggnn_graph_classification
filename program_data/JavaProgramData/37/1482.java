package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l;
		int j;
		int k;
		int[] x = new int[100000];
		String a = new String(new char[100000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = a.length();
			for (j = 0;j < l;j++)
			{
				for (k = 0;k < l;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						x[j]++;
					}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (x[j] == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (j == l)
			{
				System.out.print("no");
				System.out.print("\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,100000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(x,0,100000);
		}
		return 0;
	}
}

