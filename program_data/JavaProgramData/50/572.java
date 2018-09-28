package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		if ((w + 7) % 7 == 0)
		{
		 System.out.print("1\n");
		}
		 if ((w + 10) % 7 == 0)
		 {
		 System.out.print("2\n3\n");
		 }
		 if ((w + 13) % 7 == 0)
		 {
		 System.out.print("4\n");
		 }
		 if ((w + 15) % 7 == 0)
		 {
		 System.out.print("5\n");
		 }
		 if ((w + 18) % 7 == 0)
		 {
			 System.out.print("6\n");
		 }
		 if ((w + 20) % 7 == 0)
		 {
			 System.out.print("7\n");
		 }
		 if ((w + 23) % 7 == 0)
		 {
			 System.out.print("8\n");
		 }
		 if ((w + 26) % 7 == 0)
		 {
			 System.out.print("9\n12\n");
		 }
		 if ((w + 28) % 7 == 0)
		 {
			 System.out.print("10\n");
		 }
		 if ((w + 31) % 7 == 0)
		 {
			System.out.print("11\n");
		 }

	 return 0;
	}
}

