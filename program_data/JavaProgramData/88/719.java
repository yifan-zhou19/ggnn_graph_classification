import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: get_numbers.cpp
	 *??: ???
	 *????: 2012-12-09
	 *??: ?????????
	 */



	public static int Main()
	{
		String str = new String(new char[MAXL + 10]); //???
		int nNumbers = 0; //????

		str = new Scanner(System.in).nextLine();
		for (char * p = str;;p++)
		{
			if (p >= '0' && p <= '9')
			{ //???????????
				System.out.print(p);
				nNumbers++;
			}
			else if (nNumbers != 0 && *(p - 1) >= '0' && *(p - 1) <= '9') //???????????
			{
				System.out.print("\n");
			}
			if (p == null)
			{
				break; //??\0,????
			}
		}
		return 0;
	}


}
