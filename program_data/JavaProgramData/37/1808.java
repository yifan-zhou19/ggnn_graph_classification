package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		String a = new String(new char[100009]);
		int i;
		int j;
		int k;
		int len;
		int temp = 0;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
						 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
						 len = a.length();
						 temp = 0;
						 for (j = 0;j <= len - 1;j++)
						 {
											  for (k = 0;k < len;k++)
											  {
																if (a.charAt(j) == a.charAt(k) & j != k)
																{
																break;
																}
																if (k == len - 1)
																{
																	System.out.print(a.charAt(j));
																	System.out.print("\n");
																	temp = 1;
																}
											  }
											  if (temp != 0)
											  {
												  break;
											  }
											  if (j == len - 1 & temp == 0)
											  {
												  System.out.print("no");
												  System.out.print("\n");
											  }
						 }


		}




	 return 0;

	}
}

