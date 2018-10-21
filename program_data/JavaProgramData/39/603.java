package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] fgrade = new int[101];
		int[] cgrade = new int[101];
		int[] lunwen = new int[101];
		int[] jiang = new int[101];
		int max = 0;
		int x;
		int sum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		char[][] name = new char[101][20];
		String ganbu = new String(new char[101]);
		String xibu = new String(new char[101]);
		for (int i = 1;i <= N;i++)
		{
			name[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			fgrade[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cgrade[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ganbu = tangible.StringFunctions.changeCharacter(ganbu, i, ConsoleInput.readToWhiteSpace(true));
			xibu = tangible.StringFunctions.changeCharacter(xibu, i, ConsoleInput.readToWhiteSpace(true));
			lunwen[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		}
		for (int i = 1;i <= N;i++)
		{
			jiang[i] = (fgrade[i] > 80 && lunwen[i] >= 1) * 8000 + (fgrade[i] > 85 && cgrade[i] > 80) * 4000 + (fgrade[i] > 90) * 2000 + (fgrade[i] > 85 && xibu.charAt(i) == 'Y') * 1000 + (cgrade[i] > 80 && ganbu.charAt(i) == 'Y') * 850;
			sum = sum + jiang[i];
			if (max < jiang[i])
			{
				max = jiang[i];
				x = i;
			}
		}
	System.out.print(name[x]);
	System.out.print("\n");
	System.out.print(jiang[x]);
	System.out.print("\n");
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}




}

