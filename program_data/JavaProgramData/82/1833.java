package <missing>;

public class GlobalMembers
{
	//***********************************
	//*?????? 1300012809         **
	//*???2013.10.25                **
	//*???????                  **
	//***********************************
	public static int Main()
	{
		int n;
		int i;
		int time;
		int jishu;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		time = 0;
		jishu = 0;
		for (i = 1;i <= n;i++) //??n???
		{
			int a;
			int b;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((a < 90 || a>140 || b < 60 || b>90) && jishu <= time)
			{
				jishu = time; //?????????
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90) //??????????
			{
				time = time+1;
			}
			else
			{
				time = 0; //????????????
			}
			if (jishu < time)
			{
				jishu = time; //???????????
			}
		}
		System.out.print(jishu);
		System.out.print("\n");
		return 0;
	}
}

