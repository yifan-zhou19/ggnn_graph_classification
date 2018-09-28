package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		char[][] ch = new char[100][100];
		for (i = 0 ; i <= n - 1 ; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
			 while (System.in.read() != '\n')
			 {
				 ;
			 }
			 cin.get(ch[i], 100, '\n');
		}
		for (i = 0 ; i <= n - 1 ; i++)
		{
			 if (ch[i][0] == 95 || (ch[i][0] >= 65 && ch[i][0] <= 90) || (ch[i][0] >= 97 && ch[i][0] <= 122))
			 {
			 int j = 0;
			 int counter = 0;
			 int m = String.valueOf(ch[i]).length();
			 for (j = 0 ; j <= m - 1 ; j++)
			 {
				  if (ch[i][j] == 95 || (ch[i][j] >= 65 && ch[i][j] <= 90) || (ch[i][j] >= 97 && ch[i][j] <= 122) || (ch[i][j] >= 48 && ch[i][j] <= 57))
				  {
				  counter = counter;
				  }
				  else
				  {
				  counter++;
				  }
			 }
			 if (counter == 0)
			 {
			 System.out.print(1);
			 System.out.print("\n");
			 }
			 else
			 {
			 System.out.print(0);
			 System.out.print("\n");
			 }
			 }
			 else
			 {
			 System.out.print(0);
			 System.out.print("\n");
			 }
		}
	return 0;
	}
}

