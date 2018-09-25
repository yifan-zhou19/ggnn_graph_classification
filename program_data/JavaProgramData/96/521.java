package <missing>;

public class GlobalMembers
{
	//*******************************
	//*???? ??13              **
	//*?  ?????      **
	//*?  ??2011.11.8            **
	//*******************************
	public static int Main()
	{
		String str = new String(new char[100]);
		int r; //r????
		int j;
		int[] num = new int[100];
		r = 0; //???
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (j = 0 ; str.charAt(j) != '\0' ; j++) //????
		{
		   num[j] = (r * 10 + str.charAt(j) - '0') / 13; //???????
		   r = (r * 10 + str.charAt(j) - '0') % 13; //???????
		}
		j = 0; //j???0
		while (num[j] == 0)
		{
			 j++; //???????0??
		}
		if (str.charAt(j) == '\0')
		{
			 System.out.print("0");
		}
		for (; str.charAt(j) != '\0'; j++)
		{
			 System.out.print(num[j]);
		}
			 System.out.print("\n");
			 System.out.print(r);
		return 0;
	}






}

