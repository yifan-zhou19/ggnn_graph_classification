package <missing>;

public class GlobalMembers
{
	public static void f(int x, String str)
	{
		int i;
		int le;
		int j;
		int flag = 1;
		int p;
		   le = str.length();
		   for (i = 0;i <= le - x;i++)
		   {
			   if (x % 2 == 0)
			   {
				   for (j = i;j <= i + x / 2 - 1;j++)
				   {
					if (!str[j].equals(str[i + i + x - 1 - j]))
					{
						flag = 0;
					}
				   }
					 if (flag == 1)
					 {
						for (p = i;p <= i + x - 1;p++)
						{
						System.out.print(str[p]);
						}
						System.out.print("\n");
					 }
					 flag = 1;
			   }
				   if (x % 2 == 1)
				   {
					  for (j = i;j <= i + (x - 1) / 2 - 1;j++)
					  {
						  if (!str[j].equals(str[i + i + x - 1 - j]))
						  {
							   flag = 0;
						  }
					  }
						  if (flag == 1)
						  {
								 for (p = i;p <= i + x - 1;p++)
								 {
								 System.out.print(str[p]);
								 }
								 System.out.print("\n");
						  }
							flag = 1;
				   }
		   }
	}
	   public static int Main()
	   {
		  int le;
		  int x = 2;
		   String str = new String(new char[501]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  for (x = 2;x <= le;x++)
		  {
			f(x, str);
		  }
			return 0;
	   }




}

