package <missing>;

public class GlobalMembers
{
	//********************
	//*****?????*****
	//**?? 1100012915***
	//*******11.7*********
	//********************
	public static int Main()
	{
		int i; //first???????
		int first;
		int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //?????
		int[] every13 = new int[13]; //??????13?????
		first = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		every13[1] = first + 12 % 7; //??????
		if (every13[1] > 7)
		{
			every13[1] = every13[1] - 7; //??7????7
		}
		for (i = 2 ; i <= 12 ; i++) //??2~12?13?????
		{
			every13[i] = every13[i - 1] + mon[i - 1] % 7;
			if (every13[i] > 7)
			{
				every13[i] = every13[i] - 7;
			}
		}
		for (i = 1 ; i <= 12 ; i++)
		{
			if (every13[i] == 5) //????????????????
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

