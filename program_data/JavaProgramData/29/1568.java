package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????      *****
	//****        1200012718       *****
	//**        ???????        **
	//**********************************
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a = 1; //abc???????????sum??
		double b = 1;
		double c;
		double n;
		double sum = 0;
		for (int i = 1;i <= m;i++)
		{
			n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a = 1,b = 1,sum = 0; //???????ab?????sum
			for (int j = 1;j <= n;j++)
			{
				 c = a + b; //c=a+b  ??????
				 sum = sum + c / b;
				 a = b;
				 b = c; //???c/b???a?b???????
			}
			System.out.printf("%.3f\n",sum); //???????sum
		}

		return 0;
	}
}

