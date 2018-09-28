package <missing>;

public class GlobalMembers
{
	/*
	     ????????
	     ??????
	     ???2010-12-29
	*/
	public static int Main()
	{
		String c = new String(new char[1000]);
		int num = 0; //flag[]?????????
		int i;
		int j;
		int max = 1;
		int[] flag = new int[1000];
		int[] x = new int[1000]; //?????????
		int[] y = new int[1000];
		for (i = 0; c.charAt(i - 1) != '\n'; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read()); //???????????
		}
		num = i;
		for (i = 0; c.charAt(i - 1) != '\n'; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = tangible.StringFunctions.changeCharacter(c, i, System.in.read());
		}
		for (i = 0; i < num; i++)
		{
			for (j = x[i]; j < y[i]; j++)
			{
				flag[j]++;
			}
		}
		for (i = 0; i < 1000; i++)
		{
			if (flag[i] > max)
			{
				max = flag[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

