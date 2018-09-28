package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String string = new String(new char[101]);
		 String a = new String(new char[101]);
		 int i;
		 int l;
		 int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				String = tempVar;
			}
			l = String.length();
			if (l == 1)
			{
			  System.out.print("0\n");
			  System.out.printf("%d\n",string.charAt(0) - '0');
			}
			else if (l == 2)
			{
				if (((String[0] - '0') * 10 + (String[1] - '0')) < 13)
				{
				   System.out.print("0\n");
				   System.out.printf("%d",string.charAt(0) - '0');
				   System.out.printf("%d\n",string.charAt(1) - '0');
				}
				else
				{
				   System.out.printf("%d\n",((String[0] - '0') * 10 + (String[1] - '0')) / 13);
				   System.out.printf("%d\n",((String[0] - '0') * 10 + (String[1] - '0')) % 13);
				}
			}
			else
			{

			if (((String[0] - '0') * 10 + (String[1] - '0')) < 13)
			{
				a = tangible.StringFunctions.changeCharacter(a, 0, ((String[0] - '0') * 100 + (String[1] - '0') * 10 + (String[2] - '0')) / 13);
				System.out.printf("%d",a.charAt(0));
				String[2] = ((String[0] - '0') * 100 + (String[1] - '0') * 10 + (String[2] - '0')) % 13 + '0';
				for (j = 2;j < l - 1;j++)
				{
				   a = tangible.StringFunctions.changeCharacter(a, j - 1, ((String[j] - '0') * 10 + string.charAt(j + 1) - '0') / 13);
				   String[j + 1] = ((String[j] - '0') * 10 + (String[j + 1] - '0')) % 13 + '0';
				   System.out.printf("%d",a.charAt(j - 1));
				}
				System.out.print("\n");
				System.out.printf("%d\n",(String[l - 1] - '0'));
			}
			else
			{
				for (j = 0;j < l - 1;j++)
				{
				   a = tangible.StringFunctions.changeCharacter(a, j, ((String[j] - '0') * 10 + (String[j + 1] - '0')) / 13);
				   String[j + 1] = ((String[j] - '0') * 10 + (String[j + 1] - '0')) % 13 + '0';
				   System.out.printf("%d",a.charAt(j));
				}
				System.out.print("\n");
				System.out.printf("%d\n",(String[l - 1] - '0'));
			}
			}

		 System.in.read();
		 System.in.read();
	}

}

