package <missing>;

public class GlobalMembers
{
	public static char boy;
	public static char girl;
	public static int[] mark = new int[10000];
	public static int currentmark;

	public static void f(int p) //P????????
	{
		char temp;
		if (p == 0) //??????? ????????
		{
			boy = ConsoleInput.readToWhiteSpace(true).charAt(0);
			mark[0] = -1;
			f(1);
		} //?????? ???????
		else
		{
			temp = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (temp != boy)
			{
				girl = temp; //????????????????????
			}


			if (temp == boy) //??????
			{
				mark[p] = p; //???P???????
				currentmark = mark[p]; //???????????????
				f(p + 1); //???????
			}
			else if (temp == girl) //??????
			{
				System.out.print(currentmark);
				System.out.print(" ");
				System.out.print(p);
				System.out.print("\n");
				int i = p;
				while (true)
				{
					if (mark[i] == 0)
					{
						i--; //???????????0
					}
					else
					{
						break;
					}
				}
				mark[i] = 0;
				while (true)
				{
					if (mark[i] == 0)
					{
						i--;
					}
					else
					{
						break;
					}
				}
				currentmark = mark[i]; //????????????
				if (currentmark == -1)
				{
					currentmark = 0;
				}
				if (i >= 0)
				{
					f(p + 1);
				}

			}
		}
	}

	public static int Main()
	{
		f(0);
		return 0;
	}
}

