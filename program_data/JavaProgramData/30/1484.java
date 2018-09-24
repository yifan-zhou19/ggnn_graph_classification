package <missing>;

public class GlobalMembers
{
	//*********************************************
	//*???????????????????******
	//*??????? 1200012979 ******************
	//*???2012.10.08 ***************************
	//*********************************************
	public static int Main()
	{
		int n; //??????????
		int a;
		int b;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 1 ; a <= n ; a++)
		{
		  if (a % 7 == 0) //??7???
		  {
			  continue;
		  }
		  if (a == 17 || a == 27 || a == 37 || a == 47 || a == 57 || a == 67 || a == 87 || a == 97)
		  {
			  continue; //??????????
		  }
		  b = a / 10;
		  if (b == 7)
		  {
			  continue;
		  }
		  sum = sum + a * a; //?????
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

