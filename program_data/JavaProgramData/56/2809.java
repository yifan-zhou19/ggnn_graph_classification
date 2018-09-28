package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0; //ge=???????????num??????
		int ge = 0;
		int shi = 0;
		int bai = 0;
		int qian = 0;
		int wan = 0;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		wan = num / 10000;
		qian = (num - wan * 10000) / 1000;
		bai = (num - wan * 10000 - qian * 1000) / 100;
		shi = (num - wan * 10000 - qian * 1000 - bai * 100) / 10;
		ge = (num - wan * 10000 - qian * 1000 - bai * 100 - shi * 10); //??????????
		if (shi == 0)
		{
			System.out.print(ge);
			System.out.print("\n");
		}
		else if (bai == 0)
		{
			System.out.print(ge);
			System.out.print(shi);
			System.out.print("\n");
		}
		else if (qian == 0)
		{
			System.out.print(ge);
			System.out.print(shi);
			System.out.print(bai);
			System.out.print("\n");
		}
		else if (wan == 0)
		{
			System.out.print(ge);
			System.out.print(shi);
			System.out.print(bai);
			System.out.print(qian);
			System.out.print("\n");
		}
		else
		{
			System.out.print(ge);
			System.out.print(shi);
			System.out.print(bai);
			System.out.print(qian);
			System.out.print(wan);
			System.out.print("\n");
		}
		return 0;
	}
}

