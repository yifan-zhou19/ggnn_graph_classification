package <missing>;

public class GlobalMembers
{
	//*???2010?10?26?*
	//*??????*
	//******************************************
	public static int Main() //???
	{ //?????
		int a = 0; //???????a?????????b?????????shijinzhi?????????????????weishu????????shuchu?????
		int b = 0;
		int shijinzhi = 0;
		int weishu = 0;
		int i = 0;
		int j = 0;
		int[] shuchu = new int[1000];
		final String shuru = "abcdefg"; //????????????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shuru = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		weishu = shuru.length(); //????????
		for (i = 0;i <= weishu - 1;i++)
		{
			if (('A' <= shuru.charAt(i)) && (shuru.charAt(i) <= 'Z'))
			{
				shuru = tangible.StringFunctions.changeCharacter(shuru, i, shuru.charAt(i) - 'A' + 10);
			}
			else if (('a' <= shuru.charAt(i)) && (shuru.charAt(i) <= 'z'))
			{
				shuru = tangible.StringFunctions.changeCharacter(shuru, i, shuru.charAt(i) - 'a' + 10);
			}
			else if (('0' <= shuru.charAt(i)) && (shuru.charAt(i) <= '9'))
			{
				shuru = tangible.StringFunctions.changeCharacter(shuru, i, shuru.charAt(i) - '0');
			}
		} //?????
		for (i = 0;i <= weishu - 1;i++)
		{
			 shijinzhi = shijinzhi + (int)(shuru.charAt(i) * Math.pow(1.0 * a,1.0 * (weishu - i - 1)));
		} //????????
		if (shijinzhi == 0)
		{
			System.out.printf("%d",shijinzhi); //???????????0??????
		}
		if (shijinzhi != 0)
		{
			 for (i = 0;shijinzhi != 0;i++)
			 {
				shuchu[i] = shijinzhi % b;
				shijinzhi = shijinzhi / b;
			 }
			 for (j = i - 1;j >= 0;j--)
			 {
				  if ((0 <= shuchu[j]) && (shuchu[j] <= 9))
				  {
					 System.out.printf("%d",shuchu[j]);
				  }
				  else if (shuchu[j] >= 10)
				  {
					 shuchu[j] = shuchu[j] + 'A' - 10;
					 System.out.printf("%c",shuchu[j]);
				  }
			 }
		} //???0???????????????????
		System.out.print("\n"); //??
		return 0;
	} //?????
}

