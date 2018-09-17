package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a <= 3;a++)
		{
		for (b = 1;b <= 3;b++)
		{
		for (c = 1;c <= 3;c++)
		{
						if (a != b && b != c)
						{
									  if ((a + (c == a) + (b > a)) == 3 && (b + (a > b) + (a > c)) == 3 && (c + (c > b) + (b > a) == 3)) //??????????
									  {
									  if (a == 3 && b == 2 && c == 1) //????????
									  {
									  System.out.print("CBA");
									  }
									  else if (a == 3 && b == 1 && c == 2)
									  {
									  System.out.print("BCA");
									  }
									  else if (a == 2 && b == 3 && c == 1)
									  {
									  System.out.print("CAB");
									  }
									  else if (a == 2 && b == 1 && c == 3)
									  {
									  System.out.print("BAC");
									  }
									  else if (a == 1 && b == 3 && c == 2)
									  {
									  System.out.print("ACB");
									  }
									  else
									  {
									  System.out.print("ABC");
									  }
									  break;
									  }
						}
		}
		}
		}

		return 0;
	}


}
