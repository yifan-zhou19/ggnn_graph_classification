package <missing>;

public class GlobalMembers
{
	public static int function1(char zimu)
	{
		int panduan;
		panduan = zimu;
		if (((panduan >= 65) && (panduan <= 90)) || ((panduan >= 97) && (panduan <= 122)) || (panduan == 95))
		{
			return 1; //???????????
		}
		else
		{
			return 0;
		}
	} //?????????????
	public static char function2(char zimu)
	{
		int panduan;
		panduan = zimu;
		if (((panduan >= 65) && (panduan <= 90)) || ((panduan >= 97) && (panduan <= 122)) || (panduan == 95) || ((panduan >= 48) && (panduan <= 57)))
		{
			return 1; //??????????????
		}
		else
		{
			return 0; //????????????????
		}
	}

	public static int Main()
	{
		String str = new String(new char[81]);
		int n;
		int i;
		int j;
		int count;
		int changdu;
		int panduan;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
						System.in.read();
						count = 0;
						cin.get(str,81);
						changdu = str.length();
						if (changdu == 0)
						{
							System.out.print(" 0");
							System.out.print("\n");
						}
						else
						{
						   for (j = 0;j < changdu;j++)
						   {
							if (j == 0)
							{
									if (function1(str.charAt(j)) != 0)
									{
										count++;
									}
							}
							else
							{
									if (function2(str.charAt(j)) != null)
									{
										count++;
									}
							}
						   }
						   if (count == changdu && count != 0)
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
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
	}
}

