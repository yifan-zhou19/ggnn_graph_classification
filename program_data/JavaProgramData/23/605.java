package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  char[][] s = new char[110][60];
	  int i;
	  int j;
	  for (i = 0;scanf("%s",s[i]) != EOF;i++)
	  {
		  ;
	  }
	  for (j = 0;j < i;j++)
	  {
		  System.out.printf("%s%s",j == 0?"":" ",s[i - j - 1]);
	  }
	  System.out.print("\n");
	  return 0;
	}

}
