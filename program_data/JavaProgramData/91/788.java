package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
	  String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  a = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
	  String b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  b = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
	  a = new Scanner(System.in).nextLine();
	  for (i = 0;;i++)
	  {
		  if (*(a.Substring(i)) == '\0')
		  {
			  *(b.Substring(i)) = '\0';
			  break;
		  }
		  else if (*(a.Substring(i) + 1) == '\0')
		  {
			  *(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(0));
		  }
		  else
		  {
			  *(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
		  }

	  }
	  for (i = 0; * (b.Substring(i)) != '\0';i++)
	  {
		  System.out.printf("%c",*(b.Substring(i)));
	  }
	}
}
