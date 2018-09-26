package <missing>;

public class GlobalMembers
{
	//********************
	//****??????****
	//**?? 1100012915***
	//*******12.13********
	//********************
	public static int Main()
	{
		int n; //n????i????????person1?2?????????
		int i;
		int person1;
		int person2;
		int[][] know = new int[10000][2]; //???? ???????????????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int flag = 0; //???????????
		p = know[0][0]; //??p = know???...??????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			person1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			person2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((person1 == 0) && (person2 == 0))
			{
				break; //??�0 0�?????
			}
			*(p + person1 * 2) = *(p + person1 * 2) + 1; //???????
			*(p + person2 * 2 + 1) = *(p + person2 * 2 + 1) + 1; //??ta?????
		}
		for (i = 0 ; i <= n - 1 ; i++)
		{
			if ((*(p + i * 2) == 0) && (*(p + i * 2 + 1) == n - 1))
			{
				System.out.print(i);
				flag = 1; //???????
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

