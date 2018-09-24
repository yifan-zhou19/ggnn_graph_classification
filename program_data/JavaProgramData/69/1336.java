package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int[] r = new int[MAX];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(r, 0, (Integer.SIZE / Byte.SIZE));

		String tmp = new String(new char[MAX]);
		int i;
		int len;

		tmp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = tmp.length();
		for (i = 0; i < len; i++)
		{
			a[i] = tmp.charAt(len - 1 - i) - '0';
		}

		tmp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = tmp.length();
		for (i = 0; i < len; i++)
		{
			b[i] = tmp.charAt(len - 1 - i) - '0';
		}

		for (i = 0; i < MAX; i++)
		{
			int br = r[i] + a[i] + b[i];
			if (br < 10)
			{
				r[i] = br;
			}
			else
			{
				r[i] = br - 10;
				r[i + 1] = 1;
			}
		}

		i = MAX - 1;
		while (r[i] == 0 && i > 0)
		{
			i--;
		}

		for (; i >= 0; i--)
		{
			System.out.print(r[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

