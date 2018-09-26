package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char first;
		 char second;
		 first = System.in.read();
		 System.out.printf("%c",first);
		 second = System.in.read();
		 while (second != EOF)
		 {
		   if (!(first == ' ' && second == ' '))
		   {
			 System.out.printf("%c",second);
		   }
		   first = second;
		   second = System.in.read();
		 }
		 return 0;
	}
}
