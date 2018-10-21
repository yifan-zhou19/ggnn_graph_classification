package <missing>;

public class GlobalMembers
{
	/************************************
	1.cpp
	???Nov 2, 2011
	??(10-3) ????? (2723)
	?? 1100012886
	************************************/

	public static int Main()
	{
		int i; //???12????
		int w;
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		w = w - 1; //????????????~????????w=0~6
		w = (w + 12) % 7; //???1?13????
		if (w == 4)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		for (i = 0; i <= 10; i++)
		{
			w = (w + day[i]) % 7; //??(i+2)?13????
			if (w == 4)
			{
				System.out.print(i + 2);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

