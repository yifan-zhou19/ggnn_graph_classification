package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] l = new int[200];
		int jud = 0;
		char[][] s = new char[200][85];
		String str = new String(new char[5]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (i = 0;i < n;i++)
		{
		   s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
		   jud = 0;
		  l[i] = String.valueOf(s[i]).length();
		  if (s[i][0] != '_')
		  {
			 if (s[i][0] < 'A')
			 {
			 System.out.print("0\n");
			  jud = 1;
			 continue;
			 }
			  if ((s[i][0] < 'a') && (s[i][0]>'Z'))
			  {
			 System.out.print("0\n");
			  jud = 1;
			 continue;
			  }
			 if (s[i][0] > 'z')
			 {
			 System.out.print("0\n");
			  jud = 1;
			 continue;
			 }
		  }
		  for (j = 1;j < l[i];j++)
		  {
			if (s[i][j] != '_')
			{
			 if (s[i][j] < '0')
			 {
			 System.out.print("0\n");
			  jud = 1;
			  break;
			 }
			 if ((s[i][j] > '9') && (s[i][j] < 'A'))
			 {
			 System.out.print("0\n");
			  jud = 1;
			  break;
			 }
			  if ((s[i][j] < 'a') && (s[i][j]>'Z'))
			  {
			 System.out.print("0\n");
			  jud = 1;
			  break;
			  }
			 if (s[i][j] > 'z')
			 {
			 System.out.print("0\n");
			  jud = 1;
			  break;
			 }
			}
		  }
		  if (jud == 0)
		  {
		  System.out.print("1\n");
		  }
		}
		System.in.read();
		System.in.read();
	}

}
