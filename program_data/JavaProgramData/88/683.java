package <missing>;

public class GlobalMembers
{
	/*
	 * ???8.cpp
	 * Created on: 2012-12-12
	 * Author: ???
	 * ??:????
	 */
	public static int Main()
	{
		String str = new String(new char[40]); //??????
		str = new Scanner(System.in).nextLine(); //?????
		String p = str; //????
		int len; //????
		int i;
		int k = 0;
		len = str.length(); //????
		if (len == 1)
		{
			if (*(p.Substring(0)) >= '0' && *(p.Substring(0)) <= '9')
			{
				System.out.print((p.Substring(0)));
			}
		}
		for (i = 0;i < len - 1;i++) //????
		{
			if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9') //??????? ???
			{
				System.out.print((p.Substring(i)));
				k = 1;
				 if (*(p.Substring(i) + 1) < '0' || *(p.Substring(i) + 1)>'9') //??????? ???
				 {
					 System.out.print("\n");
					 k = 0;
				 }
			}
		}
		if (k == 1) //???????????
		{
			System.out.print((p.Substring(len) - 1));
			System.out.print("\n");
		}
		else if (*(p.Substring(len) - 1) >= '0' && *(p.Substring(len) - 1) <= '9')
		{
			System.out.print((p.Substring(len) - 1));
		}
	 return 0; //????
	}
}
