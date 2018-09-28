package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int j;
			char[][] a = new char[100][100];
			String b = new String(new char[100]);
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
					a[i] = tempVar2.charAt(0);
				}
				b = tangible.StringFunctions.changeCharacter(b, i, String.valueOf(a[i]).length());
				//printf("%d\n",b[i]);

			}
			for (i = 0;i < n;i++)
			{
				if (a[i][b.charAt(i) - 1] == 'r')
				{
					for (j = 0;j < b.charAt(i) - 2;j++)
					{
					System.out.printf("%c",a[i][j]);
					}
					System.out.print("\n");
					continue;
				}
				else if (a[i][b.charAt(i) - 1] == 'y')
				{
					for (j = 0;j < b.charAt(i) - 2;j++)
					{
				 System.out.printf("%c",a[i][j]);
					}
				  System.out.print("\n");
				continue;
				}
				else if (a[i][b.charAt(i) - 1] == 'g')
				{
					;
				}
				{
					 for (j = 0;j < b.charAt(i) - 3;j++)
					 {
					System.out.printf("%c",a[i][j]);
					 }
				   System.out.print("\n");
				   continue;
			 }
				//printf("\n");
			}
			return 0;
	}

}

