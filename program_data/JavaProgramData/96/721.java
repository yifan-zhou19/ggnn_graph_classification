package <missing>;

public class GlobalMembers
{
	//***********************
	//*?????? **
	//*???3.cpp **
	//*???2012.11.13**
	//***********************
	public static int Main()
	{
		String a = new String(new char[101]); //??????????????
		int[] b = new int[101];
		int i = 0;
		int r;
		int[] c = new int[100];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = a.length(); //??????????
		while (a.charAt(i) != '\0') //????????
		{
			b[i] = a.charAt(i) - '0';
			i++;
		}
		r = b[0]; //???r????????
		if (n <= 2 && (b[0] * (n - 1) * 10 + b[1]) < 13) //???????13
		{
			System.out.print("0");
			System.out.print("\n");
			for (i = 0; i < n; i++)
			{
				System.out.print(b[i]);
			}
		}
		else
		{
			for (i = 1; i < n; i++)
			{
				c[i] = (r * 10 + b[i]) / 13; //???
				if (c[i] == 0 && i == 1) //??????????0??????
				{
					i++;
					c[i] = (r * 100 + b[1] * 10 + b[i]) / 13;
					r = (r * 100 + b[1] * 10 + b[i]) % 13;
				}
				else //????0????
				{
					r = (r * 10 + b[i]) % 13;
				}
			}
			if (c[1] == 0) //????????0???0?????
			{
				for (i = 2; i < n; i++)
				{
					System.out.print(c[i]);
				}
			}
			else
			{
				for (i = 1; i < n; i++)
				{
					System.out.print(c[i]);
				}
			}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}









}

