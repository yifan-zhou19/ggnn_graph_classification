package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int a;
		int original;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		original = a;
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		int dig5;
		int NumofDig;
		dig1 = a / 10000;
		a = a - 10000 * dig1;
		dig2 = a / 1000;
		a = a - 1000 * dig2;
		dig3 = a / 100;
		a = a - 100 * dig3;
		dig4 = a / 10;
		a = a - 10 * dig4;
		dig5 = a;
		if (dig1 != 0)
		{
		NumofDig = 5;
		}
		else
		{
			if (dig2 != 0)
			{
			NumofDig = 4;
			}
			else
			{
				if (dig3 != 0)
				{
				NumofDig = 3;
				}
				else
				{
					if (dig4 != 0)
					{
					NumofDig = 2;
					}
					else
					{
					NumofDig = 1;
					}
				}
			}
		}
		int Oppo;
		Oppo = dig5 * 10000 + dig4 * 1000 + dig3 * 100 + dig2 * 10 + dig1;
		switch (NumofDig)
		{
			case 5 :
				 System.out.print("00001");
				 System.out.print("\n");
				 break;
			case 4 :
				 System.out.print(dig5);
				 System.out.print(dig4);
				 System.out.print(dig3);
				 System.out.print(dig2);
				 System.out.print("\n");
				 break;
			case 3 :
				 System.out.print(dig5);
				 System.out.print(dig4);
				 System.out.print(dig3);
				 System.out.print("\n");
				 break;
			case 2 :
				 System.out.print(dig5);
				 System.out.print(dig4);
				 System.out.print("\n");
				 break;
			case 1 :
				 System.out.print(dig5);
				 System.out.print("\n");
				 break;
		}

	  return EXIT_SUCCESS;
	}
}

