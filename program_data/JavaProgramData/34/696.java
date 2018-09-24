package <missing>;

public class GlobalMembers
{
	//*************************************************
	//?????????
	//??????
	//?????2010.12.01
	//????????????????1???
	//*************************************************
	public static int Main()
	{
		void JiaoGu(int a);
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		JiaoGu(a);
		return 0;
	}

	public static void JiaoGu(int a)
	{
		int b;
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else if (a % 2 == 0)
		{
			b = a / 2;
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(b);
			System.out.print("\n");
			JiaoGu(b);
		}
		else
		{
			b = a * 3 + 1;
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(b);
			System.out.print("\n");
			JiaoGu(b);
		}
	}
}

