package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * */
	//* ??:??????3?5?7??  */
	//* ??:???                   */
	//* ??:2012-10-07               */
	//* ??:1200012957               */
	//* * * * * * * * * * * * * * * * */
	public static int Main()
	{
		int a;
		int a3;
		int a5;
		int a7;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a3 = a % 3;
		a5 = a % 5;
		a7 = a % 7; //??????3?5?7????????????
		if (a3 == 0)
		{
			if (a5 == 0)
			{
				if (a7 == 0)
				{
					System.out.print("3 5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("3 5");
					System.out.print("\n");
				}
			}
			else
			{
				if (a7 == 0)
				{
					System.out.print("3 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("3");
					System.out.print("\n");
				}
			}
		}
		else
		{
			if (a5 == 0)
			{
				if (a7 == 0)
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("5");
					System.out.print("\n");
				}
			}
			else
			{
				if (a7 == 0)
				{
					System.out.print("7");
					System.out.print("\n");
				}
				else
				{
					System.out.print("n");
					System.out.print("\n");
				}
			}
		}

				//??????????????????????????????????????
		return 0;
	}
}

