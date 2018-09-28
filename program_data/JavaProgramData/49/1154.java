package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	String a = new String(new char[100001]);
	int length;
	int i;
	int j;
	int len;
	int check;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	len = a.length();
		for (length = 2;length <= len;length++)
		{
			  for (i = 0;i < len;i++)
			  {
				  check = 0;
				   for (j = 0;j <= length / 2;j++)
				   {
						   if (a.charAt(i + j) != a.charAt(i + length - 1 - j))
						   {
							 check = 1;
							 break;
						   }

				   }
				   if (check == 0)
				   {
					  for (t = 0;t < length;t++)
					  {
						  System.out.printf("%c",a.charAt(i + t));
					  }
				   }
			  System.out.print("\n");
			  }

		}
	return 0;
	}

}

