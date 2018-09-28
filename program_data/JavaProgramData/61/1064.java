package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[21];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 1) //?????1
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (a[i] == 2) //?????1
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (a[i] >= 3)
			{ //??????????
				int a1 = 1;
				int a2 = 1;
				int a3 = 0;
			  for (int j = 3;j <= a[i];j++)
			  {
				a3 = a1 + a2;
				 a1 = a2;
				 a2 = a3;
			  } //????????2?????

			System.out.print(a3);
			System.out.print("\n");
			}
		}

		return 0;
	}

}

