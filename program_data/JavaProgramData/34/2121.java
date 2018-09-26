package <missing>;

public class GlobalMembers
{
	//**************************************
	//*???????                     
	//*????? 1100012780     	        
	//*???2011.11.03                     
	//**************************************

	public static void kakutani(int n)
	{
		int i;
		if (n == 1)
		{
			System.out.print("End");
			return;
		}
		else
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/");
				System.out.print(2);
				System.out.print("=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
			}
			else
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
			}
		}
		kakutani(n);
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		kakutani(n);
		return 0;
	}


}

