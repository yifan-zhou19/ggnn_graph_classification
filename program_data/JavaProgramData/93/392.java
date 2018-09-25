package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int shu; //??????
		shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (shu % 3 == 0 && shu % 5 == 0 && shu % 7 == 0)
		{
			System.out.print("3 5 7");
		}
		else
		{
			 if (shu % 3 == 0 && shu % 5 == 0)
			 {
				 System.out.print("3 5");
			 }
			 if (shu % 5 == 0 && shu % 7 == 0)
			 {
				 System.out.print("5 7");
			 }
			 if (shu % 3 == 0 && shu % 7 == 0)
			 {
				 System.out.print("3 7");
			 }
		}
			 if (shu % 3 == 0 && shu % 5 != 0 && shu % 7 != 0)
			 {
				 System.out.print("3");
			 }
			 if (shu % 3 != 0 && shu % 5 == 0 && shu != 0 & 7 != 0)
			 {
				 System.out.print("5");
			 }
			 if (shu % 3 != 0 && shu % 5 != 0 && shu % 7 == 0)
			 {
				 System.out.print("7");
			 }
			 if (shu % 3 != 0 && shu % 5 != 0 && shu % 7 != 0)
			 {
				 System.out.print("n");
			 }
			 return 0;
	}
}

