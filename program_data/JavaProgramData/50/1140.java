package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] result = new int[13]; //?result?????13?????
		int sum = 0; //?sum????????k???????
		int w; //??????????
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1;k != 13;k++)
		{
			sum += days[k];
			result[k] = (sum + w) % 7;
		}
		for (int k = 1;k != 13;k++)
		{
			if (result[k] == 5)
			{
				System.out.print(k);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

