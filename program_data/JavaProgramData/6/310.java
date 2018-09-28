package <missing>;

public class GlobalMembers
{
	 //******************************//
	 //*     ?????				*//
	 //*     ???1000012711		*//
	 //*     ???????????	*//
	 //*     ???2010.12.08		*//
	 //******************************//
	public static int Main()
	{
		int j; //j????? i???? m,n?????? pointer??
		int i;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pointer = 0;
		int[][] a = new int[100][100];
		int sum = 0;
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < j; i++) //j?????j?
		{
			sum = 0; //?sum??0
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pointer = a; //????????? ??????
			for (; pointer < a + m * n; pointer++) //???? ??
			{
				*pointer = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (pointer = a; pointer < a + m * n; pointer++) //????
			{
				if (pointer >= a && pointer <= a + n - 1) //????????1?? sum????????
				{
					sum += *pointer;
					continue;
				}
				if ((pointer - a) % n == 0) //??1??
				{
					sum += *pointer; //??????
					sum += *(pointer + n - 1); //???????????
					continue;
				} //???? ?????????????
				if (pointer >= a + m * n - n && pointer < a + m * n - 1)
				{
					sum += *pointer; //??????
					continue;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

