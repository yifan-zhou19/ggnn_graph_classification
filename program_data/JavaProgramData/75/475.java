package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n = 0;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1001];
		char comma;
		int max = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));

		while ((a[n++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			comma = System.in.read();
			if (comma != ',')
			{
				break;
			}
		}

		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i < n - 1)
			{
				System.in.read();
			}

			for (j = a[i];j < b[i];j++)
			{
				c[j]++;
				if (c[j] > max)
				{
					max = c[j];
				}
			}
		}

		System.out.print(n);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;


	}
}

