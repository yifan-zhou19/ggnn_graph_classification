package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*  ????1000012846_1.cpp *********************************
	//*  ????? ***********************************************
	//*  ?????2010?11? *************************************
	//*  ????????? ***************************************
	//*************************************************************
	public static void o(String a, int m, int n) //?????????????????????
	{
		int p = m; //????
		int q = n;
		for (; ;)
		{
			if (!a[m + 1].equals(a[n - 1]))
			{
				break;
			}
			if (n - m <= 2)
			{
				for (int i = p ; i <= q ; i++)
				{
					System.out.print(a[i]);
				}
				System.out.print("\n");
				break;
			}
			m++;
			n--;
		}
	}
	public static int Main()
	{
		String a = new String(new char[500]); //??????i,j,k;????len;
		char i;
		char j;
		char k;
		char len;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		for (k = 1 ; k < len ; k++)
		{
			for (i = 0 ; i < len ; i++)
			{
				for (j = i + 1 ; j < len ; j++)
				{
					if (a.charAt(i) == a.charAt(j) && j - i == k)
					{
						o(a, i, j); //????o()
					}
				}
			}
		}
		return 0;
	}
}

