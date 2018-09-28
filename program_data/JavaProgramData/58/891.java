package <missing>;

public class GlobalMembers
{
	public static int hefa_hou(char a) //????????????????????
	{
		int pan;
		pan = a;
		if (((pan >= 65) && (pan <= 90)) || ((pan >= 97) && (pan <= 122)) || (pan == 95) || ((pan >= 48) && (pan <= 57)))
		{
			return 1; //??????????????
		}
		else
		{
			return 0;
		}
	}
	public static int hefa_qian(char a) //?????????????
	{
		int pan;
		pan = a;
		if (((pan >= 65) && (pan <= 90)) || ((pan >= 97) && (pan <= 122)) || (pan == 95))
		{
			return 1; //???????????
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int num; //num?????i,j?????length????count????
		int i;
		int j;
		int length;
		int count;
		String ming = new String(new char[81]);
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num;i++)
		{
						  System.in.read(); //????
						  cin.get(ming,81);
						  length = ming.length();
						  count = 0; //??
						  for (j = 0;j < length;j++)
						  {
											   if ((j == 0) && (hefa_qian(ming.charAt(0))) != 0)
											   {
												   count++; //???????
											   }
											   if ((j != 0) && (hefa_hou(ming.charAt(j))) != 0)
											   {
												   count++; //???????
											   }
						  }
						  if (count == length)
						  {
							  System.out.print("1");
							  System.out.print("\n");
						  }
						  else
						  {
							  System.out.print("0");
							  System.out.print("\n");
						  }
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

