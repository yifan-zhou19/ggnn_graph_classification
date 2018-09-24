package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //??abc?0,1,2?????????
		int b = 0;
		int c = 0;
		for (a = 0; a <= 2; a++)
		{
			for (b = 0; b <= 2; b++)
			{
				for (c = 0; c <= 2; c++)
				{
					if (a == b || b == c || a == c)
					{
						continue; //??a?b?c???????
					}
					if ((2 - a == ((b > a) + (c == a))) && (2 - b == ((a > b) + (a > c))) && (2 - c == ((c > b) + (b > a)))) //??????????
					{
						if (a == 0)
						{
							System.out.print("A");
						}
						if (b == 0)
						{
							System.out.print("B");
						}
						if (c == 0)
						{
							System.out.print("C");
						}
						if (a == 1)
						{
							System.out.print("A");
						}
						if (b == 1)
						{
							System.out.print("B");
						}
						if (c == 1)
						{
							System.out.print("C");
						}
						if (a == 2)
						{
							System.out.print("A");
						}
						if (b == 2)
						{
							System.out.print("B");
						}
						if (c == 2)
						{
							System.out.print("C");
						}
					}
				}
			}
		}
		return 0;
	}
}
