package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[301]);
	  char c;
	  s = new Scanner(System.in).nextLine();
	  int i;
	  int num;
	  int a = 0;
	  for (c = 'A';c <= 'Z';c++)
	  {
		  num = 0;
		  for (i = 0;s.charAt(i) != '\0';i++)
		  {
			if (s.charAt(i) == c)
			{
			  num++;
			}
		  }
		  if (num != 0)
		  {
			  System.out.printf("%c=%d\n",c,num);
			  a++;
		  }
	  }
	  for (c = 'a';c <= 'z';c++)
	  {
		  num = 0;
		  for (i = 0;s.charAt(i) != '\0';i++)
		  {
			if (s.charAt(i) == c)
			{
			  num++;
			}
		  }
		  if (num != 0)
		  {
			  System.out.printf("%c=%d\n",c,num);
			  a++;
		  }
	  }
	  if (a == 0)
	  {
		System.out.print("No\n");
	  }
	  return 0;
	}
}
