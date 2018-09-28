package <missing>;

public class GlobalMembers
{
	//****************************************
	//*????7??????                        
	//*?????? 1100012789      
	//*???2011.10.01                       
	//****************************************

	public static int Main()
	{
		int n; //sum?????i????
		int sum = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (i % 7 != 0 && i / 10 != 7 && i % 10 != 7) //????????????????????????
			{
				sum = sum + i * i; //????
			}
		}
			System.out.print(sum);
			System.out.print("\n");
			return 0;
	}
}

