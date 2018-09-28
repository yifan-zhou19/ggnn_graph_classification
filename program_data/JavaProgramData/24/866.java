package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int len;
	  int c = 1;
	  int d = 25;
	  char[][] dc = new char[51][50];
	  String zc = new String(new char[50]);
	  String zd = new String(new char[50]);
	  for (i = 0;i < 20;i++)
	  {
				   String tempVar = ConsoleInput.scanfRead();
				   if (tempVar != null)
				   {
					   dc[i] = tempVar.charAt(0);
				   }
				   if ((dc[i][0] >= 'a' && dc[i][0] <= 'z') || (dc[i][0] >= 'A' && dc[i][0] <= 'Z'))
				   {

				   len = String.valueOf(dc[i]).length();
				   if (len > c)
				   {
					   zc = dc[i];
					   c = len;
				   }
				   if (len < d)
				   {
					   zd = dc[i];
					   d = len;
				   }
				   }
	  }
	  System.out.println(zc);
	  System.out.println(zd);

	  return 0;

	}


}

