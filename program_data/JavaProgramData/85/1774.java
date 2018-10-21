package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int n;
		 int j;
		 int a;
		 char[][] s = new char[1000][22];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < n;i++)
		 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 s[i] = tempVar2.charAt(0);
				 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 a = 1;
			 if (((s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z') || (s[i][0] == '_')))
			 {
				for (j = 1;s[i][j] != '\0';j++)
				{
						if (!((s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] == '_') || (s[i][j] >= '0' && s[i][j] <= '9')))
						{
						   a = 0;
						}
				}
			 }
			 else
			 {
				 a = 0;
			 }
			 if (a == 1)
			 {
			 System.out.print("yes\n");
			 }
			 if (a == 0)
			 {
			 System.out.print("no\n");
			 }
		 }
		 return 0;

	}
}

