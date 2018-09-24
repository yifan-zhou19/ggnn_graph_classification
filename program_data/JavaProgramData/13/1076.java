package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????                      
	//*?????? 1100012789      
	//*???2011.12.11                       
	//****************************************

	public static int Main()
	{
		int[] flag = new int[100];
		int i;
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		flag[temp] = 1;
		System.out.print(temp);
		for (i = 1; i < n; i++)
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (flag[temp] == 0)
			{
				System.out.print(" ");
				System.out.print(temp);
				flag[temp] = 1;
			}
		}
		return 0;
	}
}

