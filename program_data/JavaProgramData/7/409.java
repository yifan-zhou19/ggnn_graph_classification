package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m = 0;
	  int k;
	  int a;
	  int b;
	  int c;
	  int i;
	  int j;
	  char[][] s = new char[3][256];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s[0] = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[1] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  s[2] = tempVar3.charAt(0);
	  }
	  a = String.valueOf(s[0]).length();
	  b = String.valueOf(s[1]).length();
	  c = String.valueOf(s[2]).length();
	  for (i = 0;i < a;i++)
	  {
		  for (j = 0;j < b;j++)
		  {
			  if (s[0][i + j] == s[1][j])
			  {
				m++;
			  }
		  }
		  if (m == b)
		  {
			  break;
		  }
		  m = 0;
	  }
	  if (i == a)
	  {
		System.out.printf("%s",s[0]);
	  }
	  else
	  {
		  for (k = 0;k < i;k++)
		  {
			System.out.printf("%c",s[0][k]);
		  }
		  for (k = 0;k < c;k++)
		  {
			System.out.printf("%c",s[2][k]);
		  }
		  for (k = i + b;k < a;k++)
		  {
			System.out.printf("%c",s[0][k]);
		  }
	  }
		return 0;
	}
}

