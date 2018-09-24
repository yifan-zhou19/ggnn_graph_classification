package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  String s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  s = (String) malloc((Character.SIZE / Byte.SIZE) * 10000);
		  s = new Scanner(System.in).nextLine();
		  n = s.length();
		  for (i = 0; * (s.Substring(i)) != '\0';i++)
		  {
								  if (*(s.Substring(i)) == ' ')
								  {
											   if (*(s.Substring(i) + 1) == ' ')
											   {
															  for (j = i; * (s.Substring(j)) != '\0';j++)
															  {
																						*(s.Substring(j)) = *(s.Substring(j) + 1);
															  }
															  i--;
											   }
								  }
		  }
		  System.out.println(s);

	}

}
