package <missing>;

public class GlobalMembers
{
	//*******************************************************************
	//*??????????????? ***********************************
	//*??????? 1200012979 ****************************************
	//*???2012.11.13 *************************************************
	//*******************************************************************
	public static int Main()
	{
		int[] a = new int[100]; //a????????b?????t???
		int[] b = new int[100];
		int i;
		int p;
		int t;
		String num = new String(new char[100]); //num????
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = num.length(); //???????
		for (i = 0 ; i < p ; i++)
		{
		  a[i] = num.charAt(i) - '0'; //???????
		}
		if (p > 1)
		{
		  for (i = 1 ; i < p ; i++) //??????
		  {
			if (i >= 2) //????????????????????
			{
			   if (a[i - 2] == 0)
			   {
				 b[i] = (a[i - 1] * 10 + a[i]) / 13; //???????
				 t = (a[i - 1] * 10 + a[i]) % 13; //t???
				 a[i] = t % 10;
				 a[i - 1] = t / 10;
			   }
			   else
			   {
				  t = (a[i - 2] * 100 + a[i - 1] * 10 + a[i]) % 13;
				  b[i] = (a[i - 2] * 100 + a[i - 1] * 10 + a[i]) / 13;
				   a[i] = t % 10;
				  a[i - 1] = t / 10;
				  a[i - 2] = 0;
			   }
			}
			else //??????????????????
			{
				b[i] = (a[i - 1] * 10 + a[i]) / 13;
				t = (a[i - 1] * 10 + a[i]) % 13;
				a[i] = t % 10;
				a[i - 1] = t / 10;
			}
		  }
		 if (b[1] == 0 && p > 2)
		 {
			i = 2;
		 }
		 else
		 {
			i = 1;
		 }
		 for (; i < p ; i++)
		 {
		  System.out.print(b[i]);
		 }
		  System.out.print("\n");
		  System.out.print(t);
		  System.out.print("\n");
		}
		 else
		 {
			System.out.print("0");
			System.out.print("\n");
			System.out.print(num.charAt(0));
			System.out.print("\n");
		 }
		return 0;
	}
}

