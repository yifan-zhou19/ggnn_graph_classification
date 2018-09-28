package <missing>;

public class GlobalMembers
{
	//***************************
	//* @author ??          **
	//* @date 2012-09-26       ** 
	//* @description ??357????   **
	//***************************
	public static int Main() //?????
	{
		int n; //????
		int x;
		int y;
		int z;
		//cout << "??????" << endl;  //??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = n % 3;
		y = n % 5;
		z = n % 7;
		if (x == 0) //????
		{
			System.out.print(3);
		}
		if (y == 0) //????
		{
			if (x == 0)
			{
			System.out.print(" ");
			System.out.print(5);
			}
			else
			{
				System.out.print(5);
			}
		}
		if (z == 0) //????
		{
			if (x == 0 || y == 0)
			{
				System.out.print(" ");
				System.out.print(7);
				System.out.print("\n");
			}
			else
			{
			System.out.print(7);
			System.out.print("\n");
			}
		}
		if (x != 0 & y != 0 & z != 0) //????
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0; //?????
	}

}

