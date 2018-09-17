package <missing>;

public class GlobalMembers
{
	public static int[] time = new int[200];
	public static String word = new String(new char[400]);
	public static int len;
	public static int Main()
	{
		int i;
		int flag = 1;
		int y = 1;
		word = new Scanner(System.in).nextLine();
		len = word.length();
		for (i = 0;i < len;i++)
		{
		time[word.charAt(i)]++;
		}
		for (i = 'A';i <= 'z';i++)
		{
							 if ((i <= 'Z' || i >= 'a') && time[i] != 0)
							 {
															 if (y == 0)
															 {
															 System.out.print("\n");
															 }
															 y = 0;
															 System.out.printf("%c=%d",i,time[i]);
															 flag = 0;
							 }
		}
		 if (flag == 1)
		 {
		 System.out.print("No");
		 }

		 return 0;
	}

}
