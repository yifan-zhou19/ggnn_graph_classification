package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = 0;
	 for (i = 1;i <= n;i++)
	 {
	 if (i % 7 != 0) //???? ????
	 {
	 if (i % 10 != 7)
	 {
	 if (i / 10 != 7)
	 {
		 s = s + i * i;


	 }
	 }
	 }
	 }
		 System.out.print(s);





	}
}

