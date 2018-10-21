package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] t = new int[1000];
		int i;
		int j;
		int count;
		int maxNum = 0;
		i = 0;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		} while (System.in.read() != '\n');
		count = i;
		i = 0;
		do
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			System.in.read();
		} while (i < count);
		for (i = 0; i < count; i++)
		{
			for (j = a[i]; j < b[i]; j++)
			{
				t[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (t[i] > maxNum)
			{
				maxNum = t[i];
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(maxNum);
		return 0;
	}

}

