package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//???????? 
	//*************************************************************
	public static int Main()
	{
		int a;
		int[] n = new int[7];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n[1] = a / 100;
		a = a % 100;
		n[2] = a / 50;
		a = a % 50;
		n[3] = a / 20;
		a = a % 20;
		n[4] = a / 10;
		a = a % 10;
		n[5] = a / 5;
		n[6] = a % 5;
		int i;
		for (i = 1;i <= 6;i++)
		{
			System.out.print(n[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

