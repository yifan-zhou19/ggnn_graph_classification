package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int s;
		int i;
		int[] c = new int[1000];
		int max;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char d;
		for (i = 1;i < 1000;i++)
		{
			if (cin.peek() == ',')
			{
				d = ConsoleInput.readToWhiteSpace(true).charAt(0);
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				break;
			}
		}
		s = i - 1;
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < 1000;i++)
		{
				if (cin.peek() == ',')
				{
					d = ConsoleInput.readToWhiteSpace(true).charAt(0);
					b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				else
				{
					break;
				}
		}
		for (i = 0;i <= s;i++)
		{
			for (int j = a[i];j < b[i];j++)
			{
				c[j]++;
			}
		}
		max = c[0];
		for (i = 1;i < 1000;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.print(s + 1);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}
}

