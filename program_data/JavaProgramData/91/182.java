package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
	  str = new Scanner(System.in).nextLine();
	  String p;
	  String p0;
	  String q;
	  String q0;
	  int k;
	  int i;
	  k = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  p = (String)calloc(100,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	  q = (String)calloc(100,(Character.SIZE / Byte.SIZE));
	  p = str;
	  for (i = 0;i < k - 1;i++)
	  {
		   *(q.Substring(i)) = *(p.Substring(i) + 1) + *(p.Substring(i));
	  }
	  *(q.Substring(k) - 1) = p + *(p.Substring(k) - 1);
	  for (i = 0;i < k;i++)
	  {
	   System.out.printf("%c",*(q.Substring(i)));
	  }
	}


}
