package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[1000]);
	 char[][] word = new char[300][20];
	 int i;
	 int j = 0;
	 int k = 0;
	 int[] num = new int[300];
	 str = new Scanner(System.in).nextLine();
	 for (i = 0;i < str.length();i++)
	 {
	  if (str.charAt(i) != ' ')
	  {
	   word[j][k] = str.charAt(i);
		  k++;
	  }
	  else
	  {
	   word[j][k] = '\0';
	   j++;
	   k = 0;
	   while (true)
	   {
		if (str.charAt(i + 1) == ' ')
		{
		 i++;
		}
		else
		{
		 break;
		}
	   }
	  }
	 }
	 word[j][k] = '\0';
	 j++;
	 for (i = 0;i < j;i++)
	 {
	  num[i] = String.valueOf(word[i]).length();
	 }
	 System.out.printf("%d",num[0]);
	 for (i = 1;i < j;i++)
	 {
	  System.out.printf(",%d",num[i]);
	 }
	 return 0;
	}

}
