package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int m;
		int sushu;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 2 == 1)
		{
			n = n - 1;
		}
		for (int i = 6 ; i <= n ; i = i + 2)
		{
		   a = 3;
		   b = i - a;
		   do
		   {
		   sushu = 1;
			 for (int j = 3; j <= Math.sqrt(a) ; j = j + 2)
			 {
			  if (a % j == 0)
			  {
				  sushu = 0;
			  }
			 }
			 if (sushu == 1)
			 {
				for (int k = 3; k <= Math.sqrt(b) ; k = k + 2)
				{
				  if (b % k == 0)
				  {
					  sushu = 0;
				  }
				}
			 }
			if (sushu == 1)
			{
				System.out.print(i);
				System.out.print('=');
				System.out.print(a);
				System.out.print('+');
				System.out.print(b);
				System.out.print("\n");
				break;
			}
			   else
			   {
				   a = a + 2;
				   b = b - 2;
			   }
		   }while (sushu != 1);
		}
	  return 0;
	}


}

