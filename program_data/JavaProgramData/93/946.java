package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //????
		int[] a = {3, 5, 7};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((n % 3 != 0 && n % 5 != 0) && n % 7 != 0)
		{
				System.out.print("n");
		}
		else
		{
				if (n % 7 == 0) //??n?7?????
				{
					for (int i = 0;i < 2;i++)
					{
						 if (n % a[i] == 0) //??n?3?5?????
						 {
					 System.out.print(a[i]);
					 System.out.print(" ");
						 }
					}
					System.out.print(7);
				}
				else if (n % 5 == 0) //??n???7????5?????
				{
						if (n % 3 == 0)
						{
						System.out.print(a[0]);
						System.out.print(" ");
						System.out.print(a[1]);
						}
					else
					{
						System.out.print(a[1]);
					}
				}
				else
				{
					System.out.print(a[0]);
				}
		}

		return 0;
	}
}

