package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] num = new char[6][1000];
	 for (int i = 0;i < 6;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 num[i] = tempVar.charAt(0);
	 }
	 }
	 for (int i = 0;i < 6;i++)
	 {
	  int n;
	  n = String.valueOf(num[i]).length();
		 if (num[i][0] == '0' || (num[i][0] == '-' && num[i][1] == '0'))
		 {
			 System.out.print("0");
		 }
		else
		{
					   if (num[i][0] == '-')
					   {
						   System.out.print("-");
						while (num[i][n - 1] == '0')
						{
							n = n - 1;
						}
						 for (int j = n - 1;j >= 1;j--)
						 {
							  System.out.printf("%c",num[i][j]);
						 }
					   }
		  else
		  {
			while (num[i][n - 1] == '0')
			{
							n = n - 1;
			}
		  for (int j = n - 1;j >= 0;j--)
		  {

		  System.out.printf("%c",num[i][j]);
		  }
		  }
		}
		  System.out.print("\n");
	 }
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

