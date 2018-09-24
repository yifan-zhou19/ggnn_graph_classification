package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String string = new String(new char[10000]);
	  char c;
		int i;
		int num;
		int word;
		int[] a = new int[300];
	  num = 0;
	  word = 0;
			 String = new Scanner(System.in).nextLine();
		  for (i = 0;(c = string.charAt(i)) != '\0';i++)
		  {
			  if (c == ' ')
			  {
				  word = 0;
			  }
			  else
			  {
					if (word == 0)
					{
					  word = 1;
					  num = num + 1;
					  a[num - 1] = 0;
					}
					a[num - 1] = a[num - 1] + 1;


			  }
		  }
		for (i = 0;i <= num - 1;i++)
		{
			System.out.printf("%d",a[i]);
		if (i < num - 1)
		{
			System.out.print(",");
		}
		}
	}
}
