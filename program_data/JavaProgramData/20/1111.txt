package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		char c;
		int t;
		int i;
		int l;
		while (scanf("%s%s",str,substr) != EOF)
		{
		  c = str.charAt(0);
		  t = 0;
		  l = str.length();
		  for (i = 1;str.charAt(i) != '\0';i++)
		  {
		  if (str.charAt(i) > c)
		  {
		  c = str.charAt(i);
		  t = i;
		  }
		  }
		  for (i = 0;i <= t;i++)
		  {
		  System.out.printf("%c",str.charAt(i));
		  }
		  for (i = 0;i < 3;i++)
		  {
		  System.out.printf("%c",substr.charAt(i));
		  }
		  for (i = t + 1;i < l;i++)
		  {
		  System.out.printf("%c",str.charAt(i));
		  }
		  System.out.print("\n");
		}
	}
}
