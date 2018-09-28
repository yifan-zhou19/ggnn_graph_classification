package <missing>;

public class GlobalMembers
{
	public static int[] data = new int[1000];
	public static int comma;

	public static void Main(String[] args)
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(data, data + n);
		for (int i = 0; i < n; i++)
		{
			if (data[i] / 2 * 2 != data[i])
			{
				if (comma != 0)
				{
					System.out.print(",");
				}
				comma = true;
				System.out.print(data[i]);
			}
		}
	}

}

