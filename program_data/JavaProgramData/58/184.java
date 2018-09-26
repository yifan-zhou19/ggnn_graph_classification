package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????C????????.cpp
	 * ?????
	 * Created on: 2010-11-24
	 * Author: ???
	 */
	public static int Main() //???
	{
		String a = new String(new char[82]); //?????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
		int b; //????
		int i;
		int j;
		int k;
		int m;
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine(); //????????????"\n"
		for (i = 1;i <= b;i++) //B???
		{
			a = new Scanner(System.in).nextLine(); //??
			k = a.length();
			if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')) || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')))
			{
				//?????????????
				for (j = 1,m = 0;j < k;j++)
				{
					if ((a.charAt(j) == '_') || ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z')) || ((a.charAt(j) >= 'a') && (a.charAt(j) <= 'z')) || ((a.charAt(j) >= '0') && (a.charAt(j) <= '9')))
					{
						//?????????????????
						m++; //?????????
					}
				}
				if (m == k - 1) //??????
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}

			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0; //??
	}
}

