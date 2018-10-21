package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String p;
	  String q;
	  int n;
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  q = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  n = p.length();
	  for (i = 0;i < n;i++)
	  {
		if (i == n - 1)
		{
			*(q.Substring(n) - 1) = *(p.Substring(n) - 1) + *(p.Substring(0));
		}
		else
		{
			*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		  System.out.printf("%c",*(q.Substring(i)));
	  }
	}

}
