package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] max = {0, 0};
		int[] min = {100, 0};
		char[][] word = new char[200][100];
		int[] leg = new int[200];
		while (scanf("%s", word[i]) != EOF)
		{
			leg[i] = String.valueOf(word[i]).length();
			if (leg[i] > max[0])
			{
				max[0] = leg[i];
				max[1] = i;
			}
			if (leg[i] < min[0])
			{
				min[0] = leg[i];
				min[1] = i;
			}
			i++;
		}
		System.out.print(word[max[1]]);
		System.out.print("\n");
		System.out.print(word[min[1]]);
		System.out.print("\n");
		return 0;
	}
}
