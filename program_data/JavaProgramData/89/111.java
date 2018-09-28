package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10010];
		int[] b = new int[10010];
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		while (p != 0 || q != 0)
		{
			a[p]++;
			b[q]++;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int i;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				continue;
			}
			else
			{
				if (b[i] == n - 1)
				{
					System.out.print(i);
					System.out.print("\n");
				}
				break;
			}
		}
		return 0;
	}
}

