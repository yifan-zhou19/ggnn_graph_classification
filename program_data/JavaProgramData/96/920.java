package <missing>;

public class GlobalMembers
{
	public static int f(char a) //??????????????
	{
		if (a == '1')
		{
			return 1;
		}
	   if (a == '2')
	   {
		   return 2;
	   }
	   if (a == '3')
	   {
		   return 3;
	   }
	   if (a == '4')
	   {
		   return 4;
	   }
	   if (a == '5')
	   {
		   return 5;
	   }
	   if (a == '6')
	   {
		   return 6;
	   }
	   if (a == '7')
	   {
		   return 7;
	   }
	   if (a == '8')
	   {
		   return 8;
	   }
	   if (a == '9')
	   {
		   return 9;
	   }
	   if (a == '0')
	   {
		   return 0;
	   }
	}
	public static int Main()
	{
		char a;
		int b;
		int chushu = 0;
		int yushu = 0;
		int shang;
		int t = 0;
		int v = 0;
		while (true)
		{
					 cin.get(a);
					 if (a == '\n') //??????
					 {
							t = 1;

					 }
					 b = f(a);
					 chushu = 10 * chushu + b; //?????

			 if (t == 1)
			 {
				 break; //????
			 }
			 shang = chushu / 13; //????
			 yushu = chushu % 13;
			 chushu = yushu;
			 if (shang != 0)
			 {
				 v = v + 1;
			 }
			 if (v != 0)
			 {
				 System.out.print(shang);
			 }

		}
		if (v == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
		System.out.print(yushu);
		return 0;
	}
}
