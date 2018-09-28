package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_a;
int[] can = new int[3];
int flag = 0;
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a,can[3],flag=0;
		Main_a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (Main_a % 3 == 0)
		{
			can[0] = 1;
			flag = 1;
		}
		if (Main_a % 5 == 0)
		{
			can[1] = 1;
			flag = 1;
		}
		if (Main_a % 7 == 0)
		{
			can[2] = 1;
			flag = 1;
		}
		if (flag != 0)
		{
			for (int i = 2;i >= 0;i--)
			{
				if (can[i] != 0)
				{
					can[i] = 2;
					break;
				}
			}
		}
		if (can[0] != 0)
		{
			System.out.print(3);
		}
		if (can[0] == 1)
		{
			System.out.print(" ");
		}
		if (can[1] != 0)
		{
			System.out.print(5);
		}
		if (can[1] == 1)
		{
			System.out.print(" ");
		}
		if (can[2] != 0)
		{
			System.out.print(7);
		}
		if (can[2] == 1)
		{
			System.out.print(" ");
		}
		if (flag == 0)
		{
			System.out.print("n");
		}
		System.out.print("\n");
		return 0;
	}

}

