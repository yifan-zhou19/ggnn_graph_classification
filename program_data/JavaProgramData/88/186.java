package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  n = p.length();
	  for (i = 0;i < n;i++)
	  {
	   if (*(p.Substring(i)) >= '0' && *(p.Substring(i)) <= '9')
	   {
		System.out.printf("%c",*(p.Substring(i)));
	   }
	   if ((*(p.Substring(i)) < '0' || *(p.Substring(i))>'9') && (*(p.Substring(i) - 1) >= '0' && *(p.Substring(i) - 1) <= '9'))
	   {
		System.out.print("\n");
	   }
	  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(p);
	}
}
