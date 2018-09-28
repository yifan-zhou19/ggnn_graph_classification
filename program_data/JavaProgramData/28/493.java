package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[3000]);
	 int i = 0;
	 int flag = 0;
	 int letter = 0;
	 str = new Scanner(System.in).nextLine();
	 while (true)
	 {
		   if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
		   {
			  if (letter != 0)
			  {
					if (flag != 0)
					{
					   System.out.print(",");
					}
					else
					{
						 flag = 1;
					}
					System.out.printf("%d",letter);
					letter = 0;
			  }
		   }
		   else
		   {
			   letter++;
		   }
		   if (!str.charAt(i))
		   {
			 break;
		   }
		   i++;
	 }
	 return 1;
	}



}
