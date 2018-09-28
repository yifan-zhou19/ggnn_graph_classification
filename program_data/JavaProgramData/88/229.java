package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
		String c;
	   int i;
	   int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	   s = (String)calloc(31,(Character.SIZE / Byte.SIZE));
	   s = new Scanner(System.in).nextLine();
	   for (i = 0; * (s.Substring(i)) != '\0';i++)
	   {
		if (*(s.Substring(i)) <= '9' && *(s.Substring(i)) >= '0')
		{
			System.out.printf("%c",*(s.Substring(i)));
		}
		 else
		 {
			  for (;(*(s.Substring(i)) < '0' || *(s.Substring(i))>'9') && *(s.Substring(i)) != '\0';i++)
			  {
				  ;
			  }

		  if (*(s.Substring(i)) != '\0')
		  {
			  System.out.print("\n");
		  }
		  i--;
		 }
	   }

	}
}
