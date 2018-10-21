package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[101]);
	//strcpy(str,"avx hexavxavxyeh");
	  int i;
	  int j;
	  int t;
	  int p = 1;
	 str = new Scanner(System.in).nextLine();
	  for (i = 0;i <= 50;i++)
	  {
		  if (str.charAt(i) == ' ')
		  {
			  t = i;
		  break;
		  }
	  }
	  for (i = t + 1;i < str.length();i++)
	  {
		for (j = 0;j < t + 1;j++)
		{
			if (j == t && p == 1)
			{
			  System.out.printf("%d\n",i - t - 1);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto l;
			}
		 else if (str.charAt(i + j) == str.charAt(j) && p == 1)
		 {
				p = 1;
		 }
		 else if (str.charAt(i) == str.charAt(0))
		 {
			  p = 1;
		 }
		 else
		 {
			 p = 0;
		 }
		}
	  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	l:
	return (0);
	}


}
