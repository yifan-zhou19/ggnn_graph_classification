import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************
	// 1.cpp
	// ??  1200018415
	// 11 15
	//*******************


	public static int Main()
	{
		String str = new String(new char[102]);
		int i = 0;
		int len = 0;
		int count = 0;
		str = new Scanner(System.in).nextLine(); // ?????
		while (i < str.length())
		{

			if (str.charAt(i) != ' ') // ??????
			{
				System.out.print(str.charAt(i));
				count = 0; // ????0
			}
			if (str.charAt(i) == ' ') // ?????
			{
				count++; // ???1
				if (count == 1) // ??????
				{
					System.out.print(str.charAt(i));
				}
			}
			i++;
		}
		System.out.print("\n");

		return 0;
	}


}
