package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int i;
		  int num;
		  int[] b = new int[100];
		  for (i = 0;i < 100;i++)
		  {
			 b[i] = 0;
		  }
		  for (i = 0;;i++)
		  {
					   String tempVar = ConsoleInput.scanfRead(null, 1);
					   if (tempVar != null)
					   {
						   a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
					   }
					   if (a.charAt(i) == '\n')
					   {
					   break;
					   }
		  }
		  num = i;
		  for (i = 0;i < num - 1;i++)
		  {
				if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' '))
				{
					b[i + 1] = 1;
				}
		  }
		  for (i = 0;i < num;i++)
		  {
							if (b[i] == 0)
							{
							System.out.printf("%c",a.charAt(i));
							}
		  }
	}
}

