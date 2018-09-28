package <missing>;

public class GlobalMembers
{
	//************************************************
	// ?? ?1.cpp                                  *
	// ?? ????    1200012925                   *
	// ?? ?10?22?                               *
	// ?? ?????????                       *
	//************************************************
	public static int Main()
	{
	//??????? ????????????
		int n;
		int a;
		int b;
		int i;
		int m;
		int sum;
		int sum2;
	//?????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	//??????????
		for (i = 1 ; i <= (n - 2) / 4 ; i++)
		{
			a = 2 * i + 1;
			sum = 0;
	//??a???		
			for (m = 1 ; m < a ; m++)
			{
				 if (a % m != 0)
				 {
					sum = sum + 1;
				 }
			}
	//?????a?????? ???
	//?a ?????????b ?????
	//?????a 
			if (sum == a - 2)
			{
					b = n - a;
					sum2 = 0;
					for (m = 1 ; m < b ; m = m++)
					{
						if (b % m != 0)
						{
							sum2 += 1;
						}
	//???????? ????
						if (sum2 == b - 2)
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print("\n");
						}
					}
			}
		}
		return 0;
	}

}

