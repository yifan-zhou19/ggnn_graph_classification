package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String string = new String(new char[1000]);
	   String = new Scanner(System.in).nextLine();
	   int i;
	   int len;
	   int[] b = new int[200];
	   int m = 0;
	   int[] c = new int[200];
	   int count = 0;
	   int max = 0;
	   int min = 0;
	   len = String.length();
	   for (i = 0;i < len;i++)
	   {
		  if (String[i] == ' ' || string.charAt(i) == ',')
		  {
			c[m] = i;
			m++;
			count++;
		  }
	   }
	   if (count >= 2)
	   {
		  for (i = 1;i < count;i++)
		  {
			 b[0] = c[0];
			 b[i] = c[i] - c[i - 1] - 1;
			 b[count] = len - c[count - 1] - 1;
		  }
		 for (i = 0;i <= count;i++)
		 {
			if (b[i] > b[max])
			{
			 max = i;
			}
		 }
		 for (i = 0;i <= count;i++)
		 {
			if (b[i] < b[min] && b[i] != 0)
			{
			  min = i;
			}
		 }
		 if (max == 0)
		 {
		   for (i = 0;i < c[0];i++)
		   {
			 System.out.printf("%c",string.charAt(i));
		   }
		 }
		 else if (max == count)
		 {
			for (i = c[count - 1] + 1;i < len;i++)
			{
			   System.out.printf("%c",string.charAt(i));
			}
		 }
		 else
		 {
			for (i = c[max - 1] + 1;i < c[max];i++)
			{
			System.out.printf("%c",string.charAt(i));
			}
		 }
		 System.out.print("\n");
		 if (min == 0)
		 {
		   for (i = 0;i < c[0];i++)
		   {
			 System.out.printf("%c",string.charAt(i));
		   }
		 }
		 else if (min == count)
		 {
			for (i = c[count - 1] + 1;i < len;i++)
			{
			  System.out.printf("%c",string.charAt(i));
			}
		 }
		 else
		 {
		   for (i = c[min - 1] + 1;i < c[min];i++)
		   {
			  System.out.printf("%c",string.charAt(i));
		   }
		 }
		  System.out.print("\n");
	   }
	   else if (count == 1)
	   {
		   if (c[0] > len - c[0] - 1)
		   {
			  for (i = 0;i < c[0];i++)
			  {
				 System.out.printf("%c",string.charAt(i));
			  }
			 System.out.print("\n");
			 for (i = c[0] + 1;i < len;i++)
			 {
			   System.out.printf("%c",string.charAt(i));
			 }
			 System.out.print("\n");
		   }
		   else if (c[0] < len - c[0] - 1)
		   {
			  for (i = c[0] + 1;i < len;i++)
			  {
				 System.out.printf("%c",string.charAt(i));
			  }
			  System.out.print("\n");
			  for (i = 0;i < c[0];i++)
			  {
				  System.out.printf("%c",string.charAt(i));
			  }
			  System.out.print("\n");
		   }
	   }
	   else if (count == 0)
	   {
		  System.out.printf("%s\n",String);
		  System.out.printf("%s\n",String);
	   }
	 return 0;
	}



}
