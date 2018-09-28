package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //a, b ???,k ???????.l????
		int b = 0;
		int i = 0;
		int k = 0;
		int l = 0;
		char[] n_b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //???????n. n_b[30]??????
		char[] n = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long n_10=0;
		int n_10 = 0; //?????n[30]???
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length(); //???
		i = l; //???????????
		for (k = 0; k < l; k++) //????????????????
		{
			if (n[k] >= 48 && n[k] <= 57 && i >= 1) //??0-9????n[k]-48
			{
				n_10 = n_10 + Math.pow((double)a, (double)(i - 1)) * (n[k] - 48);
			}
			else if (n[k] >= 65 && n[k] <= 90 && i >= 1) //??A-Z??n[k]-55
			{
				n_10 = n_10 + Math.pow((double)a, (double)(i - 1)) * (n[k] - 55);
			}
				 else if (n[k] >= 97 && n[k] <= 122 && i >= 1) //??a-z??n[k]-87
				 {
						 n_10 = n_10 + Math.pow((double)a, (double)(i - 1)) * (n[k] - 87);
				 }
					  else
					  {
						  break;
					  }
			i--;
		}
		if (n_10 == 0) //??????
		{
			System.out.print(0);
		}
		for (k = 0;; k++) //???????b???????????
		{
				 if (n_10 != 0)
				 {
					if (n_10 % b >= 0 && n_10 % b <= 9) //??
					{
						n_b[k] = n_10 % b + 48;
					}
					else if (n_10 % b >= 10 && n_10 % b <= 35)
					{
						n_b[k] = n_10 % b + 55;
					}
					n_10 = n_10 / b; //??
				 }
				else
				{
					break;
				}
		}
		for (i = k - 1; i >= 0; i--) //????
		{
			System.out.print(n_b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

