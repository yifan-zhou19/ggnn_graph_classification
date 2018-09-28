package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100]; //????a
		for (int i = 0 ; i < n ; i++) //????a
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = n - 1 ; j >= 0 ; j--) //??????a
		{
			if (j != 0)
			{
			System.out.print(a[j]);
			System.out.print(" ");
			}
			if (j == 0)
			{
			System.out.print(a[j]);
			System.out.print("\n");
			}
		}
		return 0; //???????????????????
	}








}

