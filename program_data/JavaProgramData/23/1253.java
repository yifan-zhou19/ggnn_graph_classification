package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char[][] a = new char[100][102];
		  int i;
		  int j;
		  int sum = 0;
		  int n;
		  int flag = 0;
		  for (i = 0;i < 100;i++)
		  {
		  for (j = 0;j < 102;j++)
		  {
		  a[i][j] = '\0';
		  }
		  }

		  String b = new String(new char[102]);
		  b = new Scanner(System.in).nextLine();
		  for (i = 0;;i++)
		  {
		  for (j = 0;;j++)
		  {
		  if (b.charAt(sum + j) == '\0')
		  {
		  flag = 1;
		  break;
		  }
		  else if (b.charAt(sum + j) != ' ')
		  {
		  a[i][j] = b.charAt(sum + j);
		  }
		  else
		  {
		  sum = sum + j + 1;
		  break;
		  }
		  }
		  if (flag == 1)
		  {
		  break;
		  }
		  }
		  n = i;
		  for (i = n;i >= 0;i--)
		  {
			  if (i == 0)
			  {
		  System.out.printf("%s",a[i]);
			  }
		  else
		  {
		  System.out.printf("%s ",a[i]);
		  }

		  }
	}




}
