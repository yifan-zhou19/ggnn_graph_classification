package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String str = new String(new char[101]);
	int[] q = new int[102];
	int b;
	int c;
	int i;
	int j = 0;
	int k;
	int m;
	int x = 0;

	str = new Scanner(System.in).nextLine();

	for (i = 0;str.charAt(i) != '\0';i++)

	{
	  if (str.charAt(i) == ' ')
	  {
	q[j] = i,j++,x++;
	  }
	  else
	  {
	  if (str.charAt(i + 1) == '\0')
	  {
	   b = i;
	  }
	  }
	}

	if (j == 0)
	{
		 for (m = 0;str.charAt(m) != ' ' && str.charAt(m) != '\0';m++)
		 {
	 System.out.printf("%c",str.charAt(m));
		 }
	}
	else
	{
		for (;j > 0;j--)
		{
	   for (m = q[j - 1] + 1;str.charAt(m) != ' ' && str.charAt(m) != '\0';m++)
	   {
		  System.out.printf("%c",str.charAt(m));
	   if (str.charAt(m + 1) == ' ' || str.charAt(m + 1) == '\0')
	   {
	   System.out.print(" ");
	   }
	   }
		}
	for (m = 0;str.charAt(m) != ' ' && str.charAt(m) != '\0';m++)
	{
	System.out.printf("%c",str.charAt(m));
	}
	}
	}


}
