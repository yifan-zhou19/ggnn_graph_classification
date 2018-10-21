package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int k;
	 String str = new String(new char[100000]);
	 str = new Scanner(System.in).nextLine();
	 k = 0;
	 for (i = 0;i < str.length();i++)
	 {
	  if (str.charAt(i) == ' ')
	  {
	   continue;
	  }
	  else
	  {
		k++;
		if (str.charAt(i + 1) == ' ')
		{
		 System.out.printf("%d,",k);
		 k = 0;
		}
		if (str.charAt(i + 1) == '\0')
		{
		 System.out.printf("%d\n",k);
		}
	  }
	 }
	}



}
