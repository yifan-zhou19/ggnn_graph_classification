package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[800]);
		  int len;
		  int num = 0;
		  a = new Scanner(System.in).nextLine();
		  len = a.length();
		  for (int i = 1;i < len;i++)
		  {
				  for (int j = 0;j < len - i;j++)
				  {
						 for (int k = j;k <= (j + i / 2);k++)
						 {
								 if (a.charAt(k) == a.charAt(j + j - k + i))
								 {
									num++;
								 }
								 else
								 {
									 num = 0;
									 break;
								 }
						 }
						 if (num == i / 2 + 1)
						 {
									   for (int k = j;k <= i + j;k++)
									   {
										System.out.printf("%c",a.charAt(k));
									   }
									   System.out.print("\n");
						 }
						 num = 0;
				  }
		  }
	}
}
