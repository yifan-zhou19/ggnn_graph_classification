package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int total;
		int[] getin = new int[1000];
		int[] getout = new int[1000];
		int i = 0;
		int j = 0;
		char x;
		do
		{
			getin[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j++;
			x = System.in.read();
		}while (x == ',');
		total = j;
		for (j = 0;j < total;j++)
		{
			getout[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x = System.in.read();
		}
		System.out.print(total);
		System.out.print(" ");
		int[] people = new int[2000];
		for (i = 0;i < 2000;i++)
		{
			people[i] = 0;
		}
		for (i = 0;i < 2000;i++)
		{
			for (j = 0;j < total;j++)
			{
				if ((i >= getin[j]) && (i < getout[j]))
				{
					people[i]++;
				}
			}
		}
		int max = 0;
		for (i = 0;i < 2000;i++)
		{
			if (people[i] > max)
			{
				max = people[i];
			}
		}
		System.out.print(max);
		return 0;
	}
}

