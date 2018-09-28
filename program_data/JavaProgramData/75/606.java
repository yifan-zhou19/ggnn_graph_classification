package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012809      **
	//*???2013.10.31             **
	//*????????             **
	//********************************
	public static int Main()
	{
		int i;
		int a;
		int b;
		int jishu;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int j;
		int renshu = 0;
		int ren = 0;
		char xijinping;
		for (i = 1;i <= 2;i++) //???2?????????
		{
			if (i == 1)
			{
				jishu = 0;
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				xijinping = System.in.read(); //????
				while (xijinping == ',')
				{
					x[jishu] = a;
					jishu = jishu + 1; //????????
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					xijinping = System.in.read();
				}
				x[jishu] = a; //??????????
				jishu = jishu + 1;
			}
			if (i == 2)
			{
				jishu = 0; //???????????y??
				b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				xijinping = System.in.read();
				while (xijinping == ',')
				{
					y[jishu] = b;
					jishu = jishu + 1;
					b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					xijinping = System.in.read();
				}
				y[jishu] = b;
				jishu = jishu + 1;
			}
		}
		for (j = 0;j <= 1000;j++)
		{
			if (ren < renshu)
			{
				ren = renshu; //???????????????????????????
			}
			renshu = 0;
			for (i = 0;i < jishu;i++)
			{
				if (x[i] <= j != 0 && j < y[i])
				{
					renshu = renshu + 1; //????
				}
			}
		}
		System.out.print(jishu);
		System.out.print(" ");
		System.out.print(ren);
		System.out.print("\n");
		return 0;
	}
}

