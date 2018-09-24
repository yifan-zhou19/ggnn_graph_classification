package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1;a < 4;a++)
		{
			for (b = 1;b < 4;b++)
			{
				for (c = 1;c < 4;c++)
				{
					if ((a + (b > a) + (c == a)) == 3 && (b + (a > b) + (a > c)) == 3 && (c + (c > b) + (b > a)) == 3) //?????????????????????????
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop; //???????????
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	if (a > b && b > c) //?????
	{
			  System.out.print("CBA");
	}
		  else if (a > c && c > b)
		  {
			  System.out.print("BCA");
		  }
		  else if (c > b > a)
		  {
			  System.out.print("ABC");
		  }
		  else if (c > a > b)
		  {
			  System.out.print("BAC");
		  }
		  else if (b > a > c)
		  {
			  System.out.print("CAB");
		  }
		  else if (b > c > a)
		  {
			  System.out.print("ACB");
		  }
				return 0;
	}
}
