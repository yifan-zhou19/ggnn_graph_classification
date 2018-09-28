package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       
	//*?????? 1100012789      
	//*???2011.11.11                       
	//****************************************


	// ???? a?????? totLen??? cheLen????????????
	public static void check(String a, int totLen, int cheLen)
	{
		int i; // flag??????????
		int flag;
		int j;
		if (cheLen > totLen) // ??????
		{
			return;
		}
		for (i = 0; i <= totLen - cheLen; i++)
		{
			flag = 1;
			for (j = 1; j <= cheLen / 2; j++) // ???????
			{
				if (!a[i + j - 1].equals(a[i + cheLen - j])) // ????????
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				for (j = 0; j < cheLen; j++) // ????
				{
					System.out.print(a[j + i]);
				}
				System.out.print("\n");
			}
		}
		check(a, totLen, cheLen + 1); // ????
	}
	public static int Main()
	{
		final String a = "";
		int totLen;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		totLen = a.length();
		check(a, totLen, 2); // ???????
		return 0;
	}
}

