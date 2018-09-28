package <missing>;

public class GlobalMembers
{
	//***********************************
	//*????7???????         **
	//*?????? 1000012741         **
	//*???2010.10.14                **
	//***********************************
	public static int Main() //???
	{
		int n; //??n,sum?????,sum
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) //??????
		{
			//??????
			if ((i % 7 != 0) && ((i >= 1 && i < 70) || (i >= 80 && i < 100)) && ((i - 7) % 10 != 0))
			{
				sum = sum + i * i; //?????
			}
		}
			System.out.print(sum);
			System.out.print("\n");
			return 0; //?????
	}
	//***********************************
}

