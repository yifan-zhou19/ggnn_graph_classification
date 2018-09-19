package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int Max1 = 0;
		int Max2 = 0;
		int Max3 = 0;
		int[] Nb = new int[4];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int Number;
	//		int Chinese;
	//		int Math;
	//		int Total;
	//	}
	//	people[111111];
		for (i = 1 ; i <= N ; i++)
		{
			people[i].Number = ConsoleInput.readToWhiteSpace(true);
			people[i].Chinese = ConsoleInput.readToWhiteSpace(true);
			people[i].Math = ConsoleInput.readToWhiteSpace(true);
			people[i].Total = people[i].Chinese + people[i].Math;
		}
		for (i = 1 ; i <= N ; i++)
		{
			if (Max1 < people[i].Total)
			{
				Nb[1] = i;
				Max1 = people[i].Total;
			}
		}
		for (i = 1 ; i <= N ; i++)
		{
			if ((Max2 < people[i].Total) && (i != Nb[1]))
			{
				Nb[2] = i;
				Max2 = people[i].Total;
			}
		}
		for (i = 1 ; i <= N ; i++)
		{
			if ((Max3 < people[i].Total) && (i != Nb[1]) && (i != Nb[2]))
			{
				Nb[3] = i;
				Max3 = people[i].Total;
			}
		}
		for (i = 1 ; i <= 3 ; i++)
		{
		System.out.print(people[Nb[i]].Number);
		System.out.print(" ");
		System.out.print(people[Nb[i]].Total);
		if (i < 3)
		{
			System.out.print("\n");
		}
		}
		return 0;
	}
}

