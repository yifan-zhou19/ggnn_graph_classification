/**
 * ? ? ??????.cpp
 * ?    ?????             
 * ?????2010?12?03?    
 * ?????????????????
 */
int f = int; //????
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1) //?????1?????End
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else
	{
		for (int i = 0; i < 1000; i++) //???????f
		{
			n = f(n);
			if (n == 1)
			{
				System.out.print("End");
				System.out.print("\n");
				break;
			}
		}
	}
	return 0;
}
int f(int n)
{
	if (n % 2 == 0) //??n?????????2???
	{
		System.out.print(n);
		System.out.print("/");
		System.out.print(2);
		System.out.print("=");
		System.out.print(n / 2);
		System.out.print("\n");
		return n / 2;
	}
	else
	{
		System.out.print(n);
		System.out.print("*");
		System.out.print(3);
		System.out.print("+");
		System.out.print(1);
		System.out.print("=");
		System.out.print(n * 3 + 1);
		System.out.print("\n");
		return n * 3 + 1;
	}
}



