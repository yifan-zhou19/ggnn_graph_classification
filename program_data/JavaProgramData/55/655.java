package <missing>;

public class GlobalMembers
{
	public static final int size = 10000; //??????
	public static String inda = new String(new char[size]);
	public static String outda = new String(new char[size]);
	public static int[] indata = new int[size]; //?????????
	public static int t;
	public static int[] ans = new int[2 * size];
	public static int lans;
	public static int[] ddd = new int[size];
	public static int Main() //?????
	{
		int i;
		int j;
		int inbase;
		int outbase;
		int la;
		int ld;
		int[] map = new int[300];
		String rmap = new String(new char[65]);
		for (i = 'A';i <= 'Z';i++)
		{
			map[i] = i - 'A' + 10;
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - 'A' + 10, i);
		} //??????????????????

		for (i = 'a';i <= 'z';i++)
		{
			map[i] = i - 'a' + 10;
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - 'a' + 37, i);
		}
		for (i = '0';i <= '9';i++)
		{
			map[i] = i - '0';
			rmap = tangible.StringFunctions.changeCharacter(rmap, i - '0', i);
		}


			inbase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			inda = ConsoleInput.readToWhiteSpace(true).charAt(0);
			outbase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			la = inda.length();
			lans = 0;
			ld = 0;
			for (i = 0;i < la;i++)
			{
				indata[i] = map[inda.charAt(i)];
			}
			while (true)
			{
				if (la == 1 && indata[0] < outbase)
				{
					ans[lans++] = indata[0];
					break;
				}
				if (inda.charAt(0) == '0')
				{
					System.out.print("0");
					break;
				}
				for (i = 0;i < la - 1;i++) //??????

				{
					ddd[ld++] = indata[i] / outbase;
					t = indata[i] % outbase;
					indata[i + 1] += t * inbase;
				}
				ddd[ld++] = indata[i] / outbase; //????

				ans[lans++] = indata[i] % outbase; //??????????

				for (i = 0;i < ld;i++) //??????0
				{

					if (ddd[i] != 0)
					{
						break;
					}
				}
				for (j = 0;i < ld;i++,j++) //?????????
				{

					indata[j] = ddd[i];
				}
				la = j;
				ld = 0; //?????

			}
			for (i = 0;i < lans;i++) //???????????????????
			{

				outda = tangible.StringFunctions.changeCharacter(outda, i, rmap.charAt(ans[i]));
			}

			 for (i = lans - 1;i >= 0;i--)
			 {
				 System.out.print(outda.charAt(i));
			 }

		  return 0;
	}




}

