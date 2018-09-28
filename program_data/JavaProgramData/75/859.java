package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] come = new int[1000];
		int[] leave = new int[1000];
		char comma;
		int i = 0;
		int j = 0;
		int total = 0;
		int together = 0;
		int[] count = new int[1000];
		System.out.print("\n");
		for (i = 0;;i++)
		{
			come[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = System.in.read();
			if (comma == ',')
			{
				continue;
			}
			else if (comma == '\n')
			{
				total = i + 1;
				break;
			}
		}
		for (i = 0;;i++)
		{
			leave[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = System.in.read();
			if (comma == ',')
			{
				continue;
			}
			else if (comma == '\n')
			{
				break;
			}
		}
		for (i = 0;i < total;i++)
		{
			for (j = come[i];j < leave[i];j++)
			{
				count[j]++;
			}
		}
		for (j = 1;j < 1000;j++)
		{
			if (count[j] > together)
			{
				together = count[j];
			}
		}
		System.out.print(total);
		System.out.print(" ");
		System.out.print(together);
		System.out.print("\n");
		return 0;
	}
}

