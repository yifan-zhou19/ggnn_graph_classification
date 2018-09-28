package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arr = new int[1020];
		int[] lea = new int[1020];
		int num = 0;
		int i;
		int j;
		int k;
		for (i = 1; ;i++)
		{
			arr[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
			k = System.in.read();
			if (k == 10)
			{
				break;
			}
		}
		for (i = 1; ;i++)
		{
			lea[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == 10)
			{
				break;
			}
		}

		int[] people = new int[1020];
		for (i = 1; i < 1000; i++)
		{
			people[i] = 0;
		}
		for (i = 1; i <= num; i++)
		{
			for (j = arr[i]; j < lea[i]; j++)
			{
				people[j]++;
			}
		}
		int Max_people = 0;
		for (i = 1; i < 1000; i++)
		{
			if (people[i] > Max_people)
			{
				Max_people = people[i];
			}
		}
		System.out.print(num);
		System.out.print(' ');
		System.out.print(Max_people);
		System.out.print("\n");


		return 0;
	}


}

