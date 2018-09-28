package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int sum = 0;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= n)
		{

		int mark = 0; //?7??
		//??7??
		int t = i;
		while (t != 0)
		{
			if (t % 10 == 7)
			{
				mark = 1; //mark=1???7??
			}
			t = t / 10;
		}
		//??7???
		if (i % 7 == 0)
		{
			mark = 1;
		}
		if (mark == 0)
		{
			sum += Math.pow((double)i,2);
		}
		i++;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

