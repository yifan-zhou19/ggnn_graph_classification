package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[30]);
	   str = new Scanner(System.in).nextLine();
	   String str_pointer;
	   str_pointer = str;
	   int i;
	   int flag;
	   int count;
	   flag = count = 0;
	   for (i = 0;str.charAt(i);i++)
	   {
		   if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
		   {
			 System.out.printf("%c",str.charAt(i));
			 flag = 0;
		   }
		   else if (flag == 0)
		   {
			   System.out.print("\n");
			   flag = 1;
		   }
	   }
	   return 0;
	}


}
