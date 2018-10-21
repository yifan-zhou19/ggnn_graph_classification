import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]); //???????
		String p;
		p = str; //???????
		str = new Scanner(System.in).nextLine(); //?????
		for (int j = 0; * (p.Substring(j)) != '\0';j++) //??????????????
		{
			if (*(p.Substring(j)) >= 48 && *(p.Substring(j)) <= 57) //?????????
			{
				System.out.print((p.Substring(j)));
			}
			else if ((*(p.Substring(j) - 1) >= 48 && *(p.Substring(j) - 1) <= 57) && !(*(p.Substring(j)) >= 48 && *(p.Substring(j)) <= 57)) //???????????????????
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}
