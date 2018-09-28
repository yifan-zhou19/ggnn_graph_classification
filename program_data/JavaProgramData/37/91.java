package <missing>;

public class GlobalMembers
{
	/*???????????
	  ???
	  1000010098*/
	public static int Main()
	{
		String a = new String(new char[100001]);
		short[] b = new short[100000];
		int i;
		int t;
		int j;
		int k;
		int len;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= t; k++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length(); //??????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,200000);
			for (i = 0; i < len; i++)
			{
				if (b[i] == -1) //???????????
				{
					continue;
				}
				for (j = i + 1; j < len; j++)
				{
					if (b[j] == -1)
					{
						continue;
					}
					if (a.charAt(j) == a.charAt(i))
					{
						b[j]--; //??????
						b[i]++; //??????????
					}
				}
				if (b[i] == 0) //???????
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (i == len) //??????????
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

