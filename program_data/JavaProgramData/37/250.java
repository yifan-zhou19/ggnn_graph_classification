package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char[][] str = new char[100][10000];
	 int t;
	 int i;
	 int j;
	 int k;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 System.in.read();
	 for (i = 0;i < t;i++)
	 {
		 str[i] = new Scanner(System.in).nextLine();
	 }
	 for (i = 0;i < t;i++)
	 {
	  for (j = 0;j < 100000 && str[i][j] != '\0';j++)
	  {
	   m = 0;
	   for (k = 0;k < 100000 && str[i][k] != '\0';k++)
	   {
		if (str[i][j] == str[i][k])
		{
		 m = m + 1;
		}
	   }
	   if (m == 1)
	   {
		   System.out.printf("%c\n",str[i][j]);
		break;
	   }
	  }
	  if (m > 1)
	  {
		  System.out.print("no\n");
	  }
	 }
	}
}

