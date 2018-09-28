import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************************************************
	//*  ??????? 																	 *
	//*  ????????????????30???????????????????????    *
	//*  ???????					   													 *
	//*  ???2010?12?8?															     *
	//****************************************************************************************
	public static int Main()
	{
		String str = new String(new char[31]); //?????
		int num; //????
		int i;
		int j;
		int p = 0;
		str = new Scanner(System.in).nextLine(); //?????
		num = str.length(); //????????
		for (j = 0; j < num; j++) //???????????????
		{
			if ((*(str.Substring(j)) >= '0') && (*(str.Substring(j)) <= '9'))
			{
			break;
			}
		}
		for (i = j; i < num; i++) //?????????
		{
			if ((*(str.Substring(i)) >= '0') && (*(str.Substring(i)) <= '9'))
			{
				if (p > 0)
				{
					System.out.print("\n");
					p = 0;
				}
				System.out.print((str.Substring(i)));
			}
			else
			{
				p++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
