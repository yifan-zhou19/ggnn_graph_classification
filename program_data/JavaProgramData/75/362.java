package <missing>;

public class GlobalMembers
{
	//?????
	//2010?11?24?
	//1000012753 ???
	public static int Main()
	{
		int i;
		int j = 0;
		int k;
		int[] x = new int[2000];
		int[] y = new int[2000];
		int[] count = new int[2000];
		int max;
		String temp = new String(new char[2000]);
		for (i = 0; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = tangible.StringFunctions.changeCharacter(temp, i, System.in.read());
			j++;
			if (temp.charAt(i) == '\n')
			{
				break;
			}
		}
		for (i = 0; i < j ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			temp = tangible.StringFunctions.changeCharacter(temp, i, System.in.read());
			if (temp.charAt(i) == '\n')
			{
				break;
			}
		}
		max = 0;
		for (i = 0; i <= 1000; i++)
		{
			for (k = 0; k < j; k++)
			{
				if (x[k] <= i != 0 && y[k] > i)
				{
					count[i]++;
				}
			}
			if (count[i] > max)
			{
				max = count[i];
			}
		}
		System.out.print(j);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

