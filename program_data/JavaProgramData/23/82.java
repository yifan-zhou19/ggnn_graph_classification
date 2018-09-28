package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[100]);
	  a = new Scanner(System.in).nextLine();
	  int i;
	  int j = 0;
	  int k;
	for (i = 0;i < 100;i++)
	{
		j++;
		if (a.charAt(i) == '\0')
		{
		 j -= 1;
		 break;
		}
	}
	  for (i = j - 1;i >= 0;i--)
	  {
		  if (a.charAt(i) == ' ')
		  {
			  for (k = i + 1;k < j;k++)
			  {
			  System.out.printf("%c",a.charAt(k));
			  }
			  System.out.print(" ");
			  j = i;
		  }
	  }
	  for (i = 0;i < j;i++)
	  {
		  System.out.printf("%c",a.charAt(i));
	  }


	}


}
