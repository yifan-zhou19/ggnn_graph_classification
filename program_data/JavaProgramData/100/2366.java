//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public char na;
  public int num;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] ch = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(52);


	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int leap = 0;
	  String s = new String(new char[300]);
	  for (i = 0;i < 26;i++)
	  {
		  ch[i].na = 'A' + i;
		ch[i].num = 0;
	  }
	   for (i = 26;i < 52;i++)
	   {
		  ch[i].na = 'a' + i - 26;
		ch[i].num = 0;
	   }
	  s = new Scanner(System.in).nextLine();
	  n = s.length();
	 for (i = 0;i < n;i++)
	 {
		  if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		  {
		  leap = 1;
		  for (j = 0;j < 52;j++)
		  {
			  if (s.charAt(i) == ch[j].na)
			  {
			  ch[j].num++;
			  }
		  }
		  }
	 }
	  if (leap == 0)
	  {
		  System.out.print("No");
	  }
	  else
	  {
		  for (i = 0;i < 52;i++)
		  {
		  if (ch[i].num > 0)
		  {
		  System.out.printf("%c=%d\n",ch[i].na,ch[i].num);
		  }
		  }
	  }


	}
}

