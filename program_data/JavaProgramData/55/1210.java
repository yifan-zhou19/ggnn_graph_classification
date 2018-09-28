package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int jinzhi1; //jinzhi1?????????jinzhi2???????,length???????i?j?m?n?k?????sum??????
		int jinzhi2;
		int length;
		int i;
		int j;
		int m = 0;
		int n;
		int sum = 0;
		int k;
		int[] shu = new int[40]; //??????????????????
		int[] shu2 = new int[40];
		String input = new String(new char[40]); //input?????output??????
		String output = new String(new char[40]);
		jinzhi1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		jinzhi2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length = input.length(); //???????
		for (i = 0;i < length;i++)
		{
						 shu[i] = input.charAt(i); //??????????????ASCII?
						 if (shu[i] < 65)
						 {
							 shu[i] = shu[i] - 48; //?????
						 }
						 else if (shu[i] < 97)
						 {
							 shu[i] = shu[i] - 55; //????
						 }
						 else
						 {
							 shu[i] = shu[i] - 87; //????
						 }
						 for (j = length - i - 1;j > 0;j--)
						 {
							 shu[i] = shu[i] * jinzhi1;
						 }
						 sum = sum + shu[i]; //??????
		}
		if (sum == 0)
		{
			System.out.print(sum);
		}
		else
		{
			for (k = 0;sum > 0;k++)
			{
				 shu2[k] = sum % jinzhi2; //??????
				 sum = sum / jinzhi2;
				 if (shu2[k] < 10)
				 {
					 shu2[k] = shu2[k] + 48; //????ASCII??????
				 }
				 else
				 {
					 shu2[k] = shu2[k] + 55;
				 }
				 output = tangible.StringFunctions.changeCharacter(output, k, shu2[k]);
				 m++;
			}
		for (n = m - 1;n >= 0;n--)
		{
			System.out.print(output.charAt(n));
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

