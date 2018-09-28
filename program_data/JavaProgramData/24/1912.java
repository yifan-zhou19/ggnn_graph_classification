package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch = '0';
		char[][] a = new char[202][100];
		String b = new String(new char[100]);
		String max = new String(new char[100]);
		String min = new String(new char[100]);
		int i = 0;
		int j = 0;
		while (true)
		{
		   while (true)
		   {
			  String tempVar = ConsoleInput.scanfRead(null, 1);
			  if (tempVar != null)
			  {
				  ch = tempVar.charAt(0);
			  }
			  if (ch == ' ' || ch == '\n')
			  {
				  break;
			  }
			 else
			 {
				 b = tangible.StringFunctions.changeCharacter(b, i++, ch);
			 }
		   }
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			i = 0;

			 a[j++] = b;
			 if (ch == '\n')
			 {
				 break;
			 }

		}
		max = a[0];
		min = a[0];
		for (i = 1;i < j;i++)
		{
			if (String.valueOf(a[i]).length() > max.length())
			{
				max = a[i];
			}
			if (String.valueOf(a[i]).length() < min.length())
			{
				min = a[i];
			}

		}
		 System.out.printf("%s\n",max);
			System.out.printf("%s\n",min);

	}
}

