package <missing>;

public class GlobalMembers
{
	//**********???????13*******************
	//**********???????*********************
	//**********?????2012?11?9?************
	//**********???1200062701******************


	public static int Main()
	{
		int yushu;
		int sum = 0;
		int beishu = 1E7;
		int weishu = 0;
		double shenyu;
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, '@', (Character.SIZE / Byte.SIZE)); //???????
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int h = 0; h < 100; h++)
		{
			if ((a.charAt(h) <= '9') && (a.charAt(h) >= '0'))
			{
				weishu++; //????
			}
		}
		shenyu = weishu;
		if (weishu < 8) //???int???????????~
		{
			beishu = Math.pow(10, (shenyu - 1));
			for (int i = 0; i < weishu; i++)
			{
				sum += (a.charAt(i) - '0') * beishu;
				beishu = beishu / 10;
				shenyu--;
			}
			System.out.print(sum / 13);
			System.out.print("\n");
			System.out.print(sum % 13);
		}
		else //??int??????????
		{
			for (int i = 0; i < 8; i++)
			{
				sum += (a.charAt(i) - '0') * beishu;
				beishu = beishu / 10;
				shenyu--;
			}
			System.out.print(sum / 13);
			yushu = sum % 13;
			for (int j = 8; j < 96; j += 8)
			{
				if (shenyu < 9) //?????????
				{
					break;
				}
				beishu = 1E7;
				sum = yushu * 1E8;
				for (int l = 0; l < 8; l++)
				{
					sum += (a.charAt(l + j) - '0') * beishu;
					beishu = beishu / 10;
					shenyu--;
					if ((l == 0) && (sum / 1E7 < 13)) //?????????????0
					{
						System.out.print("0");
					}
					if ((l == 1) && (sum / 1E6 < 13))
					{
						System.out.print("0");
					}
				}
				System.out.print(sum / 13);
				yushu = sum % 13;
			}
			beishu = Math.pow(10, shenyu - 1);
			sum = yushu * Math.pow(10, shenyu);
			for (shenyu; shenyu >= 1; shenyu--) //???????
			{
				sum += (a.charAt(weishu - (int)shenyu) - '0') * beishu;
				beishu = beishu / 10;
				if ((weishu - (int)shenyu == 0) && (sum / 1E7 < 13))
				{
					System.out.print("0");
				}
				if ((weishu - (int)shenyu == 1) && (sum / 1E6 < 13))
				{
					System.out.print("0");
				}
			}
			System.out.print(sum / 13);
			System.out.print("\n");
			yushu = sum % 13;
			System.out.print(yushu);
		}
		return 0;
	}

}

