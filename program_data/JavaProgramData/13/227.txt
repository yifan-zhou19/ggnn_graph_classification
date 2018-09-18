package <missing>;

public class GlobalMembers
{
	//**********************************************
	//**???????????**********************
	//**?????? 1000012741*********************
	//**???2010?10?29?************************
	//**********************************************
	public static int Main() //?????
	{
			int[] a = new int[20000]; //????a???????????n
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0; i < n; i++) //??????
			{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			System.out.print(a[0]);
			for (int t = 1; t < n; t++) //??????
			{
					int k = 0; //?k???
					for (; k < t; k++) //??????
					{
							if (a[t] == a[k])
							{
								break; //????????????
							}
					}
							if (k == t) //???????????
							{
									System.out.printf("%3d", a[t]);
							}
			}
			return 0; //?????
	}
	//**********************************************
}

