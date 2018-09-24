package <missing>;

public class GlobalMembers
{
	//???
	//2010?11?15?
	//1000012753 ???
	public static int Main()
	{
		int n;
		int i;
		int ac;
		int cc;
		int ri;
		int paper;
		int[] bonus = new int[200];
		int max;
		int sum = 0;
		char[][] str = new char[200][200];
		char student;
		char west;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			bonus[i] = 0;
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			ac = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cc = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			student = ConsoleInput.readToWhiteSpace(true).charAt(0);
			west = ConsoleInput.readToWhiteSpace(true).charAt(0);
			paper = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (ac > 80 && paper >= 1)
			{
				bonus[i] += 8000;
			}
			if (ac > 85 && cc > 80)
			{
				bonus[i] += 4000;
			}
			if (ac > 90)
			{
				bonus[i] += 2000;
			}
			if (west == 'Y' && ac > 85)
			{
				bonus[i] += 1000;
			}
			if (cc > 80 && student == 'Y')
			{
				bonus[i] += 850;
			}
			sum += bonus[i];
		}
		max = bonus[1];
		for (i = 2; i <= n; i++)
		{
			if (max < bonus[i])
			{
				max = bonus[i];
				ri = i;
			}
		}
		System.out.print(str[ri]);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

