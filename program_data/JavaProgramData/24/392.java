package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[50]);
	String max = new String(new char[50]);
	String min = new String(new char[50]);
	while (scanf("%s",s) != EOF)
	{
	  if (s.length() > max.length())
	  {
		  max = s;
	  }
	  if (s.length() < min.length())
	  {
		  min = s;
	  }
	}
	System.out.printf("%s\n%s",max,min);
	return 0;
	}
}
