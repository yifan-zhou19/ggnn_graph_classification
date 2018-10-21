package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int temp;
		int ge;
		int shi;
		int bai;
		int qian;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp = num;
		if (num == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (num == 0)
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			qian = temp / 1000;
			temp = temp - qian * 1000;
			bai = temp / 100;
			temp = temp - bai * 100;
			shi = temp / 10;
			ge = temp - shi * 10;
			if (num >= 1 && num <= 9)
			{
				System.out.print(ge);
				System.out.print("\n");
			}
			else if (num >= 10 && num <= 99)
			{
				System.out.print(ge);
				System.out.print(shi);
				System.out.print("\n");
			}
			else if (num >= 100 && num <= 999)
			{
				System.out.print(ge);
				System.out.print(shi);
				System.out.print(bai);
				System.out.print("\n");
			}
			else
			{
				System.out.print(ge);
				System.out.print(shi);
				System.out.print(bai);
				System.out.print(qian);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

