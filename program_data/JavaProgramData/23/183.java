package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][20];
		char s;
	  int n = 0;
	  int i;
	  int t = 0;

	  do
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[n] = tempVar.charAt(0);
		  }
	  n++;
	  } while ((s = System.in.read()) != '\n');

	  for (i = n - 1;i >= 0;i--)
	  {
		  if (t > 0)
		  {
			  System.out.print(" ");
		  }
		  System.out.printf("%s",a[i]);
		  t++;
	  }

	}
}

