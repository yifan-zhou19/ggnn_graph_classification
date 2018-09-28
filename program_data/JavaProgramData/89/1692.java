package <missing>;

public class GlobalMembers
{
	public static int[] outd = new int[100000];
	public static int[] ind = new int[100000];
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(outd,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ind,0,(Integer.SIZE / Byte.SIZE));
		while (scanf("%d%d", a, b) != EOF)
		{
			if (a == 0 && b == 0)
			{
				break;
			}
			outd[a]++,ind[b]++;
		}
		int flag = 0;
		for (int i = 0;i < n;i++)
		{
			if (ind[i] == n - 1 && outd[i] == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return (0);
	}


}

