package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[] shuzu = new int[101];
		int[] shang = new int[101];
		int fenjie;
		String chuan = new String(new char[101]); //?????
		chuan = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = chuan.length(); //??????

		for (i = 0;i < length;i++)
		{
			shuzu[i] = chuan.charAt(i) - '0'; //???????
		}

		if (length == 1)
		{
				  System.out.print("0");
				  System.out.print("\n");
				  System.out.print(shuzu[0]);
				  System.out.print("\n");
		} //?????

		else
		{
					fenjie = shuzu[0] * 10 + shuzu[1];
					shuzu[1] = fenjie % 13;
					if (length == 2 && fenjie < 13)
					{
								 System.out.print("0");
								 System.out.print("\n");
								 System.out.print(fenjie);
					} //??13??????
					else
					{
						if (fenjie >= 13)
						{
						shang[0] = fenjie / 13; //????
						}
						for (i = 1;i < length - 1;i++)
						{
							fenjie = shuzu[i] * 10 + shuzu[i + 1];
							shuzu[i + 1] = fenjie % 13;
							shang[i] = fenjie / 13;
						}
						if (shang[0] != 0)
						{
							System.out.print(shang[0]);
						}
						for (i = 1;i < length - 1;i++)
						{
							System.out.print(shang[i]);
						}
						System.out.print("\n");
						System.out.print(shuzu[i]);
					} //????
		}
		return 0;
	}
}

