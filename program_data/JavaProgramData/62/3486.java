package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[1100]);
	  int i;
	  int j;
	  for (i = 0;scanf("%s",s) != EOF;i++)
	  {
		System.out.printf("%s%s",i == 0?"":" ",s);
	  }
	  System.out.print("\n");
	  return 0;
	}

}
