package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//* ??? ????? .cpp                                               *
	//* ?? ????                                                        *
	//* ???? ?2010?11?26?                                            *
	//************************************************************************
	public static int Main()
	{
		int n;
		int i;
		int f = 0;
		int[] count = new int[50000];
		int cel = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct question
	//	{
	//		int love;
	//		int beloved;
	//	}
	//	ques[50000];
		for (i = 0 ; ; i++)
		{
			ques[i].love = ConsoleInput.readToWhiteSpace(true);
			ques[i].beloved = ConsoleInput.readToWhiteSpace(true);
			if (ques[i].love == 0 && ques[i].beloved == 0)
			{
				break;
			}
			count[ques[i].beloved]++;
			f++;
		}
		for (i = 0 ; i < n ; i++)
		{
			if (count[i] == n - 1)
			{
				cel = i;
				break;
			}
		}
		if (cel == -1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
			return 0;
		}
		for (i = 0 ; i < f ; i++)
		{
			if (ques[i].love == cel)
			{
				break;
			}
		}
		if (i == f)
		{
			System.out.print(cel);
			System.out.print("\n");
		}
		else
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

