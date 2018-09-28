package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void dx(char str[]);
		int j;
		String str = new String(new char[100]);
		for (j = 1;j <= 6;j++)
		{
			cin.get(str,100,'\n');
			dx(str);
			System.in.read();
		}


		return 0;
	}

	   public static void dx(String str)
	   {
		 int i = 0;
		 if (str[0].equals('-'))
		 {
		   System.out.print(str[0]);
		   for (i = str.length() - 1;i >= 1;i--)
		   {
			 if (str[i].equals(48))
			 {
				 continue;
			 }
			 else
			 {
				 break;
			 }
		   }
		   for (i;i >= 1;i--)
		   {
			 System.out.print(str[i]);
		   }
		   System.out.print("\n");
		 }
		  else
		  {
			  for (i = str.length() - 1;i >= 1;i--)
			  {
				if (str[i].equals(48))
				{
					continue;
				}
			  else
			  {
				  break;
			  }
			  }
			  for (i;i >= 0;i--)
			  {
				  System.out.print(str[i]);
			  }
			  System.out.print("\n");
		  }
	   }

}
