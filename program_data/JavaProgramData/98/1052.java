package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String pointa;
		pointa = a; //?????????
		int m;
		int i;
		int len;
		int temp = 0;
		int account = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 0)
		{ //???m>0?
			m--; //?????????
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length(); //????
			temp += len; //temp????????
			if (account == 0)
			{ //account????????????????0
				for (i = 0;i < len;i++)
				{
					System.out.print((pointa.Substring(i)));
				}
				account++; //account??
				continue; //????
			}
			if (account > 0)
			{ //?account > 0
			if (temp < 80)
			{ //temp??80?
				System.out.print(' ');
				for (i = 0;i < len;i++)
				{
					System.out.print((pointa.Substring(i)));
				}
				if (temp + 1 == 80)
				{ //??????????????80
					System.out.print("\n");
					account = 0; //account????
					temp = 0; //temp????
				}
				else
				{ //???
				account++; //account????
				temp++; //temp????
				}
			}
			if (temp >= 80)
			{ //?temp????80
				System.out.print("\n");
				for (i = 0;i < len;i++)
				{
					System.out.print((pointa.Substring(i)));
				}
				account = 1; //account??1
				temp = len; //temp???????
			}
			}
		}
		return 0; //?????
	}

}

