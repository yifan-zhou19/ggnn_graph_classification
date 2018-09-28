package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] tim = new int[1000];
		int i;
		int j;
		int num;
		int mac = 0;
		int[] star = new int[1000];
		int[] end = new int[1000];
		for (i = 0; i < 1000; i++)
		{
			tim[i] = 0;
		}
		star[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 1;
		while (System.in.read() != '\n')
		{
			star[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = i;
		end[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < num; i++)
		{
			System.in.read();
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < num; i++)
		{
			for (j = star[i]; j < end[i]; j++)
			{
				tim[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			mac = mac > tim[i] != 0 ? mac : tim[i];
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(mac);
		System.out.print("\n");
		return 0;
	}
}

