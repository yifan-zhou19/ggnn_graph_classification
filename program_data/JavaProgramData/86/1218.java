package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num;
	int m;
	int i;
	int[] time = new int[21];
	int[] count = new int[21];
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while ((m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
		if (m == 0) //????m?1
		{
			System.out.print(60);
			System.out.print("\n");
		}
		else if (m == 1)
		{
		time[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (time[1] <= 57)
		{
			System.out.print(57);
			System.out.print("\n");
		}
		else if (time[1] > 60)
		{
			System.out.print(60);
			System.out.print("\n");
		}
		else
		{
			System.out.print(time[1]);
			System.out.print("\n");
		}
		}
		else
		{
		 for (i = 1;i <= m;i++)
		 {
			 count[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 time[i] = count[i] + 3 * i;
		 }
		 if (time[m] < 60)
		 {
		 System.out.print(60 - 3 * m);
		 System.out.print("\n");

		 }
		 else
		 {
		 i = 1;
		 while (i <= m)
		 {
		 if (time[i] >= 60)
		 {
		 if (60 - time[i - 1] > count[i] - count[i - 1])
		 {
			 System.out.print(count[i]);
			 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print(60 - time[i - 1] + count[i - 1]);
			 System.out.print("\n");
		 }
		 break;
		 }
		 else
		 {
			 i++;
		 }

		 }
		 }


		}
	}
	return 0;

	}


}

