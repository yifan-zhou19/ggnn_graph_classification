package <missing>;

public class GlobalMembers
{
	public static int Main() //?????c??????
	{
		int n; //n????check????????
		int i;
		int j;
		int check = 1;
		char[][] test = new char[100][90]; //?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??n????????
		for (i = 0;i < n;i++)
		{
			test[i] = new Scanner(System.in).nextLine(); //???????
		}
		for (i = 0;i < n;i++)
		{

						check = 1; //???
						if (!((test[i][0] == '_') || (test[i][0] >= 'a' && test[i][0] <= 'z') || (test[i][0] >= 'A' && test[i][0] <= 'Z')))
						{
							check = 0; //???????????
						}
						j = 1;
						while (test[i][j] != 0)
						{
											 if (!((test[i][j] == '_') || (test[i][j] >= 'a' && test[i][j] <= 'z') || (test[i][j] >= 'A' && test[i][j] <= 'Z') || (test[i][j] >= '0' && test[i][j] <= '9')))
											 {
												 check = 0; //??????????????
											 }
											 j++;
						}
						System.out.print(check);
						System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}


}

